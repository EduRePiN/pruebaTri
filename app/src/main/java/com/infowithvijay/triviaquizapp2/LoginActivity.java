package com.infowithvijay.triviaquizapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class LoginActivity extends AppCompatActivity {

    Button btnlogin;
    ImageButton backButton;

    Button btnregistrate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnlogin = findViewById(R.id.buttningresar);
        backButton = findViewById(R.id.backButton);
        btnregistrate= findViewById(R.id.buttonregistros);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this , Home.class);
                startActivity(intent);
            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this , MainActivity.class);
                startActivity(intent);
            }
        });
        btnregistrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this , Registro.class);
                startActivity(intent);
            }
        });
    }
}