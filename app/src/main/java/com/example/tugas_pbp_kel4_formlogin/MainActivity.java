package com.example.tugas_pbp_kel4_formlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Calendar;
public class MainActivity extends AppCompatActivity {
    String nama_form, tempat_lahir, tgl_lahir;
    EditText Inputnama, Inputtempat_lahir, Inputtgl_lahir;
    TextView rError;
    private static final String TAG = "MainActivity";
    private TextView mDisplayDate;
    private DatePickerDialog.OnDateSetListener mDataSetListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Inputnama = (EditText)findViewById(R.id.nama_form);
        Inputtempat_lahir = (EditText)findViewById(R.id.tempat_lahir);
        Inputtgl_lahir = (EditText)findViewById(R.id.tgl_lahir);
        rError = (TextView) findViewById(R.id.result_error);

        mDisplayDate = (EditText) findViewById(R.id.tgl_lahir);
        mDisplayDate.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(MainActivity.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDataSetListener, year, month, day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        //koment
        mDataSetListener = new DatePickerDialog.OnDateSetListener(){
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day){
                Log.d(TAG, "onDateSet: mm/dd/yyyy: "+month+"/"+day+"/"+year);
                String date = month + "/" + day + "/" + year;
                mDisplayDate.setText(date);
            }
        };
        Button submit = (Button)findViewById(R.id.regis);
        submit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                nama_form = Inputnama.getText().toString();
                tempat_lahir = Inputtempat_lahir.getText().toString();
                tgl_lahir = Inputtgl_lahir.getText().toString();
                if(!TextUtils.isEmpty(nama_form) || !TextUtils.isEmpty(tempat_lahir) || !TextUtils.isEmpty(tgl_lahir)){
                    Intent i = null;
                    i = new Intent(MainActivity.this, loginActivity.class);
                    Bundle b = new Bundle();
                    b.putString("parse_nama",nama_form);
                    b.putString("parse_tempat_lahir",tempat_lahir);
                    b.putString("parse_tgl_lahir",tgl_lahir);

                    i.putExtras(b);
                    startActivity(i);
                } else {
                rError.setText("Error! Form tidak boleh kosong.");
                }
            }
        });
    }
}