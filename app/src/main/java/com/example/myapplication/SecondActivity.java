package com.example.myapplication;

import static com.example.myapplication.MainActivity.SOME_VALUE;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "TEST2";
    public static final String NEW_EXTRA = "NEW_EXTRA";

    private String editableTxt = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: OnCreate");
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String string = intent.getStringExtra(SOME_VALUE);
        EditText textView = findViewById(R.id.textView);
        textView.setText(string);

        Button button = findViewById(R.id.button2);
        button.setOnClickListener(l -> {
            editableTxt = textView.getText().toString();
            Intent intent1 = new Intent();
            intent1.putExtra(NEW_EXTRA, editableTxt == null ? "No input txt" : editableTxt);
            setResult(RESULT_OK, intent1);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: onDestroy");
    }
}