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

public class Form5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form5);

        RecyclerView recyclerView = findViewById(R.id.form5RecyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(Form5Activity.this);
        recyclerView.setLayoutManager(linearLayoutManager);

        List<ItemsModel> list = new ArrayList<>();
        list.add(new ItemsModel("Wheel Rims",0,""));
        list.add(new ItemsModel("Wheel Caps/Hubs",0,""));
        list.add(new ItemsModel("Mudflap",0,""));
        list.add(new ItemsModel("Steering Wheel",0,""));

        Adapter adapter = new Adapter(list,Form5Activity.this);

        recyclerView.setAdapter(adapter);

        FloatingActionButton floatingActionButton5 = (FloatingActionButton) findViewById(R.id.floatingActionButton5);

        floatingActionButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Form5Activity.this, Form6Activity.class);
                startActivity(i);
            }
        });
    }
}