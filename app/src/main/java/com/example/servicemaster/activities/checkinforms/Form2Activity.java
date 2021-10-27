package com.example.servicemaster.activities.checkinforms;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.servicemaster.R;
import com.example.servicemaster.roomdatabases.DatabaseConfig;
import com.example.servicemaster.roomdatabases.entities.Form2Entity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class Form2Activity extends AppCompatActivity {

    DatabaseConfig databaseConfig;

    EditText insuranceStickerTextInput, inspectionStickerTextInput, claimNoTextInput, serviceAdvisorTextInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form2);

        databaseConfig = DatabaseConfig.databaseGetInstance(Form2Activity.this);

        insuranceStickerTextInput = findViewById(R.id.insuranceStickerTextInput);

        inspectionStickerTextInput = findViewById(R.id.inspectionStickerTextInput);

        claimNoTextInput = findViewById(R.id.claimNoTextInput);

        serviceAdvisorTextInput = findViewById(R.id.serviceAdvisorTextInput);

        int id = databaseConfig.form2Dao().getLastID();
        if(databaseConfig.form2Dao().getData(id)){
            Form2Entity form2Entity = databaseConfig.form2Dao().getRow(id);
            insuranceStickerTextInput.setText(form2Entity.getInsuranceSticker());
            inspectionStickerTextInput.setText(form2Entity.getInspectionSticker());
            claimNoTextInput.setText(form2Entity.getClaimNo());
            serviceAdvisorTextInput.setText(form2Entity.getServiceAdvisor());
        }

        FloatingActionButton floatingActionButton2 = findViewById(R.id.floatingActionButton2);

        floatingActionButton2.setOnClickListener(view -> {
            databaseConfig.form2Dao().insertData(new Form2Entity(insuranceStickerTextInput.getText().toString(),
                    inspectionStickerTextInput.getText().toString(),
                    claimNoTextInput.getText().toString(),serviceAdvisorTextInput.getText().toString()));
            Intent i = new Intent(Form2Activity.this, Form3Activity.class);
            i.putExtra("id",databaseConfig.form2Dao().getLastID());
            startActivity(i);
            finish();
        });

        ImageView imageView = findViewById(R.id.backButtonForm2);

        imageView.setOnClickListener(view -> {
            Intent i = new Intent(Form2Activity.this, Form1Activity.class);
            startActivity(i);
            finish();
        });

    }
}