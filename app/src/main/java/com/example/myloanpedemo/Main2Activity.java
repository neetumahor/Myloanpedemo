package com.example.myloanpedemo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_main);

        setSplashScreen();

    }

    public void setSplashScreen() {
        new Handler().postDelayed(() -> {

            Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
            startActivity(intent);


        }, 2000);
    }
}
