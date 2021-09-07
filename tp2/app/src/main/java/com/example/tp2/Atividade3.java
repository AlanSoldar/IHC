package com.example.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.EditText;

public class Atividade3 extends AppCompatActivity implements SensorEventListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atividade3);

        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        Sensor sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        sensorManager.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL);

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        EditText value1 = findViewById(R.id.inputX);
        EditText value2 = findViewById(R.id.inputY);
        EditText value3 = findViewById(R.id.inputZ);

        float newX = event.values[0];
        float newY = event.values[1];
        float newZ = event.values[2];

        if (!value1.getText().toString().isEmpty() && !value2.getText().toString().isEmpty() && !value3.getText().toString().isEmpty()) {
            float previousX = Float.parseFloat(value1.getText().toString());
            float previousY = Float.parseFloat(value2.getText().toString());
            float previousZ = Float.parseFloat(value3.getText().toString());

            if (Math.abs(previousX - newX) > 10 || Math.abs(previousY - newY) > 10 || Math.abs(previousZ - newZ) > 10) {
                Intent switchActivityIntent = new Intent(this, Atividade3b.class);
                startActivity(switchActivityIntent);
            }
        }

        value1.setText(String.valueOf(newX));
        value2.setText(String.valueOf(newY));
        value3.setText(String.valueOf(newZ));
    }

}