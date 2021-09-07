package com.example.tp2;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Atividade5 extends AppCompatActivity implements SensorEventListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atividade5);
        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        Sensor sensor = sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);

        sensorManager.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL);

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        EditText value1 = findViewById(R.id.input3X);
        EditText value2 = findViewById(R.id.input3Y);
        EditText value3 = findViewById(R.id.input3Z);

        float newX = event.values[0];
        float newY = event.values[1];
        float newZ = event.values[2];

        value1.setText(String.valueOf(newX));
        value2.setText(String.valueOf(newY));
        value3.setText(String.valueOf(newZ));

    }
}