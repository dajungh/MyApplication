package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     Spinner maxSpinner = (Spinner)findViewById(R.id.spinner_low);
     ArrayAdapter lowAdapter = ArrayAdapter.createFromResource(this,
               R.array.min, android.R.layout.simple_spinner_item);
        lowAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        maxSpinner.setAdapter(lowAdapter);

        Spinner monthSpinner = (Spinner)findViewById(R.id.spinner_high);
        ArrayAdapter monthAdapter = ArrayAdapter.createFromResource(this,
                R.array.max, android.R.layout.simple_spinner_item);
        monthAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        monthSpinner.setAdapter(monthAdapter);
    }

}
