package com.example.exp2layout5j5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showLinearLayoutActivity(View cv){
        Intent i = new Intent(this,LinearLayoutActivity.class);
        this.startActivity(i);

    }

    public void showFrameLayoutActivity(View cv){
        Intent i = new Intent(this,FrameLayoutActivity.class);
        this.startActivity(i);

    }

    public void showTableLayoutActivity(View cv){
        Intent i = new Intent(this,TableLayoutActivity.class);
        this.startActivity(i);

    }
}