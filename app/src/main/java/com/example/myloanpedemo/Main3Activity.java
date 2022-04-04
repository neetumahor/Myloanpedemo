package com.example.myloanpedemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main3Activity extends AppCompatActivity
{
    ImageView img1,img2,im3;
    TextView text1,text2,text3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3_main);
        ImageView img1=(ImageView) findViewById(R.id.img1);
        ImageView img2=(ImageView) findViewById(R.id.img2);
        ImageView img3=(ImageView) findViewById(R.id.img3);
        TextView text1=(TextView) findViewById(R.id.txt1);
        TextView text2=(TextView) findViewById(R.id.txt2);
        TextView text3=(TextView) findViewById(R.id.txt3);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main3Activity.this,Main4Activity.class);
                startActivity(intent);
            }
        });

    }
}
