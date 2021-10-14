package com.example.servicemaster.activities.checkinforms;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.servicemaster.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;

public class Form1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form1);

        final Calendar myCalendar = Calendar.getInstance();

        EditText dateInputText = (EditText) findViewById(R.id.dateInTextInput);
        Spinner financierSpinner = (Spinner) findViewById(R.id.financierSpinner);
        Spinner jobTypeSpinner = (Spinner) findViewById(R.id.jobTypeSpinner);
        Spinner makeSpinner = (Spinner) findViewById(R.id.makeSpinner);
        Spinner fuelSpinner = (Spinner) findViewById(R.id.fuelSpinner);
        FloatingActionButton floatingActionButton1 = (FloatingActionButton) findViewById(R.id.floatingActionButton1);

        floatingActionButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Form1Activity.this, Form2Activity.class);
                startActivity(i);
            }
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

                dateInputText.setText(simpledateformat.format(myCalendar.getTime()));
            }
        };

        dateInputText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DatePickerDialog(Form1Activity.this, date, myCalendar.get(Calendar.YEAR),
                        myCalendar.get(Calendar.MONTH),myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

        String [] financierValues = {"SELF","INSURANCE"};
        ArrayList<String> financierArrayList = new ArrayList<>(Arrays.asList(financierValues));
        ArrayAdapter<String> financierArrayAdapter = new ArrayAdapter<>(
                Form1Activity.this, R.layout.support_simple_spinner_dropdown_item,
                financierArrayList);
        financierSpinner.setAdapter(financierArrayAdapter);

        String [] jobTypeValues = {"Mechanical","Service","WIP"};
        ArrayList<String> jobTypeArrayList = new ArrayList<>(Arrays.asList(jobTypeValues));
        ArrayAdapter<String> jobTypeArrayAdapter = new ArrayAdapter<>(
                Form1Activity.this, R.layout.support_simple_spinner_dropdown_item,
                jobTypeArrayList);
        jobTypeSpinner.setAdapter(jobTypeArrayAdapter);

        String [] makeValues = {"BMW","TOYOTA","ISUZU","HAMMER","OPEL"};
        ArrayList<String> makeArrayList = new ArrayList<>(Arrays.asList(makeValues));
        ArrayAdapter<String> makeArrayAdapter = new ArrayAdapter<>(
                Form1Activity.this,R.layout.support_simple_spinner_dropdown_item,
                makeArrayList);
        makeSpinner.setAdapter(makeArrayAdapter);

        String [] fuelSpinnerValue = {"E","1/4","1/2","F"};
        ArrayList<String> fuelArrayList = new ArrayList<>(Arrays.asList(fuelSpinnerValue));
        ArrayAdapter<String> fuelArrayAdapter = new ArrayAdapter<>(
                Form1Activity.this,R.layout.support_simple_spinner_dropdown_item,
                fuelArrayList);
        fuelSpinner.setAdapter(fuelArrayAdapter);
    }


}