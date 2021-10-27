package com.example.servicemaster.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.servicemaster.R;

public class SplashScreenActivity extends AppCompatActivity {

    TextView splashScreenLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        splashScreenLogo = findViewById(R.id.splashscreenLogo);

        Animation a = AnimationUtils.loadAnimation(SplashScreenActivity.this, R.anim.splashscreenmove);

        splashScreenLogo.startAnimation(a);
        Handler handler = new Handler();
        handler.postDelayed(() -> {
            Intent i = new Intent(SplashScreenActivity.this, LoginActivity.class);
            startActivity(i);
            finish();
        }, 5000);
    }
}