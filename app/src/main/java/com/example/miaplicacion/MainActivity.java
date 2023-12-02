package com.example.miaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
ImageButton imageboton;
Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageboton = findViewById(R.id.btnCamara);
        imageboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        PantallaCAMARA.class
                );
                startActivity(intent);
            }
        });
        boton = findViewById(R.id.btnGPS);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent intent = new Intent(
                    getApplicationContext(),
                    GPSGoogle.class
            );
            startActivity(intent);
            }
        });
    }
}