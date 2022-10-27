package com.example.tugas_pbp_kel4_formlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String nama_form, tempat_lahir, tgl_lahir;
    EditText Inputnama, Inputtempat_lahir, Inputtgl_lahir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Inputnama = (EditText)findViewById(R.id.nama_form);
        Inputtempat_lahir = (EditText)findViewById(R.id.tempat_lahir);
        Inputtgl_lahir = (EditText)findViewById(R.id.tgl_lahir);

        Button submit = (Button)findViewById(R.id.regis);
        submit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
//                Inputnama.setText("Nama");
//                Inputtempat_lahir.setText("Semarang");
//                Inputtgl_lahir.setText("18-10-2022");
                nama_form = Inputnama.getText().toString();
                tempat_lahir = Inputtempat_lahir.getText().toString();
                tgl_lahir = Inputtgl_lahir.getText().toString();
                Intent i = null;
                i = new Intent(MainActivity.this, loginActivity.class);
                Bundle b = new Bundle();
                b.putString("parse_nama",nama_form);
                b.putString("parse_tempat_lahir",tempat_lahir);
                b.putString("parse_tgl_lahir",tgl_lahir);

                i.putExtras(b);
                startActivity(i);
            }
        });
    }
}