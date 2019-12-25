package com.example.androidcoursedeveloper.activity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.androidcoursedeveloper.R;

public class MainActivity extends AppCompatActivity {

    TextView genText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        final String congratulation = "Happy Birthday to Petya";

        genText = (TextView) findViewById(R.id.text_gen_id);
        genText.setText(congratulation);

        Log.e("division zero", String.valueOf(0 / 5));

    }

}

