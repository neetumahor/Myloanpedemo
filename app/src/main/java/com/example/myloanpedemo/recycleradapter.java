package com.example.myloanpedemo;

import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myloanpedemo.databinding.SinglerowBinding;

import java.util.ArrayList;

public class recycleradapter extends RecyclerView.Adapter<recycleradapter.holder>
{
    private String[] data;
    private Context context;

    public recycleradapter(Context context,String[] data) {
        this.data = data;
        this.context=context;

    }
    @NonNull
    @Override
    public recycleradapter.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        SinglerowBinding singlerowBinding= SinglerowBinding.inflate(layoutInflater,
                parent,false);
        return new holder(singlerowBinding);

    }

    @Override
    public void onBindViewHolder(@NonNull recycleradapter.holder holder, int position)
    {
       String title=data[position];
       //holder.e1.setText(title);
        holder.singlerowBinding.edittext1.setText(title);
        holder.singlerowBinding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,Main5Activity.class);
                context.startActivity(intent);
            }
        });


    }


    @Override
    public int getItemCount() {
        return data.length;
    }

    public class holder extends RecyclerView.ViewHolder {
        SinglerowBinding singlerowBinding;
        EditText e1;
        TextView t2,t1;
        Button b1;
        public holder(@NonNull SinglerowBinding singlerowBinding) {
            super(singlerowBinding.getRoot());
            this.singlerowBinding=singlerowBinding;

        }
    }
}
