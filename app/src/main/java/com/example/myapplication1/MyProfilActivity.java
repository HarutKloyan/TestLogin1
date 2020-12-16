package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MyProfilActivity extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        intent = getIntent();
        String loginame = intent.getStringExtra("login");
        setContentView(R.layout.activity_my_profil);
        TextView name = (TextView) findViewById(R.id.loginname_1);
        name.setText(loginame);

    }
}