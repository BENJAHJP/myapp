package com.example.servicemaster.activities.checkinforms;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import com.example.servicemaster.R;
import com.example.servicemaster.roomdatabases.DatabaseConfig;
import com.example.servicemaster.roomdatabases.entities.Form7Entity;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Form7Activity extends AppCompatActivity {

    DatabaseConfig databaseConfig;

    EditText jackAndHandler, lifeSavers, spacialNut, towingPin, jumperCables, wheelSpanner, fireExtinguisher,
            firstAidKit, towingRope, ownersManual;

    MaterialCheckBox jackAndHandlerCheckbox, lifeSaversCheckbox, spacialNutCheckbox, towingPinCheckbox
            , jumperCablesCheckbox, wheelSpannerCheckbox, fireExtinguisherCheckbox,
            firstAidKitCheckbox, towingRopeCheckbox, ownersManualCheckbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form7);

        databaseConfig = DatabaseConfig.databaseGetInstance(Form7Activity.this);

        jackAndHandler =  findViewById(R.id.jackAndHandlerEditText);
        jackAndHandlerCheckbox =  findViewById(R.id.jackAndHandlerCheckbox);

        lifeSavers = findViewById(R.id.lifeSaversEditText);
        lifeSaversCheckbox = findViewById(R.id.lifeSaversCheckbox);

        spacialNut = findViewById(R.id.spacialNutEditText);
        spacialNutCheckbox = findViewById(R.id.spacialNutCheckbox);

        towingPin = findViewById(R.id.towingPinEditText);
        towingPinCheckbox = findViewById(R.id.towingPinCheckbox);

        jumperCables = findViewById(R.id.jumperCablesEditText);
        jumperCablesCheckbox = findViewById(R.id.jumperCablesCheckbox);

        wheelSpanner = findViewById(R.id.wheelSpannerEditText);
        wheelSpannerCheckbox = findViewById(R.id.wheelSpannerCheckbox);

        fireExtinguisher = findViewById(R.id.fireExtinguisherEditText);
        fireExtinguisherCheckbox = findViewById(R.id.fireExtinguisherCheckbox);

        firstAidKit = findViewById(R.id.firstAidKitEditText);
        firstAidKitCheckbox = findViewById(R.id.firstAidKitCheckbox);

        towingRope = findViewById(R.id.towingRopeEditText);
        towingRopeCheckbox = findViewById(R.id.towingRopeCheckbox);

        ownersManual = findViewById(R.id.ownersManualEditText);
        ownersManualCheckbox = findViewById(R.id.ownersManualCheckbox);

        int id = databaseConfig.form7Dao().getLastID();

        if(databaseConfig.form7Dao().getData(id)){
            Form7Entity form7Entity = databaseConfig.form7Dao().getRow(id);

            jackAndHandler.setText(form7Entity.getJackAndHandlerRemarks());
            jackAndHandlerCheckbox.setChecked(form7Entity.isJackAndHandlerCheckbox());

            lifeSavers.setText(form7Entity.getLifeSaversRemarks());
            lifeSaversCheckbox.setChecked(form7Entity.isLifeSaversCheckbox());

            spacialNut.setText(form7Entity.getSpacialNutRemarks());
            spacialNutCheckbox.setChecked(form7Entity.isSpacialNutCheckbox());

            towingPin.setText(form7Entity.getTowingPinRemarks());
            towingPinCheckbox.setChecked(form7Entity.isTowingPinCheckbox());

            jumperCables.setText(form7Entity.getJumperCablesRemarks());
            jumperCablesCheckbox.setChecked(form7Entity.isJumperCablesCheckbox());

            wheelSpanner.setText(form7Entity.getWheelSpannerRemarks());
            wheelSpannerCheckbox.setChecked(form7Entity.isWheelSpannerCheckbox());

            fireExtinguisher.setText(form7Entity.getFireExtinguisherRemarks());
            fireExtinguisherCheckbox.setChecked(form7Entity.isFireExtinguisherCheckbox());

            firstAidKit.setText(form7Entity.getFirstAidKitRemarks());
            firstAidKitCheckbox.setChecked(form7Entity.isFirstAidKitCheckbox());

            towingRope.setText(form7Entity.getTowingRopeRemarks());
            towingRopeCheckbox.setChecked(form7Entity.isTowingRopeCheckbox());

            ownersManual.setText(form7Entity.getOwnersManualRemarks());
            ownersManualCheckbox.setChecked(form7Entity.isOwnersManualCheckbox());
        }

        ImageView imageView = findViewById(R.id.backButtonForm7);

        imageView.setOnClickListener(view -> {
            Intent i = new Intent(Form7Activity.this, Form6Activity.class);
            startActivity(i);
            finish();
        });

        FloatingActionButton floatingActionButton7 = findViewById(R.id.floatingActionButton7);

        floatingActionButton7.setOnClickListener(view -> {
            databaseConfig.form7Dao().insertData(new Form7Entity(jackAndHandler.getText().toString(), jackAndHandlerCheckbox.isChecked(),
                    lifeSavers.getText().toString(), lifeSaversCheckbox.isChecked(),
                    spacialNut.getText().toString(), spacialNutCheckbox.isChecked(),
                    towingPin.getText().toString(), towingPinCheckbox.isChecked(),
                    jumperCables.getText().toString(), jumperCablesCheckbox.isChecked(),
                    wheelSpanner.getText().toString(), wheelSpannerCheckbox.isChecked(),
                    fireExtinguisher.getText().toString(), fireExtinguisherCheckbox.isChecked(),
                    firstAidKit.getText().toString(), firstAidKitCheckbox.isChecked(),
                    towingRope.getText().toString(), towingRopeCheckbox.isChecked(),
                    ownersManual.getText().toString(), ownersManualCheckbox.isChecked()));
            Intent i = new Intent(Form7Activity.this, Form8Activity.class);
            startActivity(i);
            finish();
        });

    }
}