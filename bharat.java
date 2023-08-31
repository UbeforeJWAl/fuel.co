package com.example.fuelco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class bharat extends AppCompatActivity {
EditText bharatno ;
Button button8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bharat);

        bharatno=(EditText) findViewById(R.id.bhatatno);
        button8=(Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number= Integer.parseInt(bharatno.getText().toString());
                openpayment();
            }
            public void openpayment(){
                Intent intent=new Intent(getApplicationContext(),payment.class);
                startActivity(intent);
            }


        });
    }
}

