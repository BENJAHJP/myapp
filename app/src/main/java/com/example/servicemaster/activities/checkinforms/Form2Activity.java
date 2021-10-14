package com.example.servicemaster.activities.checkinforms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.servicemaster.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Arrays;

public class Form2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form2);

        Spinner serviceAdvisorSpinner = (Spinner) findViewById(R.id.serviceAdvisorSpinner);

        String [] serviceAdvisor = {"KENNETH KARIUKI","DUNCAN WAFULA","MARY ANUPI"};
        ArrayList<String> serviceAdvisorList = new ArrayList<>(Arrays.asList(serviceAdvisor));
        ArrayAdapter<String> serviceAdvisorAdapter = new ArrayAdapter<>(Form2Activity.this,
                R.layout.support_simple_spinner_dropdown_item,serviceAdvisorList);
        serviceAdvisorSpinner.setAdapter(serviceAdvisorAdapter);


        FloatingActionButton floatingActionButton2 = (FloatingActionButton) findViewById(R.id.floatingActionButton2);

        floatingActionButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Form2Activity.this, Form3Activity.class);
                startActivity(i);
            }
        });

    }
}