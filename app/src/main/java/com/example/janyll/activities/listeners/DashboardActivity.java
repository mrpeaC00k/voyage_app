package com.example.janyll.activities.listeners;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.janyll.R;
import com.example.janyll.activities.MainActivity;

public class DashboardActivity extends AppCompatActivity implements  View.OnClickListener {


    private CardView D1,D2,D3,D4,D5,D6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_dashboard);
        D1=(CardView)findViewById(R.id.d1);
        D2=(CardView)findViewById(R.id.d2);
        D3=(CardView)findViewById(R.id.d3);
        D4=(CardView)findViewById(R.id.d4);
        D5=(CardView)findViewById(R.id.d5);
        D6=(CardView)findViewById(R.id.d6);



        D1.setOnClickListener((View.OnClickListener)this);
        D2.setOnClickListener((View.OnClickListener)this);
        D3.setOnClickListener((View.OnClickListener)this);
        D4.setOnClickListener((View.OnClickListener)this);
        D5.setOnClickListener((View.OnClickListener)this);
        D6.setOnClickListener((View.OnClickListener)this);


    }
    @Override
    public void onClick(View v){

        Intent i;
        switch (v.getId()){
            case R.id.d1:i = new Intent(this,d1.class); startActivity(i); break;
            case R.id.d2:i = new Intent(this,d2.class);startActivity(i);break;
            case R.id.d3:i = new  Intent(this,d3.class);startActivity(i);break;
            case R.id.d4:i = new Intent(this,d4.class);startActivity(i);break;
            case R.id.d5:i = new Intent(this,d5.class);startActivity(i);break;
            case R.id.d6:i = new Intent(this,MainActivity.class);startActivity(i);break;




        }



    }




}