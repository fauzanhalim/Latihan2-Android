//Tanggal pengerjaan : 07 April 2021 - 08 April 2021
//NIM : 10118402
//Nama : Yolanda Patricia
//Kelas : IF-10

package com.example.tugas1_akb_10118402;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ornach.nobobutton.NoboButton;

public class RegisterActivity extends AppCompatActivity {

    NoboButton btnNextRegist;
    Button btnPrevRegist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initView();
        setView();
    }

    public void initView() {
        btnNextRegist = findViewById(R.id.btn_next_register);
        btnPrevRegist = findViewById(R.id.btn_prev_register);
    }

    public void setView() {
        btnNextRegist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //action
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        btnPrevRegist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //action
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

    }
}