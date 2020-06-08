package com.dropoutsolution.bell.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.dropoutsolution.bell.R;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent gotomain = new Intent(Splash.this , LocationActivity.class);
                startActivity(gotomain);
                finish();
            }
        },3000);
    }
}