package com.example.servicemaster.activities.checkinforms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.servicemaster.adapters.Adapter;
import com.example.servicemaster.models.ItemsModel;
import com.example.servicemaster.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class Form4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form4);

        RecyclerView recyclerView = findViewById(R.id.form5RecyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(Form4Activity.this);
        recyclerView.setLayoutManager(linearLayoutManager);

        List<ItemsModel> list = new ArrayList<>();
        list.add(new ItemsModel("Rear View Mirror",0,""));
        list.add(new ItemsModel("Window Switches",0,""));
        list.add(new ItemsModel("Floor Mats/Carpet",0,""));
        list.add(new ItemsModel("Dashboard",0,""));
        list.add(new ItemsModel("Engine Sensors and Fuses",0,""));
        list.add(new ItemsModel("Washer Bottle",0,""));
        list.add(new ItemsModel("Cigar Lighter",0,""));
        list.add(new ItemsModel("Speaker",0,""));
        list.add(new ItemsModel("Radio/Cassette/CD",0,""));
        list.add(new ItemsModel("Engine Compartment",0,""));
        list.add(new ItemsModel("Computer Box",0,""));
        list.add(new ItemsModel("Horn",0,""));

        Adapter adapter = new Adapter(list,Form4Activity.this);

        recyclerView.setAdapter(adapter);

        FloatingActionButton floatingActionButton4 = (FloatingActionButton) findViewById(R.id.floatingActionButton4);

        floatingActionButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Form4Activity.this, Form5Activity.class);
                startActivity(i);
            }
        });
    }
}