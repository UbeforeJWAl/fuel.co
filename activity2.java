package com.example.fuelco;

import static com.example.fuelco.R.id.button3;
import static com.example.fuelco.R.id.button2;
import static com.example.fuelco.R.id.button5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity2 extends AppCompatActivity {
    Button button2, button3, button4, button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openshell();


            }

            public void openshell() {
                Intent intent = new Intent(getApplicationContext(), shell.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openindian();
            }

            public void openindian() {
                Intent intent = new Intent(getApplicationContext(), indian.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openbharat();


            }

            public void openbharat() {
                Intent intent = new Intent(getApplicationContext(), bharat.class);
                startActivity(intent);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivitynayara();


            }

            public void openactivitynayara() {
                Intent intent = new Intent(getApplicationContext(), nayara.class);
                startActivity(intent);
            }
        });

    }

    private void startActivity() {

    }

}



