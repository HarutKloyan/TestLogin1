package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.lang.annotation.Target;
import java.util.List;

public class NextActivity extends AppCompatActivity {

    private final String TAG = "************************";
    ConnectDB connectDB = new ConnectDB(this);
    private TextView dataTxtView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        Log.d(TAG, name);
        List<Student> students = connectDB.read();

        String text = "";
        for (Student std: students){
            text += "Name " + std.name+"\n";
        }
        dataTxtView.setText(text);
    }
}