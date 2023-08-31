package com.example.fuelco;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class shell extends AppCompatActivity {
EditText shellno;
Button button6;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shell);
        shellno=(EditText) findViewById(R.id.shellno);
        button6=(Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number= Integer.parseInt(shellno.getText().toString());
                openpayment();
            }
            public void openpayment(){
                Intent intent=new Intent(getApplicationContext(),payment.class);
                startActivity(intent);

            }

        });
    }
}