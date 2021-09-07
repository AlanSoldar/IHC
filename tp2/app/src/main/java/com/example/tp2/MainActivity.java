package com.example.tp2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button buttonA1;
    Button buttonA2;
    Button buttonA3;
    Button buttonA4;
    Button buttonA5;
    Button buttonA6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonA1 = findViewById(R.id.buttonA1);
        buttonA2 = findViewById(R.id.buttonA2);
        buttonA3 = findViewById(R.id.buttonA3);
        buttonA4 = findViewById(R.id.buttonA4);
        buttonA5 = findViewById(R.id.buttonA5);
        buttonA6 = findViewById(R.id.buttonA6);

        buttonA1.setOnClickListener(view -> switchActivities(Atividade1.class));
        buttonA2.setOnClickListener(view -> switchActivities(Atividade2.class));
        buttonA3.setOnClickListener(view -> switchActivities(Atividade3.class));
        buttonA4.setOnClickListener(view -> switchActivities(Atividade4.class));
        buttonA5.setOnClickListener(view -> switchActivities(Atividade5.class));
        buttonA6.setOnClickListener(view -> switchActivities(Atividade6.class));


    }

    public void switchActivities(Class atividade) {
        Intent switchActivityIntent = new Intent(this, atividade);
        startActivity(switchActivityIntent);
    }

}