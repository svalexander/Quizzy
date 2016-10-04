package com.example.c4q.quizzy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Intent intent= new Intent(SplashActivity.this, QuizActivity.class);
        startActivity(intent);
        //can also write the context as this or getApplicationContext() instead of SplashActivity.this,
        //all the above are acceptable to pass the context to the intent
        //the context in the parameter is telling the app where you are starting
    }
}
