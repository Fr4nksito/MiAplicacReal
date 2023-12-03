package com.example.miaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenDaltonic extends AppCompatActivity {
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen_daltonic);
        handler = new Handler();
        handler.postDelayed(() -> {
            Intent intent = new Intent(
                    getApplicationContext(),
                    MainActivity.class
            );
            startActivity(intent);
            finish();
        }, 4000);
    }
}