package com.example.servicemaster.activities.checkinforms;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.servicemaster.R;
import com.example.servicemaster.roomdatabases.DatabaseConfig;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;

public class Form8Activity extends AppCompatActivity {

    DatabaseConfig databaseConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form8);


        databaseConfig = DatabaseConfig.databaseGetInstance(Form8Activity.this);

        ImageView imageView = findViewById(R.id.backButtonForm8);

        imageView.setOnClickListener(view -> {
            Intent i = new Intent(Form8Activity.this, Form7Activity.class);
            startActivity(i);
            finish();
        });

        MaterialButton submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(view -> {
            MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(Form8Activity.this);

            materialAlertDialogBuilder.setTitle("Are you sure you want to submit?");
            materialAlertDialogBuilder.setPositiveButton("Yes", (dialogInterface, i) -> {
                Snackbar snackbar = Snackbar.make(view,"Uploaded successfully",Snackbar.LENGTH_LONG);
                snackbar.show();
            });
            materialAlertDialogBuilder.setNegativeButton("No", (dialogInterface, i) -> {

            });
            materialAlertDialogBuilder.show();
        });
    }
}