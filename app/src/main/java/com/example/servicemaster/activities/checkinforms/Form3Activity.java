package com.example.servicemaster.activities.checkinforms;

import android.content.Intent;
import android.os.Bundle;
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

        overallAppearance = findViewById(R.id.overallAppearanceEditText);
        overallAppearanceCheckbox = findViewById(R.id.overallAppearanceCheckbox);

        sideMirrors = findViewById(R.id.sideMirrorsEditText);
        sideMirrorsCheckbox = findViewById(R.id.sideMirrorsCheckbox);

        noOfKeys = findViewById(R.id.noOfKeysEditText);
        noOfKeysCheckbox = findViewById(R.id.noOfKeysCheckbox);

        fogSpotLights = findViewById(R.id.fogSpotLightsEditText);
        fogSpotLightsCheckbox = findViewById(R.id.fogSpotLightsCheckbox);

        antennaAerial = findViewById(R.id.antennaAerialEditText);
        antennaAerialCheckbox = findViewById(R.id.antennaAerialCheckbox);

        regNoPlateFront = findViewById(R.id.regNoPlateFrontEditText);
        regNoPlateFrontCheckbox = findViewById(R.id.regNoPlateFrontCheckbox);

        frontBumper = findViewById(R.id.frontBumperEditText);
        frontBumperCheckbox = findViewById(R.id.frontBumperCheckbox);

        fuelTankCap = findViewById(R.id.fuelTankCapEditText);
        fuelTankCapCheckbox = findViewById(R.id.fuelTankCapCheckbox);

        frontWindScreen = findViewById(R.id.frontWindscreenEditText);
        frontWindScreenCheckbox = findViewById(R.id.frontWindscreenCheckbox);

        rearWindScreen = findViewById(R.id.rearWindscreenEditText);
        rearWindScreenCheckbox = findViewById(R.id.rearWindscreenCheckbox);

        headLightsLenses = findViewById(R.id.headLightsLensesEditText);
        headLightsLensesCheckbox = findViewById(R.id.headLightsLensesCheckbox);

        tailLightsLenses = findViewById(R.id.tailLightsLensesEditText);
        tailLightsLensesCheckbox = findViewById(R.id.tailLightsLensesCheckbox);

        wipers = findViewById(R.id.wipersEditText);
        wipersCheckbox = findViewById(R.id.wipersCheckbox);

        regNoPlateRear = findViewById(R.id.regNoPlateRearEditText);
        regNoPlateRearCheckbox = findViewById(R.id.regNoPlateRearCheckbox);

        rearBumper = findViewById(R.id.rearBumperEditText);
        rearBumperCheckbox = findViewById(R.id.rearBumperCheckbox);

        floatingActionButton3 = findViewById(R.id.floatingActionButton3);


        int id = databaseConfig.form3Dao().getLastID();

        if(databaseConfig.form3Dao().getData(id)){
            Form3Entity form3Entity = databaseConfig.form3Dao().getRow(id);
            overallAppearance.setText(form3Entity.getOverallAppearanceRemarks());
            overallAppearanceCheckbox.setChecked(form3Entity.isOverallAppearanceCheckbox());
            sideMirrors.setText(form3Entity.getSideMirrorsRemarks());
            sideMirrorsCheckbox.setChecked(form3Entity.isSideMirrorsCheckbox());
            noOfKeys.setText(form3Entity.getNoOfKeysRemarks());
            noOfKeysCheckbox.setChecked(form3Entity.isNoOfKeysCheckbox());
            fogSpotLights.setText(form3Entity.getFogSpotLightsRemarks());
            fogSpotLightsCheckbox.setChecked(form3Entity.isFogSpotLightsCheckbox());
            antennaAerial.setText(form3Entity.getAntennaAerialRemarks());
            antennaAerialCheckbox.setChecked(form3Entity.isAntennaAerialCheckbox());
            regNoPlateFront.setText(form3Entity.getRegNoPlateFrontRemarks());
            regNoPlateFrontCheckbox.setChecked(form3Entity.isRegNoPlateFrontCheckbox());
            frontBumper.setText(form3Entity.getFrontBumperRemarks());
            frontBumperCheckbox.setChecked(form3Entity.isFrontBumperCheckbox());
            fuelTankCap.setText(form3Entity.getFuelTankCapRemarks());
            fuelTankCapCheckbox.setChecked(form3Entity.isFuelTankCapCheckbox());
            frontWindScreen.setText(form3Entity.getFrontWindScreenRemarks());
            frontWindScreenCheckbox.setChecked(form3Entity.isFrontWindScreenCheckbox());
            rearWindScreen.setText(form3Entity.getRearWindScreenRemarks());
            rearWindScreenCheckbox.setChecked(form3Entity.isRearWindScreenCheckbox());
            headLightsLenses.setText(form3Entity.getHeadLightsLensesRemarks());
            headLightsLensesCheckbox.setChecked(form3Entity.isHeadLightsCheckbox());
            tailLightsLenses.setText(form3Entity.getTailLightsLensesRemarks());
            tailLightsLensesCheckbox.setChecked(form3Entity.isTailLightsCheckbox());
            wipers.setText(form3Entity.getWipersLensesRemarks());
            wipersCheckbox.setChecked(form3Entity.isWiperLensesCheckbox());
            regNoPlateRear.setText(form3Entity.getRegNumberPlateRearRemarks());
            regNoPlateRearCheckbox.setChecked(form3Entity.isRegNumberPlateRearCheckbox());
            rearBumper.setText(form3Entity.getRearBumperRearRemarks());
            rearBumperCheckbox.setChecked(form3Entity.isRearBumperCheckbox());
        }

        floatingActionButton3.setOnClickListener(view -> {
            databaseConfig.form3Dao().insertData(new Form3Entity(overallAppearance.getText().toString(), overallAppearanceCheckbox.isChecked(),
                    sideMirrors.getText().toString(), sideMirrorsCheckbox.isChecked(),
                    noOfKeys.getText().toString(), noOfKeysCheckbox.isChecked(),
                    fogSpotLights.getText().toString(), fogSpotLightsCheckbox.isChecked(),
                    antennaAerial.getText().toString(), antennaAerialCheckbox.isChecked(),
                    regNoPlateFront.getText().toString(), regNoPlateFrontCheckbox.isChecked(),
                    frontBumper.getText().toString(), frontBumperCheckbox.isChecked(),
                    fuelTankCap.getText().toString(), fuelTankCapCheckbox.isChecked(),
                    frontWindScreen.getText().toString(), frontWindScreenCheckbox.isChecked(),
                    rearWindScreen.getText().toString(), rearWindScreenCheckbox.isChecked(),
                    headLightsLenses.getText().toString(), headLightsLensesCheckbox.isChecked(),
                    tailLightsLenses.getText().toString(), tailLightsLensesCheckbox.isChecked(),
                    wipers.getText().toString(), wipersCheckbox.isChecked(),
                    regNoPlateRear.getText().toString(), regNoPlateRearCheckbox.isChecked(),
                    rearBumper.getText().toString(), rearBumperCheckbox.isChecked()
                    ));
            Intent i = new Intent(Form3Activity.this, Form4Activity.class);
            i.putExtra("id", databaseConfig.form3Dao().getLastID());
            startActivity(i);
            finish();
        });

        imageView = findViewById(R.id.backButtonForm3);

        imageView.setOnClickListener(view -> {
            Intent i = new Intent(Form3Activity.this, Form2Activity.class);
            startActivity(i);
            finish();
        });
    }
}