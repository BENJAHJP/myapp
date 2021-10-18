package com.example.servicemaster.activities.checkinforms;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.servicemaster.R;
import com.example.servicemaster.activities.DashboardActivity;
import com.example.servicemaster.roomdatabases.DatabaseConfig;
import com.example.servicemaster.roomdatabases.entities.Form1Entity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;

public class Form1Activity extends AppCompatActivity {

    public DatabaseConfig databaseConfig;

    public EditText regNoTextInput, customerTextInput, emailTextInput, telNoTextInput, idNoTextInput, dateTextInput, durationTextInput,
            promisedDateTextInput, postalAddressTextInput, modelTextInput, chassisNoTextInput,
            engineNoTextInput, vinNoTextInput, odometerTextInput, manualJobCardNoTextInput,
            towedByTextInput;

    public String [] financierValues = {"SELF","INSURANCE"};
    public String [] makeValues = {"BMW","TOYOTA","ISUZU","HAMMER","OPEL"};
    public String [] jobTypeValues = {"Mechanical","Service","WIP"};
    public String [] fuelSpinnerValue = {"E","1/4","1/2","F"};

    Spinner financierSpinnerInput, jobTypeSpinnerInput, makeSpinnerInput, fuelSpinnerInput;
    FloatingActionButton floatingActionButton1;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form1);

        databaseConfig = DatabaseConfig.databaseGetInstance(Form1Activity.this);

        final Calendar myCalendar = Calendar.getInstance();

        regNoTextInput = (EditText) findViewById(R.id.regNoTextInput);

        financierSpinnerInput = (Spinner) findViewById(R.id.financierSpinner);
        ArrayList<String> financierArrayList = new ArrayList<>(Arrays.asList(financierValues));
        ArrayAdapter<String> financierArrayAdapter = new ArrayAdapter<>(
                Form1Activity.this, R.layout.support_simple_spinner_dropdown_item,
                financierArrayList);
        financierSpinnerInput.setAdapter(financierArrayAdapter);

        customerTextInput = (EditText) findViewById(R.id.customerTextInput);

        emailTextInput = (EditText) findViewById(R.id.emailTextInput);

        telNoTextInput = (EditText) findViewById(R.id.telNoTextInput);

        idNoTextInput = (EditText) findViewById(R.id.idNoTextInput);

        dateTextInput = (EditText) findViewById(R.id.dateInTextInput);

        jobTypeSpinnerInput = (Spinner) findViewById(R.id.jobTypeSpinner);

        ArrayList<String> jobTypeArrayList = new ArrayList<>(Arrays.asList(jobTypeValues));
        ArrayAdapter<String> jobTypeArrayAdapter = new ArrayAdapter<>(
                Form1Activity.this, R.layout.support_simple_spinner_dropdown_item,
                jobTypeArrayList);
        jobTypeSpinnerInput.setAdapter(jobTypeArrayAdapter);

        durationTextInput = (EditText) findViewById(R.id.durationTextInput);

        promisedDateTextInput = (EditText) findViewById(R.id.promisedDateTextInput);

        postalAddressTextInput = (EditText) findViewById(R.id.postalAddressTextInput);

        makeSpinnerInput = (Spinner) findViewById(R.id.makeSpinner);
        ArrayList<String> makeArrayList = new ArrayList<>(Arrays.asList(makeValues));
        ArrayAdapter<String> makeArrayAdapter = new ArrayAdapter<>(
                Form1Activity.this,R.layout.support_simple_spinner_dropdown_item,
                makeArrayList);
        makeSpinnerInput.setAdapter(makeArrayAdapter);

        modelTextInput = (EditText) findViewById(R.id.modelTextInput);

        chassisNoTextInput = (EditText) findViewById(R.id.chassisNoTextInput);

        engineNoTextInput = (EditText) findViewById(R.id.engineNoTextInput);

        vinNoTextInput = (EditText) findViewById(R.id.vinNoTextInput);

        fuelSpinnerInput = (Spinner) findViewById(R.id.fuelSpinner);

        ArrayList<String> fuelArrayList = new ArrayList<>(Arrays.asList(fuelSpinnerValue));
        ArrayAdapter<String> fuelArrayAdapter = new ArrayAdapter<>(
                Form1Activity.this,R.layout.support_simple_spinner_dropdown_item,
                fuelArrayList);
        fuelSpinnerInput.setAdapter(fuelArrayAdapter);

        odometerTextInput = (EditText) findViewById(R.id.odometerTextInput);

        manualJobCardNoTextInput = (EditText) findViewById(R.id.manualJobCardNoTextInput);

        towedByTextInput = (EditText) findViewById(R.id.towedByTextInput);

        floatingActionButton1 = (FloatingActionButton) findViewById(R.id.floatingActionButton1);
        imageView = (ImageView) findViewById(R.id.backButtonForm8);



        imageView.setOnClickListener(view -> {
                Intent i = new Intent(Form1Activity.this, DashboardActivity.class);
                startActivity(i);
                finish();
        });

        floatingActionButton1.setOnClickListener(view -> {
            int telNo;
            if(telNoTextInput.getText().toString().equals("")){
                telNo = 0;
            }else {
                telNo = Integer.parseInt(telNoTextInput.getText().toString());
            }

            int idNo;

            if(idNoTextInput.getText().toString().equals("")){
                idNo = 0;
            }else {
                idNo = Integer.parseInt(idNoTextInput.getText().toString());
            }

            databaseConfig.form1Dao().insertData(new Form1Entity(regNoTextInput.getText().toString(),
                    financierSpinnerInput.getSelectedItem().toString(), customerTextInput.getText().toString(),
                    emailTextInput.getText().toString(), telNo,idNo,
                    dateTextInput.getText().toString(), jobTypeSpinnerInput.getSelectedItem().toString(),
                    durationTextInput.getText().toString(), promisedDateTextInput.getText().toString(),
                    postalAddressTextInput.getText().toString(), makeSpinnerInput.getSelectedItem().toString(),
                    modelTextInput.getText().toString(), chassisNoTextInput.getText().toString(),
                    engineNoTextInput.getText().toString(), vinNoTextInput.getText().toString(),
                    fuelSpinnerInput.getSelectedItem().toString(), odometerTextInput.getText().toString(),
                    manualJobCardNoTextInput.getText().toString(), towedByTextInput.getText().toString()
            ));
            Intent i = new Intent(Form1Activity.this, Form2Activity.class);
            startActivity(i);
            finish();
        });


        DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel();
            }

            private void updateLabel() {
                String myFormat = "MM/dd/yy";
                SimpleDateFormat simpledateformat = new SimpleDateFormat(myFormat, Locale.US);

                dateTextInput.setText(simpledateformat.format(myCalendar.getTime()));
            }
        };

        dateTextInput.setOnClickListener(view -> new DatePickerDialog(Form1Activity.this, date, myCalendar.get(Calendar.YEAR),
                myCalendar.get(Calendar.MONTH),myCalendar.get(Calendar.DAY_OF_MONTH)).show());
    }
}