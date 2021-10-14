package com.example.servicemaster.activities.checkinforms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.servicemaster.R;
import com.example.servicemaster.adapters.Adapter;
import com.example.servicemaster.adapters.TyresBatteryAdapter;
import com.example.servicemaster.models.TyresBatteryModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class Form6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form6);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.form6RecyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(Form6Activity.this);
        recyclerView.setLayoutManager(linearLayoutManager);

        List<TyresBatteryModel> list = new ArrayList<>();
        list.add(new TyresBatteryModel("RHSF","","",""));
        list.add(new TyresBatteryModel("RHSR","","",""));
        list.add(new TyresBatteryModel("LHSF","","",""));
        list.add(new TyresBatteryModel("LHSR","","",""));
        list.add(new TyresBatteryModel("S/WHEEL","","",""));
        list.add(new TyresBatteryModel("Battery","","",""));

        TyresBatteryAdapter adapter = new TyresBatteryAdapter(list, Form6Activity.this);

        recyclerView.setAdapter(adapter);

        FloatingActionButton floatingActionButton6 = (FloatingActionButton) findViewById(R.id.floatingActionButton6);

        floatingActionButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Form6Activity.this, Form7Activity.class);
                startActivity(i);
            }
        });
    }
}