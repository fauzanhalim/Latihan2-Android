//Tanggal pengerjaan : 07 April 2021
//NIM : 10118402
//Nama : Yolanda Patricia
//Kelas : IF-10

package com.example.tugas1_akb_10118402;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    private static int SplashTimeOut = 3000;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                intent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
         }, SplashTimeOut);
    }
}