package com.mirea.tabolskayaea.toastapp;
import android.view.Gravity;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtText;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toast toast = Toast.makeText(getApplicationContext(), "Здравствуй MIREA!", Toast.LENGTH_SHORT);
        //toast.show();
    }
    public void onButtonClick(View view) {
        edtText = (EditText) findViewById(R.id.editText);
        int l = edtText.getText().toString().length();
        str = String.format("СТУДЕНТ_№26_ГРУППА:БИСО-03-19\r\nКоличество_символов_%d",l);
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
    }
}