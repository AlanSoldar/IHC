package com.example.tp2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Atividade1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atividade1);

        EditText value1 = findViewById(R.id.input1);
        EditText value2 = findViewById(R.id.input2);
        TextView result = findViewById(R.id.result);
        Button sumButton = findViewById(R.id.buttonSum);

        sumButton.setOnClickListener(view -> result.setText(String.valueOf(Long.parseLong(value1.getText().toString()) + Long.parseLong(value2.getText().toString()))));



    }
}