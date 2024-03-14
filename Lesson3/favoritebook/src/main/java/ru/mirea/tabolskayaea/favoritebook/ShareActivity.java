package ru.mirea.tabolskayaea.favoritebook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {
    EditText edittext;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        edittext = findViewById(R.id.editTextText);

        // Получение данных из MainActivity
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            TextView ageView = findViewById(R.id.textView);
            String university = extras.getString(MainActivity.KEY);
            //edittext.setText(String.format("Моя любимая книга: %s",university));
        }
    }

    public void onButtonClick(View view) {
        // Отправка введенных пользователем данных по нажатию на кнопку
        Intent data = new Intent();
        String text = "Моя любимая книга: " + edittext.getText().toString();
        data.putExtra(MainActivity.USER_MESSAGE, text);
        setResult(Activity.RESULT_OK, data);
        finish();
    }
}