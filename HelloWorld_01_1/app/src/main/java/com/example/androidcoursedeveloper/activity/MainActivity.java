package com.example.androidcoursedeveloper.activity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.androidcoursedeveloper.R;

public class MainActivity extends AppCompatActivity {

    private TextView actionText;
    private final static String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        actionText = (TextView) findViewById(R.id.text_view);
        actionText.setText(R.string.congratulation);

        Log.e(TAG, String.valueOf(0 / 5));

    }

}

