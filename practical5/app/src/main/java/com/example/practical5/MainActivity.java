package com.example.practical5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        USTHWeather usth = new USTHWeather();
        getSupportFragmentManager().beginTransaction().add(R.id.container,usth).commit();

    }
}