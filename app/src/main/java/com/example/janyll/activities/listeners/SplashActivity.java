package com.example.janyll.activities.listeners;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.example.janyll.R;
import com.example.janyll.activities.MainActivity;
import com.example.janyll.activities.SignInActivity;


public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                        startActivity(new Intent(SplashActivity.this,SignInActivity.class));

            }
        },3500);



        }

    }

