package com.example.servicemaster.activities.checkinforms;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.servicemaster.R;
import com.example.servicemaster.activities.DashboardActivity;
import com.example.servicemaster.databinding.ActivityMainBinding;
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

    public EditText regNoTextInput, customerTextInput, motoristTextInput, emailTextInput, telNoTextInput, idNoTextInput, dateTextInput, durationTextInput,
            promisedDateTextInput, postalAddressTextInput, modelTextInput, chassisNoTextInput,
            engineNoTextInput, vinNoTextInput, odometerTextInput, manualJobCardNoTextInput,
            towedByTextInput;

    public String [] financierValues = {"Financier ...","SELF","INSURANCE"};
    public String [] makeValues = {"Make ...","BMW","TOYOTA","ISUZU","HAMMER","OPEL"};
    public String [] jobTypeValues = {"Job type ...","Mechanical","Service","WIP"};
    public String [] fuelValue = {"Fuel ...","E","1/4","1/2","F"};

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

        motoristTextInput = (EditText) findViewById(R.id.motoristTextInput);

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

        ArrayList<String> fuelArrayList = new ArrayList<>(Arrays.asList(fuelValue));
        ArrayAdapter<String> fuelArrayAdapter = new ArrayAdapter<>(
                Form1Activity.this,R.layout.support_simple_spinner_dropdown_item,
                fuelArrayList);
        fuelSpinnerInput.setAdapter(fuelArrayAdapter);

        odometerTextInput = (EditText) findViewById(R.id.odometerTextInput);

        manualJobCardNoTextInput = (EditText) findViewById(R.id.manualJobCardNoTextInput);

        towedByTextInput = (EditText) findViewById(R.id.towedByTextInput);

        int id = getIntent().getExtras().getInt("id");

        if(databaseConfig.form1Dao().getData(id)){
            Form1Entity form1Entity = databaseConfig.form1Dao().getRow(id);
            regNoTextInput.setText(form1Entity.getRegNo());

            String[] financierNewList = new String[financierValues.length];
            financierNewList[0] = form1Entity.getFinancier();
            for (int k = 1; k < financierValues.length; k++) {
                if(financierNewList[0].equals(financierValues[k-1])) {
                    continue;
                }
                else {
                    financierNewList[k] = financierValues[k-1];
                }
            }

            ArrayList<String> financierArrayList1 = new ArrayList<>(Arrays.asList(financierNewList));
            ArrayAdapter<String> financierArrayAdapter1 = new ArrayAdapter<>(
                    Form1Activity.this, R.layout.support_simple_spinner_dropdown_item,
                    financierArrayList1);
            financierSpinnerInput.setAdapter(financierArrayAdapter1);
            customerTextInput.setText(form1Entity.getCustomer());
            motoristTextInput.setText(form1Entity.getMotorist());
            emailTextInput.setText(form1Entity.getEmail());
            telNoTextInput.setText(Integer.toString(form1Entity.getTelNo()));
            idNoTextInput.setText(Integer.toString(form1Entity.getIdNo()));
            dateTextInput.setText(form1Entity.getDateIn());

            String[] jobTypeNewList = new String[jobTypeValues.length];
            jobTypeNewList[0] = form1Entity.getJobType();
            for (int k = 1; k < jobTypeValues.length; k++) {
                if(jobTypeNewList[0].equals(jobTypeValues[k-1])) {
                    continue;
                }
                else {
                    jobTypeNewList[k] = jobTypeValues[k-1];
                }
            }
            ArrayList<String> jobTypeArrayList1 = new ArrayList<>(Arrays.asList(jobTypeNewList));
            ArrayAdapter<String> jobTypeArrayAdapter1 = new ArrayAdapter<>(
                    Form1Activity.this, R.layout.support_simple_spinner_dropdown_item,
                    jobTypeArrayList1);
            jobTypeSpinnerInput.setAdapter(jobTypeArrayAdapter1);
            durationTextInput.setText(form1Entity.getDuration());
            promisedDateTextInput.setText(form1Entity.getPromisedDate());
            postalAddressTextInput.setText(form1Entity.getPostalAddress());

            String[] makeNewList = new String[makeValues.length];
            makeNewList[0] = form1Entity.getMake();
            for (int k = 1; k < makeValues.length; k++)
            {
                if(makeNewList[0].equals(makeValues[k-1])) {
                    continue;
                }
                else {
                    makeNewList[k] = makeValues[k-1];
                }
            }

            ArrayList<String> makeArrayList1 = new ArrayList<>(Arrays.asList(makeNewList));
            ArrayAdapter<String> makeArrayAdapter1 = new ArrayAdapter<>(
                    Form1Activity.this,R.layout.support_simple_spinner_dropdown_item,
                    makeArrayList1);
            makeSpinnerInput.setAdapter(makeArrayAdapter1);
            modelTextInput.setText(form1Entity.getModel());
            chassisNoTextInput.setText(form1Entity.getChassisNo());
            engineNoTextInput.setText(form1Entity.getEngineNo());
            vinNoTextInput.setText(form1Entity.getVinNo());

            String[] fuelNewList = new String[fuelValue.length];
            fuelNewList[0] = form1Entity.getFuel();
            for (int k = 1; k < fuelValue.length; k++)
            {
                if(fuelNewList[0].equals(fuelValue[k-1])) {
                    continue;
                }
                else {
                    fuelNewList[k] = fuelValue[k-1];
                }
            }

            ArrayList<String> fuelArrayList1 = new ArrayList<>(Arrays.asList(fuelNewList));
            ArrayAdapter<String> fuelArrayAdapter1 = new ArrayAdapter<>(
                    Form1Activity.this,R.layout.support_simple_spinner_dropdown_item,
                    fuelArrayList1);
            fuelSpinnerInput.setAdapter(fuelArrayAdapter1);
            emailTextInput.setText(form1Entity.getEmail());
            odometerTextInput.setText(form1Entity.getOdometer());
            manualJobCardNoTextInput.setText(form1Entity.getManualJobCardNo());
            towedByTextInput.setText(form1Entity.getTowedBy());

        }

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
                    motoristTextInput.getText().toString(),
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
            i.putExtra("id",databaseConfig.form1Dao().getLastID());
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