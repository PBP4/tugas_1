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

        Rnama_form = (TextView)findViewById(R.id.Rnama_form);
        Rtempat_lahir = (TextView)findViewById(R.id.Rtempat_lahir);
        Rtgl_lahir = (TextView)findViewById(R.id.Rtgl_lahir);

        Bundle b = getIntent().getExtras();

        Resultnama = b.getString("parse_nama");
        Resulttempat_lahir = b.getString("parse_tempat_lahir");
        Resulttgl_lahir = b.getString("parse_tgl_lahir");

        Rnama_form.setText(""+Resultnama);
        Rtempat_lahir.setText(""+Resulttempat_lahir);
        Rtgl_lahir.setText(""+Resulttgl_lahir);

        Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(loginActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

}