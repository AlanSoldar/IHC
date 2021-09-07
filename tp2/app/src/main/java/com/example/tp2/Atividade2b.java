package com.example.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Atividade2b extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atividade2b);

        TextView result = findViewById(R.id.textViewA2);

        //result.setText("test");
        Intent intent = getIntent();

        result.setText(intent.getStringExtra("message"));


    }
}