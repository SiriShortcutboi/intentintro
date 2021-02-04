package com.example.intentro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int age = intent.getIntExtra("age", 0);
        age+= 10;
        TextView agelbl = (TextView)findViewById(R.id.agelblpg2);
        agelbl.setText("age.toString());

        TextView lbl = (TextView)findViewById(R.id.welcomelbl);
        lbl.setText("Welcome "+name);

    }

    public void onClick(View view){
        Intent goToPage3 = new Intent( this, Activity3.class);
        startActivity(goToPage3);
    }


}