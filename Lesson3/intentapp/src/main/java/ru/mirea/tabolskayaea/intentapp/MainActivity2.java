package ru.mirea.tabolskayaea.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main2);

        Bundle arguments = getIntent().getExtras();
        String name = arguments.get("hello").toString();

        TextView textView = new TextView(this);
        textView.setTextSize(26);
        textView.setPadding(16, 16, 16, 16);

        String company = arguments.getString("hello");
        textView.setText(company);

        setContentView(textView);

    }
}
