package ru.mirea.tabolskayaea.favoritebook;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ActivityResultLauncher<Intent> activityResultLauncher;
    static final String KEY = "book_name";
    static final String USER_MESSAGE="MESSAGE";
    private TextView textViewBook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewBook = findViewById(R.id.textView);
        ActivityResultCallback<ActivityResult> callback = new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {
                if (result.getResultCode() == Activity.RESULT_OK) {
                    Intent data = result.getData();
                    String userBook = data.getStringExtra(USER_MESSAGE);
                    textViewBook.setText(userBook);
                }
            }
        };
        activityResultLauncher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                callback);
    }
    public void getInfoAboutBook(View v) {
        Intent intent = new Intent(this, ShareActivity.class);
        intent.putExtra(KEY,USER_MESSAGE);
        activityResultLauncher.launch(intent);
    }
}