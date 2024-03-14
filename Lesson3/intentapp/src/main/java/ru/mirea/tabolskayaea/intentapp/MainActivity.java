package ru.mirea.tabolskayaea.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    String dateString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        long dateInMillis = System.currentTimeMillis();
        //String format = "yyyy-MM-dd HH:mm:ss";
        String format = "HH:mm:ss";
        final SimpleDateFormat sdf = new SimpleDateFormat(format);
        dateString = sdf.format(new Date(dateInMillis));

    }

    public void onClick(View v) {

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("hello", "  КВАДРАТ ЗНАЧЕНИЯ МОЕГО НОМЕРА " +
                "ПО СПИСКУ В ГРУППЕ СОСТАВЛЯЕТ 676, \n  а текущее время "+dateString);
        startActivity(intent);
    }
}