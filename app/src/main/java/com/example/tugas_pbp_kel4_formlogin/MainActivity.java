package com.example.tugas_pbp_kel4_formlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nama_form = findViewById(R.id.nama_form);
        EditText email_form = findViewById(R.id.tempat_lahir);
        EditText tgl_lahir = findViewById(R.id.tgl_lahir);
        Button login = findViewById(R.id.regis);
    }
}