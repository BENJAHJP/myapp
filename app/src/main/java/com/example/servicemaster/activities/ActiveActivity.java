package com.example.servicemaster.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.servicemaster.R;
import com.example.servicemaster.adapters.ActiveAdapter;
import com.example.servicemaster.models.ActiveDataModel;
import com.example.servicemaster.roomdatabases.DatabaseConfig;

import java.util.List;

public class ActiveActivity extends AppCompatActivity {
    public DatabaseConfig databaseConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_active);

        databaseConfig = DatabaseConfig.databaseGetInstance(ActiveActivity.this);

        RecyclerView recyclerView = findViewById(R.id.activeRecyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(ActiveActivity.this);

        recyclerView.setLayoutManager(linearLayoutManager);

        List<ActiveDataModel> list = databaseConfig.form1Dao().getMyData();

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
        /*

        MaterialButton materialButton = (MaterialButton) findViewById(R.id.viewActiveButton);

        materialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(ActiveActivity.this);
                builder.setTitle("Vehicle details");
                builder.setMessage("details of the vehicle");
                builder.create();
            }
        }); */
    }
}