 package com.example.androidclassproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

 public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MYTAG","in oncreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MYTAG","in on start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MYTAG","in onresume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MYTAG","in onpause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MYTAG","in on stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MYTAG","in ondestroy");
    }
}
