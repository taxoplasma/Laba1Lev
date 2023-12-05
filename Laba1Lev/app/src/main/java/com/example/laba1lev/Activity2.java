package com.example.laba1lev;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        String surname = getIntent().getStringExtra("Яровицын");

        TextView textView = findViewById(R.id.textView);

        textView.setText("Переданный параметр: " + surname);
    }
}