package com.mirea.tabolskayaea.multiactivity;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.widget.TextView;

public class Second_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "SecondActivity_onCreate()");

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView = new TextView(this);
        //TextView textView = findViewById(R.id.textView2);
        //textView.setTextSize(40);
        textView.setText(message);

        setContentView(textView);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"SecondActivity_onStart()");
    }
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle saveInstanceState) {
        super.onRestoreInstanceState(saveInstanceState);
        Log.i(TAG,"SecondActivity_onRestoreInstanceState()");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"SecondActivity_onRestart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG,"SecondActivity_onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG,"SecondActivity_onPause()");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG,"SecondActivity_onSaveInstanceState()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"SecondActivity_onStop()");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"SecondActivity_onDestroy()");
    }
}