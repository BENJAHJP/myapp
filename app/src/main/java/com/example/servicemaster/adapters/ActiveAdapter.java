package com.example.servicemaster.adapters;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.servicemaster.R;
import com.example.servicemaster.models.ActiveDataModel;
import com.example.servicemaster.models.ActiveModel;
import com.example.servicemaster.roomdatabases.entities.Form1Entity;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class ActiveAdapter extends RecyclerView.Adapter<ActiveAdapter.MyViewHolder3>{

    List<ActiveDataModel> list;
    Context context;
    final View.OnClickListener onClickListener = new MyOnClickListener();

    public ActiveAdapter(List<ActiveDataModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder3 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.active_recyclerview_row,parent,false);
        view.setOnClickListener(onClickListener);
        return new MyViewHolder3(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder3 holder, int position) {
        int pos = holder.getAdapterPosition();
        ActiveDataModel activeDataModel = list.get(pos);
        holder.customer.setText(list.get(pos).getCustomer());
        holder.regNo.setText(list.get(pos).getRegNo());
        holder.jobType.setText(list.get(pos).getRegNo());
        holder.duration.setText(list.get(pos).getRegNo());
    }

    @Override
    public int getItemCount() {
        if(list.size() == 0){
            return 0;
        }else {
            return list.size();
        }
    }

    public class MyViewHolder3 extends RecyclerView.ViewHolder{
        TextView customer, regNo,duration, jobType;

        public MyViewHolder3(@NonNull View itemView) {
            super(itemView);
            customer = itemView.findViewById(R.id.customerActiveText);
            regNo = itemView.findViewById(R.id.regNoActiveText);
            jobType = itemView.findViewById(R.id.jobTypeActiveText);
            duration = itemView.findViewById(R.id.durationActiveText);
        }
    }

    private class MyOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {

        }
    }
}
