package com.example.servicemaster.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.servicemaster.models.ItemsModel;
import com.example.servicemaster.R;
import com.google.android.material.checkbox.MaterialCheckBox;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    List<ItemsModel> list;
    Context context;

    public Adapter(List<ItemsModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.form_recyclerview_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyViewHolder holder, int position) {
        int pos = holder.getAdapterPosition();
        holder.textView.setText(list.get(pos).getTitle());
    }

    @Override
    public int getItemCount() {
        if(list.size() == 0){
            return 0;
        }else{
            return list.size();
        }
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        MaterialCheckBox materialCheckBox;
        EditText editText;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.recyclerViewText);
            materialCheckBox = itemView.findViewById(R.id.recyclerViewCheckbox);
            editText = itemView.findViewById(R.id.recyclerViewEditText);
        }
    }

}
