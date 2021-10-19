package com.example.servicemaster.adapters;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.servicemaster.R;
import com.example.servicemaster.models.ItemsModel;
import com.example.servicemaster.roomdatabases.DatabaseConfig;
import com.example.servicemaster.roomdatabases.entities.Form3Entity;
import com.google.android.material.checkbox.MaterialCheckBox;

import java.util.List;

public class AdapterZero extends RecyclerView.Adapter<AdapterZero.MyViewHolder> {

    List<ItemsModel> list;
    Context context;
    private String regNo;

    public AdapterZero(List<ItemsModel> list, Context context, String regNo) {
        this.list = list;
        this.context = context;
        this.regNo = regNo;
    }

    @NonNull
    @Override
    public AdapterZero.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.form_recyclerview_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterZero.MyViewHolder holder, int position) {
        int pos = holder.getAdapterPosition();
        holder.title.setText(list.get(pos).getTitle());
        DatabaseConfig dm = DatabaseConfig.databaseGetInstance(context);
        Form3Entity form3Entity;
        if (dm.form3Dao().fieldExists(regNo))
        {
            form3Entity = dm.form3Dao().GetField(regNo);
            if(form3Entity.getChecked() == 1)
            {
                holder.materialCheckBox.setChecked(true);
            }

            holder.remarks.setText(form3Entity.getRemarks());
        }
        else
        {
            dm.form3Dao().insertData(new Form3Entity(regNo, list.get(pos).getTitle(), 0, ""));
        }

        holder.materialCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(holder.materialCheckBox.isChecked())
                {
                    dm.form3Dao().saveChecked(1,regNo);
                }
                else
                {
                    dm.form3Dao().saveChecked(0,regNo);
                }
            }
        });

        holder.remarks.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String input = holder.remarks.getText().toString();
                if(input.length() > 2)
                {
                    dm.form3Dao().updateRemarks(input, regNo);
                }

            }
        });

    }

    @Override
    public int getItemCount() {
        if(list.size() == 0){
            return 0;
        }else{
            return list.size();
        }
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        MaterialCheckBox materialCheckBox;
        EditText remarks;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.recyclerViewText);
            materialCheckBox = itemView.findViewById(R.id.recyclerViewCheckbox);
            remarks = itemView.findViewById(R.id.recyclerViewEditText);
        }
    }
}
