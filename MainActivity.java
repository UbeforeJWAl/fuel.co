package com.example.fuelco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 EditText LoginText,PasswordText;
 Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoginText=(EditText) findViewById(R.id.LoginText);
        PasswordText=(EditText) findViewById(R.id.PasswordText);
        btnLogin=(Button) findViewById(R.id.button);
        btnLogin.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {
              String username=LoginText.getText().toString();
              String password=PasswordText.getText().toString();

              if (username.equals("ujwal")&&(password.equals("12345")))
              {
                  openactivity2();
                  Intent intent=new Intent(getApplicationContext(),activity2.class);
                  startActivity(intent);
              }else
              {
                  Toast.makeText(MainActivity.this,"invalid credentials",Toast.LENGTH_SHORT).show();

              }
            }


        });
    }
    public void openactivity2(){
        Intent intent=new Intent(this,activity2.class);
        startActivity();
    }

    private void startActivity() {
    }

}

