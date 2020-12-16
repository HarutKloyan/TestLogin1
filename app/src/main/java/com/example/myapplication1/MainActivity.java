package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyApplication";

    public void OnClickSignUp(View view) {
        startActivity(new Intent(this, MyActivity2.class));

    }
    public void onClickLogIn(View view) {
        startActivity(new Intent(this, MyActivity3.class));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: My application creating");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: My application starting");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: My application resuming");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: My application pausing");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: My application stopped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: My application restarting");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: My application destroying");
    }


}