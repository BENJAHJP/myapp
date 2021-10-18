package com.example.servicemaster.activities.checkinforms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.servicemaster.adapters.Adapter;
import com.example.servicemaster.models.ItemsModel;
import com.example.servicemaster.R;
import com.example.servicemaster.roomdatabases.DatabaseConfig;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class Form3Activity extends AppCompatActivity {

    DatabaseConfig databaseConfig;
    ImageView imageView;
    FloatingActionButton floatingActionButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form3);

        databaseConfig = DatabaseConfig.databaseGetInstance(Form3Activity.this);

        RecyclerView recyclerView = findViewById(R.id.form3RecyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(Form3Activity.this);
        recyclerView.setLayoutManager(linearLayoutManager);

        CheckBox checkBox = (CheckBox) findViewById(R.id.recyclerViewCheckbox);

        List<ItemsModel> list = new ArrayList<>();
        list.add(new ItemsModel("Overall Appearance",0,""));
        list.add(new ItemsModel("Side Mirrors",0,""));
        list.add(new ItemsModel("No. Of Keys",0,""));
        list.add(new ItemsModel("Fog/Spot Lights",0,""));
        list.add(new ItemsModel("Antenna/Aerial",0,""));
        list.add(new ItemsModel("Reg. Number Plate Front",0,""));
        list.add(new ItemsModel("Front Bumper",0,""));
        list.add(new ItemsModel("Fuel Tank Cap",0,""));
        list.add(new ItemsModel("Front Windscreen",0,""));
        list.add(new ItemsModel("Rear Windscreen",0,""));
        list.add(new ItemsModel("Head Lights Lenses",0,""));
        list.add(new ItemsModel("Tail Lights Lenses",0,""));
        list.add(new ItemsModel("Wipers",0,""));
        list.add(new ItemsModel("Reg. Number Plate Rear",0,""));
        list.add(new ItemsModel("Rear Bumper",0,""));

        Adapter adapter = new Adapter(list,Form3Activity.this);

        recyclerView.setAdapter(adapter);

        floatingActionButton3 = (FloatingActionButton) findViewById(R.id.floatingActionButton3);

        floatingActionButton3.setOnClickListener(view -> {
            Intent i = new Intent(Form3Activity.this, Form4Activity.class);
            startActivity(i);
            finish();
        });

        imageView = (ImageView) findViewById(R.id.backButtonForm3);

        imageView.setOnClickListener(view -> {
            Intent i = new Intent(Form3Activity.this, Form2Activity.class);
            startActivity(i);
            finish();
        });
    }
}