package com.example.servicemaster.activities.checkinforms;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.servicemaster.R;
import com.example.servicemaster.roomdatabases.DatabaseConfig;
import com.example.servicemaster.roomdatabases.entities.Form5Entity;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Form5Activity extends AppCompatActivity {

    DatabaseConfig databaseConfig;

    EditText wheelsRims, wheelsCapsHubs, mudFlap, steeringWheel;

    MaterialCheckBox wheelsRimsCheckbox, wheelsCapsHubsCheckbox, mudFlapCheckbox, steeringWheelCheckbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form5);

        wheelsRims = findViewById(R.id.wheelsRimsEditText);
        wheelsRimsCheckbox = findViewById(R.id.wheelsRimsCheckbox);

        wheelsCapsHubs = findViewById(R.id.wheelsCapsHubsEditText);
        wheelsCapsHubsCheckbox = findViewById(R.id.wheelsCapsHubsCheckbox);

        mudFlap = findViewById(R.id.mudflapEditText);
        mudFlapCheckbox = findViewById(R.id.mudflapCheckbox);

        steeringWheel = findViewById(R.id.steeringWheelEditText);
        steeringWheelCheckbox = findViewById(R.id.steeringWheelCheckbox);

        databaseConfig = DatabaseConfig.databaseGetInstance(Form5Activity.this);

        int id = databaseConfig.form5Dao().getLastID();


        if(databaseConfig.form5Dao().getData(id)){
            Form5Entity form5Entity = databaseConfig.form5Dao().getRow(id);
            wheelsRims.setText(form5Entity.getWheelRimsRemarks());
            wheelsRimsCheckbox.setChecked(form5Entity.isWheelRimsCheckbox());

            wheelsCapsHubs.setText(form5Entity.getWheelCapsHubsRemarks());
            wheelsCapsHubsCheckbox.setChecked(form5Entity.isWheelCapsHubsCheckbox());

            mudFlap.setText(form5Entity.getMudFlapRemarks());
            mudFlapCheckbox.setChecked(form5Entity.isMudFlapCheckbox());

            steeringWheel.setText(form5Entity.getSteeringWheelRemarks());
            steeringWheelCheckbox.setChecked(form5Entity.isSteeringWheelCheckbox());
        }


        FloatingActionButton floatingActionButton5 = findViewById(R.id.floatingActionButton5);

        floatingActionButton5.setOnClickListener(view -> {
            databaseConfig.form5Dao().insertData(new Form5Entity(wheelsRims.getText().toString(), wheelsRimsCheckbox.isChecked(),
                    wheelsCapsHubs.getText().toString(), wheelsCapsHubsCheckbox.isChecked(),
                    mudFlap.getText().toString(), mudFlapCheckbox.isChecked(),
                    steeringWheel.getText().toString(), steeringWheelCheckbox.isChecked()));
            Intent i = new Intent(Form5Activity.this, Form6Activity.class);
            startActivity(i);
            finish();
        });

        ImageView imageView = findViewById(R.id.backButtonForm5);

        imageView.setOnClickListener(view -> {
            Intent i = new Intent(Form5Activity.this, Form4Activity.class);
            startActivity(i);
            finish();
        });
    }
}