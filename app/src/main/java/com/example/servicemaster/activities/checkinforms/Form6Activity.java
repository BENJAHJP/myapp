package com.example.servicemaster.activities.checkinforms;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import com.example.servicemaster.R;
import com.example.servicemaster.roomdatabases.DatabaseConfig;
import com.example.servicemaster.roomdatabases.entities.Form6Entity;
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

        rhsfMake = findViewById(R.id.rhsfMakeEditText);
        rhsfSerialNo = findViewById(R.id.rhsfSerialNoEditText);
        rhsfCondition = findViewById(R.id.rhsfConditionEditText);

        rhsrMake = findViewById(R.id.rhsrMakeEditText);
        rhsrSerialNo = findViewById(R.id.rhsrSerialNoEditText);
        rhsrCondition = findViewById(R.id.rhsrConditionEditText);

        lhsfMake = findViewById(R.id.lhsfMakeEditText);
        lhsfSerialNo = findViewById(R.id.lhsfSerialNoEditText);
        lhsfCondition = findViewById(R.id.lhsfConditionEditText);

        lhsrMake = findViewById(R.id.lhsrMakeEditText);
        lhsrSerialNo = findViewById(R.id.lhsrSerialNoEditText);
        lhsrCondition = findViewById(R.id.lhsrConditionEditText);

        sWheelMake =  findViewById(R.id.sWheelMakeEditText);
        sWheelSerialNo = findViewById(R.id.sWheelSerialNoEditText);
        sWheelCondition = findViewById(R.id.sWheelConditionEditText);

        batteryMake = findViewById(R.id.batteryMakeEditText);
        batterySerialNo = findViewById(R.id.batterySerialNoEditText);
        batteryCondition = findViewById(R.id.batteryConditionEditText);

        databaseConfig = DatabaseConfig.databaseGetInstance(Form6Activity.this);

        int id = databaseConfig.form6Dao().getLastID();

        if(databaseConfig.form6Dao().getData(id)){
            Form6Entity form6Entity = databaseConfig.form6Dao().getRow(id);
            rhsrMake.setText(form6Entity.getRhsrMake());
            rhsrSerialNo.setText(form6Entity.getRhsrSerialNo());
            rhsrCondition.setText(form6Entity.getRhsrCondition());

            rhsfMake.setText(form6Entity.getRhsfMake());
            rhsfSerialNo.setText(form6Entity.getRhsfSerialNo());
            rhsfCondition.setText(form6Entity.getRhsfCondition());

            lhsrMake.setText(form6Entity.getLhsrMake());
            lhsrSerialNo.setText(form6Entity.getLhsrSerialNo());
            lhsrCondition.setText(form6Entity.getLhsrCondition());

            lhsfMake.setText(form6Entity.getLhsfMake());
            lhsfSerialNo.setText(form6Entity.getLhsfSerialNo());
            lhsfCondition.setText(form6Entity.getLhsfCondition());

            sWheelMake.setText(form6Entity.getSwheelMake());
            sWheelSerialNo.setText(form6Entity.getSwheelSerialNo());
            sWheelCondition.setText(form6Entity.getSwheelCondition());

            batteryMake.setText(form6Entity.getBatteryMake());
            batterySerialNo.setText(form6Entity.getBatterySerialNo());
            batteryCondition.setText(form6Entity.getBatteryCondition());
        }



        FloatingActionButton floatingActionButton6 = findViewById(R.id.floatingActionButton6);

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

        ImageView imageView = findViewById(R.id.backButtonForm6);

        imageView.setOnClickListener(view -> {
            Intent i = new Intent(Form6Activity.this, Form5Activity.class);
            startActivity(i);
            finish();
        });
    }
}