package com.example.servicemaster.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.servicemaster.R;
import com.example.servicemaster.models.TyresBatteryModel;

import java.util.List;

public class TyresBatteryAdapter extends RecyclerView.Adapter<TyresBatteryAdapter.MyViewHolder2>{

    List<TyresBatteryModel> list;
    Context context;

    public TyresBatteryAdapter(List<TyresBatteryModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.form6_recyclerview_row,parent,false);
        return new MyViewHolder2(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder2 holder, int position) {
        int pos = holder.getAdapterPosition();
        holder.textView.setText(list.get(pos).getTitle());
    }

    @Override
    public int getItemCount() {
        if(list.size() == 0){
            return 0;
        }else {
            return list.size();
        }
    }

    public class MyViewHolder2 extends RecyclerView.ViewHolder{
        TextView textView;
        EditText editText1, editText2, editText3;

        public MyViewHolder2(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.form6TextView);
            editText1 = itemView.findViewById(R.id.form6EditText1);
            editText2 = itemView.findViewById(R.id.form6EditText2);
            editText3 = itemView.findViewById(R.id.form6EditText3);
        }
    }
}


