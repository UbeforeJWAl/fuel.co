package com.example.fuelco;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class indian extends AppCompatActivity {
EditText indno;
Button button7;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian);
        indno=(EditText) findViewById(R.id.indno);
        button7=(Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number= Integer.parseInt(indno.getText().toString());
                openpayment();
            }
public void openpayment(){
    Intent intent=new Intent(getApplicationContext(),payment.class);
    startActivity(intent);
}
        });
    }
}

