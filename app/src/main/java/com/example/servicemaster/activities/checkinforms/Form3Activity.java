package com.example.servicemaster.activities.checkinforms;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.servicemaster.R;
import com.example.servicemaster.roomdatabases.DatabaseConfig;
import com.example.servicemaster.roomdatabases.entities.Form3Entity;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Form3Activity extends AppCompatActivity {

    DatabaseConfig databaseConfig;
    ImageView imageView;
    FloatingActionButton floatingActionButton3;

    EditText overallAppearance, sideMirrors, noOfKeys, fogSpotLights, antennaAerial, regNoPlateFront, frontBumper,
    fuelTankCap, frontWindScreen, rearWindScreen, headLightsLenses, tailLightsLenses, wipers, regNoPlateRear,
    rearBumper;

    MaterialCheckBox overallAppearanceCheckbox, sideMirrorsCheckbox, noOfKeysCheckbox, fogSpotLightsCheckbox
            , antennaAerialCheckbox, regNoPlateFrontCheckbox, frontBumperCheckbox,
            fuelTankCapCheckbox, frontWindScreenCheckbox, rearWindScreenCheckbox
            , headLightsLensesCheckbox, tailLightsLensesCheckbox, wipersCheckbox
            , regNoPlateRearCheckbox, rearBumperCheckbox;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form3);

        databaseConfig = DatabaseConfig.databaseGetInstance(Form3Activity.this);

        overallAppearance = (EditText) findViewById(R.id.overallAppearanceEditText);
        overallAppearanceCheckbox = (MaterialCheckBox) findViewById(R.id.overallAppearanceCheckbox);
        overallAppearanceCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                int checked = 0;
                if(isChecked){
                    checked = 1;
                }
            }
        });

        sideMirrors = (EditText) findViewById(R.id.sideMirrorsEditText);
        sideMirrorsCheckbox = (MaterialCheckBox) findViewById(R.id.sideMirrorsCheckbox);
        sideMirrorsCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                int checked = 0;
                if(isChecked){
                    checked = 1;
                }
            }
        });

        noOfKeys = (EditText) findViewById(R.id.noOfKeysEditText);
        noOfKeysCheckbox = (MaterialCheckBox) findViewById(R.id.noOfKeysCheckbox);

        fogSpotLights = (EditText) findViewById(R.id.fogSpotLightsEditText);
        fogSpotLightsCheckbox = (MaterialCheckBox) findViewById(R.id.fogSpotLightsCheckbox);

        antennaAerial = (EditText) findViewById(R.id.antennaAerialEditText);
        antennaAerialCheckbox = (MaterialCheckBox) findViewById(R.id.antennaAerialCheckbox);

        regNoPlateFront = (EditText) findViewById(R.id.regNoPlateFrontEditText);
        regNoPlateFrontCheckbox = (MaterialCheckBox) findViewById(R.id.regNoPlateFrontCheckbox);

        frontBumper = (EditText) findViewById(R.id.frontBumperEditText);
        frontBumperCheckbox = (MaterialCheckBox) findViewById(R.id.frontBumperCheckbox);

        fuelTankCap = (EditText) findViewById(R.id.fuelTankCapEditText);
        fuelTankCapCheckbox = (MaterialCheckBox) findViewById(R.id.fuelTankCapCheckbox);

        frontWindScreen = (EditText) findViewById(R.id.frontWindscreenEditText);
        frontWindScreenCheckbox = (MaterialCheckBox) findViewById(R.id.frontWindscreenCheckbox);

        rearWindScreen = (EditText) findViewById(R.id.rearWindscreenEditText);
        rearWindScreenCheckbox = (MaterialCheckBox) findViewById(R.id.rearWindscreenCheckbox);

        headLightsLenses = (EditText) findViewById(R.id.headLightsLensesEditText);
        headLightsLensesCheckbox = (MaterialCheckBox) findViewById(R.id.headLightsLensesCheckbox);

        tailLightsLenses = (EditText) findViewById(R.id.tailLightsLensesEditText);
        tailLightsLensesCheckbox = (MaterialCheckBox) findViewById(R.id.tailLightsLensesCheckbox);

        wipers = (EditText) findViewById(R.id.wipersEditText);
        wipersCheckbox = (MaterialCheckBox) findViewById(R.id.wipersCheckbox);

        regNoPlateRear = (EditText) findViewById(R.id.regNoPlateRearEditText);
        regNoPlateRearCheckbox = (MaterialCheckBox) findViewById(R.id.regNoPlateRearCheckbox);

        rearBumper = (EditText) findViewById(R.id.rearBumperEditText);
        rearBumperCheckbox = (MaterialCheckBox) findViewById(R.id.rearBumperCheckbox);

        floatingActionButton3 = (FloatingActionButton) findViewById(R.id.floatingActionButton3);

        int id = getIntent().getExtras().getInt("id");

        if(databaseConfig.form3Dao().getData(id)){
            Form3Entity form3Entity = databaseConfig.form3Dao().getRow(id);
            overallAppearance.setText(form3Entity.getOverallAppearanceRemarks());
            overallAppearanceCheckbox.isChecked();
            sideMirrors.setText(form3Entity.getSideMirrorsRemarks());
            sideMirrorsCheckbox.isChecked();
            noOfKeys.setText(form3Entity.getNoOfKeysRemarks());
            noOfKeysCheckbox.isChecked();
            fogSpotLights.setText(form3Entity.getFogSpotLightsRemarks());
            fogSpotLightsCheckbox.isChecked();
            antennaAerial.setText(form3Entity.getAntennaAerialRemarks());
            antennaAerialCheckbox.isChecked();
            regNoPlateFront.setText(form3Entity.getRegNoPlateFrontRemarks());
            regNoPlateFrontCheckbox.isChecked();
            frontBumper.setText(form3Entity.getFrontBumperRemarks());
            frontBumperCheckbox.isChecked();
            fuelTankCap.setText(form3Entity.getFuelTankCapRemarks());
            fuelTankCapCheckbox.isChecked();
            frontWindScreen.setText(form3Entity.getFrontWindScreenRemarks());
            frontWindScreenCheckbox.isChecked();
            rearWindScreen.setText(form3Entity.getRearWindScreenRemarks());
            rearWindScreenCheckbox.isChecked();
            headLightsLenses.setText(form3Entity.getHeadLightsLensesRemarks());
            headLightsLensesCheckbox.isChecked();
            tailLightsLenses.setText(form3Entity.getTailLightsLensesRemarks());
            tailLightsLensesCheckbox.isChecked();
            wipers.setText(form3Entity.getWipersLensesRemarks());
            wipersCheckbox.isChecked();
            regNoPlateRear.setText(form3Entity.getRegNumberPlateRearRemarks());
            regNoPlateRearCheckbox.isChecked();
            rearBumper.setText(form3Entity.getRearBumperRearRemarks());
            rearBumperCheckbox.isChecked();
        }

        floatingActionButton3.setOnClickListener(view -> {
            databaseConfig.form3Dao().insertData(new Form3Entity(overallAppearance.getText().toString(), Integer.parseInt(String.valueOf(overallAppearanceCheckbox.isChecked())),
                    sideMirrors.getText().toString(), Integer.parseInt(String.valueOf(sideMirrorsCheckbox.isChecked())),
                    noOfKeys.getText().toString(),Integer.parseInt(String.valueOf(noOfKeysCheckbox.isChecked())),
                    fogSpotLights.getText().toString(), Integer.parseInt(String.valueOf(fogSpotLightsCheckbox.isChecked())),
                    antennaAerial.getText().toString(), Integer.parseInt(String.valueOf(antennaAerialCheckbox.isChecked())),
                    regNoPlateFront.getText().toString(), Integer.parseInt(String.valueOf(regNoPlateFrontCheckbox.isChecked())),
                    frontBumper.getText().toString(), Integer.parseInt(String.valueOf(frontBumperCheckbox.isChecked())),
                    fuelTankCap.getText().toString(), Integer.parseInt(String.valueOf(fuelTankCapCheckbox.isChecked())),
                    frontWindScreen.getText().toString(), Integer.parseInt(String.valueOf(frontWindScreenCheckbox.isChecked())),
                    rearWindScreen.getText().toString(), Integer.parseInt(String.valueOf(rearWindScreenCheckbox.isChecked())),
                    headLightsLenses.getText().toString(), Integer.parseInt(String.valueOf(headLightsLensesCheckbox.isChecked())),
                    tailLightsLenses.getText().toString(), Integer.parseInt(String.valueOf(tailLightsLensesCheckbox.isChecked())),
                    wipers.getText().toString(), Integer.parseInt(String.valueOf(wipersCheckbox.isChecked())),
                    regNoPlateRear.getText().toString(), Integer.parseInt(String.valueOf(regNoPlateRearCheckbox.isChecked())),
                    rearBumper.getText().toString(), Integer.parseInt(String.valueOf(rearBumperCheckbox.isChecked()))
                    ));
            Intent i = new Intent(Form3Activity.this, Form4Activity.class);
            startActivity(i);
            finish();
        });

        imageView = (ImageView) findViewById(R.id.backButtonForm3);

        imageView.setOnClickListener(view -> {
            Intent i = new Intent(Form3Activity.this, Form2Activity.class);
            i.putExtra("id", id);
            startActivity(i);
            finish();
        });
    }
}