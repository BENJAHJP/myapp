package com.example.servicemaster.activities.checkinforms;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.servicemaster.R;
import com.example.servicemaster.roomdatabases.DatabaseConfig;
import com.example.servicemaster.roomdatabases.entities.Form2Entity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Arrays;

public class Form2Activity extends AppCompatActivity {

    DatabaseConfig databaseConfig;

    EditText insuranceStickerTextInput, inspectionStickerTextInput, claimNoTextInput;

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


        int id = getIntent().getExtras().getInt("id");

        if(databaseConfig.form2Dao().getData(id)){
            Form2Entity form2Entity = databaseConfig.form2Dao().getRow(id);
            insuranceStickerTextInput.setText(form2Entity.getInsuranceSticker());
            inspectionStickerTextInput.setText(form2Entity.getInspectionSticker());
            claimNoTextInput.setText(form2Entity.getClaimNo());
        }

        FloatingActionButton floatingActionButton2 = (FloatingActionButton) findViewById(R.id.floatingActionButton2);

        floatingActionButton2.setOnClickListener(view -> {
            databaseConfig.form2Dao().insertData(new Form2Entity(insuranceStickerTextInput.getText().toString(),
                    inspectionStickerTextInput.getText().toString(),
                    claimNoTextInput.getText().toString(),serviceAdvisorSpinnerInput.getSelectedItem().toString()));
            Intent i = new Intent(Form2Activity.this, Form3Activity.class);
            i.putExtra("id",databaseConfig.form2Dao().getLastID());
            startActivity(i);
            finish();
        });

        ImageView imageView = (ImageView) findViewById(R.id.backButtonForm2);

        imageView.setOnClickListener(view -> {
            Intent i = new Intent(Form2Activity.this, Form1Activity.class);
            i.putExtra("id", id);
            startActivity(i);
            finish();
        });

    }
}