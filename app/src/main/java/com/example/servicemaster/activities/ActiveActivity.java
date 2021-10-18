package com.example.servicemaster.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.servicemaster.R;
import com.example.servicemaster.adapters.ActiveAdapter;
import com.example.servicemaster.adapters.Adapter;
import com.example.servicemaster.models.ActiveModel;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import java.util.ArrayList;
import java.util.List;

public class ActiveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_active);

        RecyclerView recyclerView = findViewById(R.id.activeRecyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(ActiveActivity.this);

        recyclerView.setLayoutManager(linearLayoutManager);

        List<ActiveModel> list = new ArrayList<ActiveModel>();
        list.add(new ActiveModel("wed","fef","rf4f","f4f4"));
        list.add(new ActiveModel("wed","fef","rf4f","f4f4"));
        list.add(new ActiveModel("wed","fef","rf4f","f4f4"));
        list.add(new ActiveModel("wed","fef","rf4f","f4f4"));
        list.add(new ActiveModel("wed","fef","rf4f","f4f4"));
        list.add(new ActiveModel("wed","fef","rf4f","f4f4"));
        list.add(new ActiveModel("wed","fef","rf4f","f4f4"));
        list.add(new ActiveModel("wed","fef","rf4f","f4f4"));
        list.add(new ActiveModel("wed","fef","rf4f","f4f4"));
        list.add(new ActiveModel("wed","fef","rf4f","f4f4"));
        list.add(new ActiveModel("wed","fef","rf4f","f4f4"));
        list.add(new ActiveModel("wed","fef","rf4f","f4f4"));
        list.add(new ActiveModel("wed","fef","rf4f","f4f4"));
        list.add(new ActiveModel("wed","fef","rf4f","f4f4"));
        list.add(new ActiveModel("wed","fef","rf4f","f4f4"));
        list.add(new ActiveModel("wed","fef","rf4f","f4f4"));
        list.add(new ActiveModel("wed","fef","rf4f","f4f4"));



        ActiveAdapter adapter = new ActiveAdapter(list, ActiveActivity.this);

        recyclerView.setAdapter(adapter);

        ImageView imageView = (ImageView) findViewById(R.id.backButtonActive);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActiveActivity.this, DashboardActivity.class);
                startActivity(i);
                finish();
            }
        });

        MaterialButton materialButton = (MaterialButton) findViewById(R.id.viewActiveButton);

        materialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(ActiveActivity.this);
                builder.setTitle("Vehicle details");
                builder.setMessage("details of the vehicle");
                builder.create();
            }
        });
    }
}