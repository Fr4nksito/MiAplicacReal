package com.example.miaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
ImageButton imageboton;
//Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageboton = findViewById(R.id.btnCamara);
        imageboton.setOnClickListener(view -> {
            Intent intent = new Intent(
                    getApplicationContext(),
                    PantallaCAMARA.class
            );
            startActivity(intent);
        });

        imageboton = findViewById(R.id.btnGPS);
        imageboton.setOnClickListener(view -> {
        Intent intent = new Intent(
                getApplicationContext(),
                GPSGoogle.class
        );
        startActivity(intent);
        });

        imageboton = findViewById(R.id.btnHistorial);
        imageboton.setOnClickListener(view -> {
            Intent intent = new Intent(
                    getApplicationContext(),
                    Historial.class
            );
            startActivity(intent);
        });
    }
}