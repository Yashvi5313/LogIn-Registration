package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RegisterPay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_pay);

        TextView txtLoginclick1 = findViewById(R.id.txtLoginClick1);
        txtLoginclick1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterPay.this, LogIn.class);
                startActivity(intent);
            }
        });

        TextView txtEnterCode1 = findViewById(R.id.txtEnterCode1);
        txtEnterCode1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterPay.this, RegisterPay_1.class);
                startActivity(intent);
            }
        });
    }
}