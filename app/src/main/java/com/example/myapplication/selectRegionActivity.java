package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class selectRegionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_region);
        Spinner spinner1=(Spinner)findViewById(R.id.spinner1);
        ArrayAdapter<String> myadapter =new ArrayAdapter<String>(selectRegionActivity.this,android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.names));
            myadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner1.setAdapter(myadapter   );

    }

}
