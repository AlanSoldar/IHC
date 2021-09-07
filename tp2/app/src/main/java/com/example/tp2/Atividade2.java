package com.example.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Atividade2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atividade2);

        Button buttonSend = findViewById(R.id.buttonSend);
        EditText value = findViewById(R.id.inputA2);

        buttonSend.setOnClickListener(view -> {
            Intent switchActivityIntent = new Intent(this, Atividade2b.class);
            switchActivityIntent.putExtra("message", value.getText().toString());
            startActivity(switchActivityIntent);});
    }
}