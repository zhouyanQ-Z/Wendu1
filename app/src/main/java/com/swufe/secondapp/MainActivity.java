package com.swufe.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn(View v){
        EditText inp = findViewById(R.id.Etext);
        String s1 = inp.getText().toString();
        double C = Double.parseDouble(s1);
        double F=C*9/5+32;
        TextView t1=findViewById(R.id.teV2);
        t1.setText("结果为："+F);
    }
}