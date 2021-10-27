package com.example.servicemaster.activities.checkinforms;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.servicemaster.R;
import com.example.servicemaster.roomdatabases.DatabaseConfig;
import com.example.servicemaster.roomdatabases.entities.Form4Entity;
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

        rearViewMirror = findViewById(R.id.rearViewMirrorEditText);
        rearViewMirrorCheckbox = findViewById(R.id.rearViewMirrorCheckbox);

        windowSwitches = findViewById(R.id.windowSwitchesEditText);
        windowSwitchesCheckbox = findViewById(R.id.windowSwitchesCheckbox);

        floorMatsCarpet = findViewById(R.id.floorMatsCarpetEditText);
        floorMatsCarpetCheckbox = findViewById(R.id.floorMatsCarpetCheckbox);

        dashboard = findViewById(R.id.dashboardEditText);
        dashboardCheckbox  = findViewById(R.id.dashboardCheckbox);

        engineSensorsAndFuses = findViewById(R.id.engineSensorsAndFusesEditText);
        engineSensorsAndFusesCheckbox = findViewById(R.id.engineSensorsAndFusesCheckbox);

        washerBottle = findViewById(R.id.washerBottleEditText);
        washerBottleCheckbox = findViewById(R.id.washerBottleCheckbox);

        cigarLighter = findViewById(R.id.cigarLighterEditText);
        cigarLighterCheckbox = findViewById(R.id.cigarLighterCheckbox);

        speaker = findViewById(R.id.speakerEditText);
        speakerCheckbox = findViewById(R.id.speakerCheckbox);

        radioCassetteCD = findViewById(R.id.radioCassetteCdEditText);
        radioCassetteCDCheckbox = findViewById(R.id.radioCassetteCdCheckbox);

        engineCompartment = findViewById(R.id.engineCompartmentEditText);
        engineCompartmentCheckbox = findViewById(R.id.engineCompartmentCheckbox);

        computerBox = findViewById(R.id.computerBoxEditText);
        computerBoxCheckbox = findViewById(R.id.computerBoxCheckbox);

        horn = findViewById(R.id.hornEditText);
        hornCheckbox = findViewById(R.id.hornCheckbox);

        databaseConfig = DatabaseConfig.databaseGetInstance(Form4Activity.this);

        int id = databaseConfig.form4Dao().getLastID();


        if(databaseConfig.form4Dao().getData(id)){
            Form4Entity form4Entity = databaseConfig.form4Dao().getRow(id);
            rearViewMirror.setText(form4Entity.getRearViewMirrorRemarks());
            rearViewMirrorCheckbox.setChecked(form4Entity.isRearViewMirrorCheckbox());

            windowSwitches.setText(form4Entity.getWindowSwitchesRemarks());
            windowSwitchesCheckbox.setChecked(form4Entity.isWindowSwitchesCheckbox());

            floorMatsCarpet.setText(form4Entity.getFloorMatsCarpetRemarks());
            floorMatsCarpetCheckbox.setChecked(form4Entity.isFloorMatsCarpetCheckbox());

            dashboard.setText(form4Entity.getDashboardRemarks());
            dashboardCheckbox.setChecked(form4Entity.isDashboardCheckbox());

            engineSensorsAndFuses.setText(form4Entity.getEngineSensorsAndFusesRemarks());
            engineSensorsAndFusesCheckbox.setChecked(form4Entity.isEngineSensorsAndFusesCheckbox());

            washerBottle.setText(form4Entity.getWasherBottlesRemarks());
            washerBottleCheckbox.setChecked(form4Entity.isWasherBottlesCheckbox());

            cigarLighter.setText(form4Entity.getCigarLighterRemarks());
            cigarLighterCheckbox.setChecked(form4Entity.isCigarLighterCheckbox());

            speaker.setText(form4Entity.getSpeakerRemarks());
            speakerCheckbox.setChecked(form4Entity.isSpeakerCheckbox());

            radioCassetteCD.setText(form4Entity.getRadioCassetteCdRemarks());
            radioCassetteCDCheckbox.setChecked(form4Entity.isRadioCassetteCdCheckbox());

            engineCompartment.setText(form4Entity.getEngineCompartmentRemarks());
            engineCompartmentCheckbox.setChecked(form4Entity.isEngineCompartmentCheckbox());

            computerBox.setText(form4Entity.getComputerBoxRemarks());
            computerBoxCheckbox.setChecked(form4Entity.isComputerBoxCheckbox());

            horn.setText(form4Entity.getHornRemarks());
            hornCheckbox.setChecked(form4Entity.isHornCheckbox());

        }


        FloatingActionButton floatingActionButton4 = findViewById(R.id.floatingActionButton3);

        floatingActionButton4.setOnClickListener(view -> {
            databaseConfig.form4Dao().insertData(new Form4Entity(rearViewMirror.getText().toString(), rearViewMirrorCheckbox.isChecked(),
                    windowSwitches.getText().toString(), windowSwitchesCheckbox.isChecked(),
                    floorMatsCarpet.getText().toString(), floorMatsCarpetCheckbox.isChecked(),
                    dashboard.getText().toString(), dashboardCheckbox.isChecked(),
                    engineSensorsAndFuses.getText().toString(), engineSensorsAndFusesCheckbox.isChecked(),
                    washerBottle.getText().toString(), washerBottleCheckbox.isChecked(),
                    cigarLighter.getText().toString(), cigarLighterCheckbox.isChecked(),
                    speaker.getText().toString(), speakerCheckbox.isChecked(),
                    radioCassetteCD.getText().toString(), radioCassetteCDCheckbox.isChecked(),
                    engineCompartment.getText().toString(), engineCompartmentCheckbox.isChecked(),
                    computerBox.getText().toString(), computerBoxCheckbox.isChecked(),
                    horn.getText().toString(), hornCheckbox.isChecked()));
            Intent i = new Intent(Form4Activity.this, Form5Activity.class);
            startActivity(i);
            finish();
        });

        ImageView imageView = findViewById(R.id.backButtonForm4);

        imageView.setOnClickListener(view -> {
            Intent i = new Intent(Form4Activity.this, Form3Activity.class);
            startActivity(i);
            finish();
        });
    }
}