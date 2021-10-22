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

        jackAndHandler = (EditText) findViewById(R.id.jackAndHandlerEditText);
        jackAndHandlerCheckbox = (MaterialCheckBox) findViewById(R.id.jackAndHandlerCheckbox);

        lifeSavers = (EditText) findViewById(R.id.lifeSaversEditText);
        lifeSaversCheckbox = (MaterialCheckBox) findViewById(R.id.lifeSaversCheckbox);

        spacialNut = (EditText) findViewById(R.id.spacialNutEditText);
        spacialNutCheckbox = (MaterialCheckBox) findViewById(R.id.spacialNutCheckbox);

        towingPin = (EditText) findViewById(R.id.towingPinEditText);
        towingPinCheckbox = (MaterialCheckBox) findViewById(R.id.towingPinCheckbox);

        jumperCables = (EditText) findViewById(R.id.jumperCablesEditText);
        jumperCablesCheckbox = (MaterialCheckBox) findViewById(R.id.jumperCablesCheckbox);

        wheelSpanner = (EditText) findViewById(R.id.wheelSpannerEditText);
        wheelSpannerCheckbox = (MaterialCheckBox) findViewById(R.id.wheelSpannerCheckbox);

        fireExtinguisher = (EditText) findViewById(R.id.fireExtinguisherEditText);
        fireExtinguisherCheckbox = (MaterialCheckBox) findViewById(R.id.fireExtinguisherCheckbox);

        firstAidKit = (EditText) findViewById(R.id.firstAidKitEditText);
        firstAidKitCheckbox = (MaterialCheckBox) findViewById(R.id.firstAidKitCheckbox);

        towingRope = (EditText) findViewById(R.id.towingRopeEditText);
        towingRopeCheckbox = (MaterialCheckBox) findViewById(R.id.towingRopeCheckbox);

        ownersManual = (EditText) findViewById(R.id.ownersManualEditText);
        ownersManualCheckbox = (MaterialCheckBox) findViewById(R.id.ownersManualCheckbox);

        ImageView imageView = (ImageView) findViewById(R.id.backButtonForm7);

        imageView.setOnClickListener(view -> {
            Intent i = new Intent(Form7Activity.this, Form6Activity.class);
            startActivity(i);
            finish();
        });

        FloatingActionButton floatingActionButton7 = (FloatingActionButton) findViewById(R.id.floatingActionButton7);

        floatingActionButton7.setOnClickListener(view -> {
            Intent i = new Intent(Form7Activity.this, Form8Activity.class);
            startActivity(i);
            finish();
        });

    }
}