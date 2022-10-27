package com.example.tugas_pbp_kel4_formlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class loginActivity extends AppCompatActivity {
    TextView Rnama_form, Rtempat_lahir, Rtgl_lahir;
    String Resultnama, Resulttempat_lahir, Resulttgl_lahir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//
//        Resultnama = String.valueOf((TextView)findViewById(R.id.Rnama_form));
//        Resulttempat_lahir = String.valueOf((TextView)findViewById(R.id.Rtempat_lahir));
//        Resulttgl_lahir = String.valueOf((TextView)findViewById(R.id.Rtgl_lahir));
//
//        Bundle b = getIntent().getExtras();
//
//        Resultnama = b.putString("parse_nama");
//        Resulttempat_lahir = b.putString("parse_tempat_lahir");
//        Resulttgl_lahir = b.putString("parse_tgl_lahir");
//
//        Rnama_form.setText("");
//        Rtempat_lahir.setText("");
//        Rtgl_lahir.setText("");
    }
}