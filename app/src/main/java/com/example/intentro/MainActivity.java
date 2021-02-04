package com.example.intentro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

    public void onClick(View view){
        Intent goToPage2 = new Intent( this, MainActivity2.class);
        EditText name = (EditText) findViewById(R.id.editTextTextPersonName);
        String value = name.getText().toString();
        goToPage2.putExtra("name", value);
        goToPage2.putExtra("age", value);
        startActivity(goToPage2);
    }
}