package com.example.calculateapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class HitungLuasSegitiga extends AppCompatActivity {

    private EditText etAlas, etTinggi;
    private Button btnHitungLuasSegitiga;
    private TextView tvHasilLuasSegitiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_luas_segitiga);

        etAlas = findViewById(R.id.et_alas);
        etTinggi = findViewById(R.id.et_tinggi);
        btnHitungLuasSegitiga = findViewById(R.id.btn_hitung_luas_segitiga);
        tvHasilLuasSegitiga = findViewById(R.id.tv_hasil_luas_segitiga);

        btnHitungLuasSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasSegitiga();
            }
        });
    }

    private void hitungLuasSegitiga() {
        try {
            double alas = Double.parseDouble(etAlas.getText().toString());
            double tinggi = Double.parseDouble(etTinggi.getText().toString());
            double luas = (alas * tinggi) / 2;
            tvHasilLuasSegitiga.setText("Luas Segitiga: " + luas);
            tvHasilLuasSegitiga.setVisibility(View.VISIBLE);
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Masukkan alas dan tinggi yang valid", Toast.LENGTH_SHORT).show();
        }
    }
}

