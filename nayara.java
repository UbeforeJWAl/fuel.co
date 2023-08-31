package com.example.fuelco;

import static com.example.fuelco.R.id.button9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class nayara extends AppCompatActivity {
EditText nayarano;
Button button9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nayara);
        nayarano=(EditText) findViewById(R.id.nayarano);
        button9=(Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number= Integer.parseInt(nayarano.getText().toString());
                openpayment();
            }
            public void openpayment(){
                Intent intent=new Intent(getApplicationContext(),payment.class);
                startActivity(intent);
            }

        });
    }
}



