package com.example.miaplicacion;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.palette.graphics.Palette;


import com.google.firebase.firestore.FirebaseFirestore;

import java.io.IOException;

public class PantallaCAMARA extends AppCompatActivity {
Button selectImageButton;
    TextView colorTextView;

    private static final int PICK_IMAGE_REQUEST = 1;
    private static final int STORAGE_PERMISSION_CODE = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_camara);

        colorTextView = findViewById(R.id.colorTextView);
      selectImageButton = findViewById(R.id.selectImageButton);

        // Solicitar permiso de almacenamiento si aún no se ha otorgado
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                    STORAGE_PERMISSION_CODE);
        }

        selectImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_PICK);
            intent.setType("image/*");
            startActivityForResult(intent, PICK_IMAGE_REQUEST);
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK) {
            try {
                Uri imageUri = data.getData();
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), imageUri);

                Palette.from(bitmap).generate(palette -> {
                    Palette.Swatch dominantSwatch = palette.getDominantSwatch();
                    if (dominantSwatch != null) {
                        int color = dominantSwatch.getRgb();
                        colorTextView.setBackgroundColor(color);

                        // Convertir RGB a HEX
                        String hexColor = ColorNameMapper.rgbToHex(color);

                        // Obtener el nombre aproximado del color
                        String closestColorName = ColorNameMapper.getClosestColorName(color);
                        colorTextView.setText(closestColorName + " (" + hexColor + ")");

                        // Guardar en Firebase
                        saveColorToFirebase(closestColorName, hexColor);
                    }
                });
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // Manejar la respuesta de solicitud de permiso
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == STORAGE_PERMISSION_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // Permiso concedido, puedes continuar con la funcionalidad
            } else {
                // Permiso denegado, puedes mostrar un mensaje o tomar medidas adecuadas
            }
        }
    }
    private void saveColorToFirebase(String colorName, String hexValue) {
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        ColorHistoryItem item = new ColorHistoryItem(colorName, hexValue, System.currentTimeMillis());
        db.collection("colorHistory").add(item)
                .addOnSuccessListener(documentReference -> Log.d("Firebase", "DocumentSnapshot added with ID: " + documentReference.getId()))
                .addOnFailureListener(e -> Log.w("Firebase", "Error adding document", e));
    }

}