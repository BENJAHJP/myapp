package com.example.servicemaster.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import com.example.servicemaster.R;
import com.example.servicemaster.activities.checkinforms.Form1Activity;
import com.google.android.material.card.MaterialCardView;

public class DashboardActivity extends AppCompatActivity {

    MaterialCardView checkInCardButton, activeCardButton, completedCardButton;
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        checkInCardButton =  findViewById(R.id.checkinCardButton);
        activeCardButton =  findViewById(R.id.activeCardButton);
        completedCardButton = findViewById(R.id.completedCardButton);
        imageButton = findViewById(R.id.logoutButton);

        imageButton.setOnClickListener(view -> {
            Intent i = new Intent(DashboardActivity.this, LoginActivity.class);
            startActivity(i);
            finish();
        });

        checkInCardButton.setOnClickListener(view -> {
            Intent i = new Intent(DashboardActivity.this, Form1Activity.class);
            i.putExtra("id",0);
            startActivity(i);
        });

        activeCardButton.setOnClickListener(view -> {
            Intent i = new Intent(DashboardActivity.this, ActiveActivity.class);
            startActivity(i);
        });

        completedCardButton.setOnClickListener(view -> {
            Intent i = new Intent(DashboardActivity.this, CompletedActivity.class);
            startActivity(i);
        });
    }
}