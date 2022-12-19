package com.example.janyll.activities.listeners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.example.janyll.R;

public class d1 extends AppCompatActivity {

   Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_d1);
        button1=findViewById(R.id.button1);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.w3schools.com/cpp/default.asp");
            }
        });






    }
    private void goLink(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}