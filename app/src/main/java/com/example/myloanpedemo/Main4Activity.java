package com.example.myloanpedemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Main4Activity extends AppCompatActivity
{
    GridView gridView;
    String[] loans={"Business Loan","Home Loan","feature Laon","Car Laon","student Laon",
              "Freecivil","Personal Laon","Help & Support"};
    int[] imageno={R.drawable.business,R.drawable.homeloan,R.drawable.feature,R.drawable.car,
            R.drawable.student,R.drawable.freecivil,R.drawable.personal,R.drawable.help};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4_main);
        GridView gridView=(GridView) findViewById(R.id.grid1);
        MainAdapter adapter=new MainAdapter(Main4Activity.this,loans,imageno);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(Main4Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
