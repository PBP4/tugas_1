package com.example.tugas_pbp_kel4_formlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String nama_form, tempat_lahir, tgl_lahir;
    EditText Inputnama, Inputtempat_lahir, Inputtgl_lahir;
    TextView rError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Inputnama = findViewById(R.id.nama_form);
        Inputtempat_lahir = findViewById(R.id.tempat_lahir);
        Inputtgl_lahir = findViewById(R.id.tgl_lahir);
        rError = findViewById(R.id.result_error);

        Button submit = findViewById(R.id.regis);
        submit.setOnClickListener(this::onClick);
    }

    private void onClick(View view) {
        nama_form = Inputnama.getText().toString();
        tempat_lahir = Inputtempat_lahir.getText().toString();
        tgl_lahir = Inputtgl_lahir.getText().toString();
        if (!TextUtils.isEmpty(nama_form) && !TextUtils.isEmpty(tempat_lahir) && !TextUtils.isEmpty(tgl_lahir)) {
            Intent i = new Intent(MainActivity.this, loginActivity.class);
            Bundle b = new Bundle();

            b.putString("parse_nama", nama_form);
            b.putString("parse_tempat_lahir", tempat_lahir);
            b.putString("parse_tgl_lahir", tgl_lahir);

            i.putExtras(b);
            startActivity(i);
        } else {
            rError.setBackgroundResource(R.color.red);
            rError.setTextColor(getResources().getColor(R.color.white));
            rError.setText("Error! Form tidak boleh kosong.");
        }
    }
}