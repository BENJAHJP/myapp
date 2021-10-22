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

public class Form4Activity extends AppCompatActivity {

    EditText rearViewMirror, windowSwitches, floorMatsCarpet, dashboard, engineSensorsAndFuses, washerBottle,
            cigarLighter, speaker, radioCassetteCD, engineCompartment, computerBox, horn;

    MaterialCheckBox rearViewMirrorCheckbox, windowSwitchesCheckbox, floorMatsCarpetCheckbox,
            dashboardCheckbox, engineSensorsAndFusesCheckbox, washerBottleCheckbox,
            cigarLighterCheckbox, speakerCheckbox, radioCassetteCDCheckbox, engineCompartmentCheckbox,
            computerBoxCheckbox, hornCheckbox;

    DatabaseConfig databaseConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form4);

        rearViewMirror = (EditText) findViewById(R.id.rearBumperEditText);
        rearViewMirror = (EditText) findViewById(R.id.rearBumperCheckbox);

        windowSwitches = (EditText) findViewById(R.id.windowSwitchesEditText);
        windowSwitchesCheckbox = (MaterialCheckBox) findViewById(R.id.windowSwitchesCheckbox);

        floorMatsCarpet = (EditText) findViewById(R.id.floorMatsCarpetEditText);
        floorMatsCarpetCheckbox = (MaterialCheckBox) findViewById(R.id.floorMatsCarpetCheckbox);

        dashboard = (EditText) findViewById(R.id.dashboardEditText);
        dashboardCheckbox  = (MaterialCheckBox) findViewById(R.id.dashboardCheckbox);

        engineSensorsAndFuses = (EditText) findViewById(R.id.engineSensorsAndFusesEditText);
        engineSensorsAndFusesCheckbox = (MaterialCheckBox) findViewById(R.id.engineSensorsAndFusesCheckbox);

        washerBottle = (EditText) findViewById(R.id.washerBottleEditText);
        washerBottleCheckbox = (MaterialCheckBox) findViewById(R.id.washerBottleCheckbox);

        cigarLighter = (EditText) findViewById(R.id.cigarLighterEditText);
        cigarLighterCheckbox = (MaterialCheckBox) findViewById(R.id.cigarLighterCheckbox);

        speaker = (EditText) findViewById(R.id.speakerEditText);
        speakerCheckbox = (MaterialCheckBox) findViewById(R.id.speakerCheckbox);

        radioCassetteCD = (EditText) findViewById(R.id.radioCassetteCdEditText);
        radioCassetteCDCheckbox = (MaterialCheckBox) findViewById(R.id.radioCassetteCdCheckbox);

        engineCompartment = (EditText) findViewById(R.id.engineCompartmentEditText);
        engineCompartmentCheckbox = (MaterialCheckBox) findViewById(R.id.engineCompartmentCheckbox);

        computerBox = (EditText) findViewById(R.id.computerBoxEditText);
        computerBoxCheckbox = (MaterialCheckBox) findViewById(R.id.computerBoxCheckbox);

        horn = (EditText) findViewById(R.id.hornEditText);
        hornCheckbox = (MaterialCheckBox) findViewById(R.id.hornCheckbox);

        databaseConfig = DatabaseConfig.databaseGetInstance(Form4Activity.this);


        FloatingActionButton floatingActionButton4 = (FloatingActionButton) findViewById(R.id.floatingActionButton3);

        floatingActionButton4.setOnClickListener(view -> {
            Intent i = new Intent(Form4Activity.this, Form5Activity.class);
            startActivity(i);
            finish();
        });

        ImageView imageView = (ImageView) findViewById(R.id.backButtonForm4);

        imageView.setOnClickListener(view -> {
            Intent i = new Intent(Form4Activity.this, Form3Activity.class);
            startActivity(i);
            finish();
        });
    }
}