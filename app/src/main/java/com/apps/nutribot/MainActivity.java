package com.apps.nutribot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.apps.dietcalc.DietCalc;
import com.apps.dietplan.CalorieLevel;

public class MainActivity extends AppCompatActivity {

    Button button_dietplan, button_calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_dietplan = (Button) findViewById(R.id.button_dietplan);
        button_calc = (Button) findViewById(R.id.button_dietcalc);

        button_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DietCalc.class);
                startActivity(intent);
            }
        });

        button_dietplan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,CalorieLevel.class);
                startActivity(intent);
            }
        });
    }
}
