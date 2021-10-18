package com.example.servicemaster.activities.checkinforms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.servicemaster.adapters.Adapter;
import com.example.servicemaster.models.ItemsModel;
import com.example.servicemaster.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class Form7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form7);

        RecyclerView recyclerView = findViewById(R.id.form7RecyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(Form7Activity.this);
        recyclerView.setLayoutManager(linearLayoutManager);

        List<ItemsModel> list = new ArrayList<>();
        list.add(new ItemsModel("Jack & Handle",0,""));
        list.add(new ItemsModel("Life Savers",0,""));
        list.add(new ItemsModel("Spacial Nut",0,""));
        list.add(new ItemsModel("Towing Pin",0,""));
        list.add(new ItemsModel("Jumper Cables",0,""));
        list.add(new ItemsModel("Wheel Spanner",0,""));
        list.add(new ItemsModel("Fire Extinguisher",0,""));
        list.add(new ItemsModel("First Aid Kit",0,""));
        list.add(new ItemsModel("Towing Rope",0,""));
        list.add(new ItemsModel("Owners Manual",0,""));

        Adapter adapter = new Adapter(list,Form7Activity.this);

        recyclerView.setAdapter(adapter);


        ImageView imageView = (ImageView) findViewById(R.id.backButtonForm7);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Form7Activity.this, Form6Activity.class);
                startActivity(i);
                finish();
            }
        });

        FloatingActionButton floatingActionButton7 = (FloatingActionButton) findViewById(R.id.floatingActionButton7);

        floatingActionButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Form7Activity.this, Form8Activity.class);
                startActivity(i);
                finish();
            }
        });

    }
}