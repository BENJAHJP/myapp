package com.example.servicemaster.activities.checkinforms;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.servicemaster.R;
import com.example.servicemaster.roomdatabases.DatabaseConfig;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Form5Activity extends AppCompatActivity {

    DatabaseConfig databaseConfig;

    EditText wheelsRims, wheelsCapsHubs, mudFlap, steeringWheel;

    MaterialCheckBox wheelsRimsCheckbox, wheelsCapsHubsCheckbox, mudFlapCheckbox, steeringWheelCheckbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form5);

        wheelsRims = (EditText) findViewById(R.id.wheelsRimsEditText);
        wheelsRimsCheckbox = (MaterialCheckBox) findViewById(R.id.wheelsRimsCheckbox);

        wheelsCapsHubs = (EditText) findViewById(R.id.wheelsCapsHubsEditText);
        wheelsCapsHubsCheckbox = (MaterialCheckBox) findViewById(R.id.wheelsCapsHubsCheckbox);

        mudFlap = (EditText) findViewById(R.id.mudflapEditText);
        mudFlapCheckbox = (MaterialCheckBox) findViewById(R.id.mudflapCheckbox);

        steeringWheel = (EditText) findViewById(R.id.steeringWheelEditText);
        steeringWheelCheckbox = (MaterialCheckBox) findViewById(R.id.steeringWheelCheckbox);

        databaseConfig = DatabaseConfig.databaseGetInstance(Form5Activity.this);


        FloatingActionButton floatingActionButton5 = (FloatingActionButton) findViewById(R.id.floatingActionButton5);

        floatingActionButton5.setOnClickListener(view -> {
            Intent i = new Intent(Form5Activity.this, Form6Activity.class);
            startActivity(i);
            finish();
        });

        ImageView imageView = (ImageView) findViewById(R.id.backButtonForm5);

        imageView.setOnClickListener(view -> {
            Intent i = new Intent(Form5Activity.this, Form4Activity.class);
            startActivity(i);
            finish();
        });
    }
}