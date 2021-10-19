package com.example.servicemaster.activities.checkinforms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.servicemaster.R;
import com.example.servicemaster.roomdatabases.DatabaseConfig;
import com.example.servicemaster.roomdatabases.entities.Form2Entity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Arrays;

public class Form2Activity extends AppCompatActivity {

    DatabaseConfig databaseConfig;

    EditText insuranceStickerTextInput, inspectionStickerTextInput, claimNoTextInput;
    String insuranceStickerText, inspectionStickerText, claimNoText, serviceAdvisorText;

    Spinner serviceAdvisorSpinnerInput;

    String [] serviceAdvisors = {"KENNETH KARIUKI"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form2);

        databaseConfig = DatabaseConfig.databaseGetInstance(Form2Activity.this);

        insuranceStickerTextInput = (EditText) findViewById(R.id.insuranceStickerTextInput);

        inspectionStickerTextInput = (EditText) findViewById(R.id.inspectionStickerTextInput);

        claimNoTextInput = (EditText) findViewById(R.id.claimNoTextInput);

        serviceAdvisorSpinnerInput = (Spinner) findViewById(R.id.serviceAdvisorSpinner);
        ArrayList<String> serviceAdvisorList = new ArrayList<>(Arrays.asList(serviceAdvisors));
        ArrayAdapter<String> serviceAdvisorAdapter = new ArrayAdapter<>(Form2Activity.this,
                R.layout.support_simple_spinner_dropdown_item,serviceAdvisorList);
        serviceAdvisorSpinnerInput.setAdapter(serviceAdvisorAdapter);

        FloatingActionButton floatingActionButton2 = (FloatingActionButton) findViewById(R.id.floatingActionButton2);

        floatingActionButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                databaseConfig.form2Dao().insertData(new Form2Entity(insuranceStickerTextInput.getText().toString(),
                        inspectionStickerTextInput.getText().toString(),
                        claimNoTextInput.getText().toString(),serviceAdvisorSpinnerInput.getSelectedItem().toString()));
                Intent i = new Intent(Form2Activity.this, Form3Activity.class);
                startActivity(i);
                finish();
            }
        });

        ImageView imageView = (ImageView) findViewById(R.id.backButtonForm2);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Form2Activity.this, Form1Activity.class);
                startActivity(i);
                finish();
            }
        });

    }
}