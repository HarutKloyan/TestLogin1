package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MyActivity3 extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my3);
    }

    public void onClickLogIn2(View view) {
        EditText login = (EditText) findViewById(R.id.loginH_2);
        String login1 = login.getText().toString();
        intent = new  Intent(this,MyProfilActivity.class);
        intent.putExtra("login",login1);
        startActivity(intent);
    }
}