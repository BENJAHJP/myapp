package com.example.servicemaster.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.servicemaster.R;
import com.example.servicemaster.activities.checkinforms.Form1Activity;
import com.google.android.material.card.MaterialCardView;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        MaterialCardView checkinCardButton = (MaterialCardView) findViewById(R.id.checkinCardButton);
        MaterialCardView activeCardButton = (MaterialCardView) findViewById(R.id.activeCardButton);
        MaterialCardView completedCardButton = (MaterialCardView) findViewById(R.id.completedCardButton);

        checkinCardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DashboardActivity.this, Form1Activity.class);
                startActivity(i);
            }
        });

        activeCardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DashboardActivity.this, ActiveActivity.class);
                startActivity(i);
            }
        });

        completedCardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DashboardActivity.this, CompletedActivity.class);
                startActivity(i);
            }
        });
    }
}