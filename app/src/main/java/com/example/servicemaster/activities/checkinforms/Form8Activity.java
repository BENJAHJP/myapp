package com.example.servicemaster.activities.checkinforms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.servicemaster.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;

public class Form8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form8);

        ImageView imageView = (ImageView) findViewById(R.id.backButtonForm8);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Form8Activity.this, Form7Activity.class);
                startActivity(i);
                finish();
            }
        });

        MaterialButton submitButton = (MaterialButton) findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(Form8Activity.this);

                materialAlertDialogBuilder.setTitle("Are you sure you want to submit?");
                materialAlertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Snackbar snackbar = Snackbar.make(view,"Uploaded successfully",Snackbar.LENGTH_LONG);
                        snackbar.show();
                    }
                });
                materialAlertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                materialAlertDialogBuilder.show();
            }
        });
    }
}