package com.cifpceuta.appsplashscren;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() { // Creamos un Handler que ejecutará un hilo que tendrá un pequeño retraso
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this, MainActivity.class)); // Tras el retraso establecido se cambiará a la ActivityMain
                finish(); // Se finaliza la Activity del Splash Screen
            }
        },2500); // Retraso de 2,5 Segundos
    }
}