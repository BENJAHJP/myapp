package com.example.servicemaster.activities.checkinforms;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.servicemaster.R;
import com.example.servicemaster.roomdatabases.DatabaseConfig;
import com.example.servicemaster.roomdatabases.entities.Form6Entity;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Form6Activity extends AppCompatActivity {

    DatabaseConfig databaseConfig;

    EditText rhsfMake,rhsrMake,lhsfMake,lhsrMake,sWheelMake,batteryMake
            ,rhsfSerialNo,rhsrSerialNo,lhsfSerialNo,lhsrSerialNo,sWheelSerialNo,batterySerialNo
            ,rhsfCondition,rhsrCondition,lhsfCondition,lhsrCondition,sWheelCondition,batteryCondition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form6);

        rhsfMake = (EditText) findViewById(R.id.rhsfMakeEditText);
        rhsfSerialNo = (EditText) findViewById(R.id.rhsfSerialNoEditText);
        rhsfCondition = (EditText) findViewById(R.id.rhsfConditionEditText);

        rhsrMake = (EditText) findViewById(R.id.rhsrMakeEditText);
        rhsrSerialNo = (EditText) findViewById(R.id.rhsrSerialNoEditText);
        rhsrCondition = (EditText) findViewById(R.id.rhsrConditionEditText);

        lhsfMake = (EditText) findViewById(R.id.lhsfMakeEditText);
        lhsfSerialNo = (EditText) findViewById(R.id.lhsfSerialNoEditText);
        lhsfCondition = (EditText) findViewById(R.id.lhsfConditionEditText);

        lhsrMake = (EditText) findViewById(R.id.lhsrMakeEditText);
        lhsrSerialNo = (EditText) findViewById(R.id.lhsrSerialNoEditText);
        lhsrCondition = (EditText) findViewById(R.id.lhsrConditionEditText);

        sWheelMake = (EditText) findViewById(R.id.sWheelMakeEditText);
        sWheelSerialNo = (EditText) findViewById(R.id.sWheelSerialNoEditText);
        sWheelCondition = (EditText) findViewById(R.id.sWheelConditionEditText);

        batteryMake = (EditText) findViewById(R.id.batteryMakeEditText);
        batterySerialNo = (EditText) findViewById(R.id.batterySerialNoEditText);
        batteryCondition = (EditText) findViewById(R.id.batteryConditionEditText);

        databaseConfig = DatabaseConfig.databaseGetInstance(Form6Activity.this);

        FloatingActionButton floatingActionButton6 = (FloatingActionButton) findViewById(R.id.floatingActionButton6);

        floatingActionButton6.setOnClickListener(view -> {
            databaseConfig.form6Dao().insertData(new Form6Entity(rhsfMake.getText().toString(),
                    rhsfSerialNo.getText().toString(),rhsfCondition.getText().toString(),
                    rhsrMake.getText().toString(), rhsrSerialNo.getText().toString(),
                    rhsrCondition.getText().toString(), lhsfMake.getText().toString(),
                    lhsfSerialNo.getText().toString(), lhsfCondition.getText().toString(),
                    lhsrMake.getText().toString(), lhsrSerialNo.getText().toString(),
                    lhsrCondition.getText().toString(), sWheelMake.getText().toString(),
                    sWheelSerialNo.getText().toString(), sWheelSerialNo.getText().toString(),
                    sWheelCondition.getText().toString(), batteryMake.getText().toString(),
                    batterySerialNo.getText().toString(), batteryCondition.getText().toString()
                    ));
            Intent i = new Intent(Form6Activity.this, Form7Activity.class);
            startActivity(i);
            finish();
        });

        ImageView imageView = (ImageView) findViewById(R.id.backButtonForm6);

        imageView.setOnClickListener(view -> {
            Intent i = new Intent(Form6Activity.this, Form5Activity.class);
            startActivity(i);
            finish();
        });
    }
}