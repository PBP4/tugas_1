package com.example.tugas_pbp_kel4_formlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class loginActivity extends AppCompatActivity {
    TextView Rnama_form, Rtempat_lahir, Rtgl_lahir;
    String Resultnama, Resulttempat_lahir, Resulttgl_lahir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Rnama_form = findViewById(R.id.Rnama_form);
        Rtempat_lahir = findViewById(R.id.Rtempat_lahir);
        Rtgl_lahir = findViewById(R.id.Rtgl_lahir);

        Bundle b = getIntent().getExtras();

        Resultnama = b.getString("parse_nama");
        Resulttempat_lahir = b.getString("parse_tempat_lahir");
        Resulttgl_lahir = b.getString("parse_tgl_lahir");

        Rnama_form.setText(String.format("%s", Resultnama));
        Rtempat_lahir.setText(String.format("%s", Resulttempat_lahir));
        Rtgl_lahir.setText(String.format("%s", Resulttgl_lahir));

        Button back = findViewById(R.id.back);
        back.setOnClickListener(v -> {
            Intent i = new Intent(loginActivity.this, MainActivity.class);
            startActivity(i);
        });
    }

}