package com.example.janyll.activities.listeners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.janyll.R;

public class d5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_d5);
    }
}