package com.example.exp2layout5j5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class LinearLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
    }

    public void llChangeOrientation(View v)
    {
        LinearLayout li = this.findViewById(R.id.ll1);

        if(li.getOrientation()==LinearLayout.VERTICAL)
        {
            li.setOrientation(LinearLayout.HORIZONTAL);
        }
        else {
            li.setOrientation(LinearLayout.VERTICAL);
        }




    }
}