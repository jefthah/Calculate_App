package com.example.calculateapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class HitungLuasLayangLayang extends AppCompatActivity {

    private EditText etDiagonal1, etDiagonal2;
    private Button btnHitungLuasLayangLayang;
    private TextView tvHasilLuasLayangLayang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_luas_layang_layang);

        etDiagonal1 = findViewById(R.id.et_diagonal1);
        etDiagonal2 = findViewById(R.id.et_diagonal2);
        btnHitungLuasLayangLayang = findViewById(R.id.btn_hitung_luas_layang_layang);
        tvHasilLuasLayangLayang = findViewById(R.id.tv_hasil_luas_layang_layang);

        btnHitungLuasLayangLayang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasLayangLayang();
            }
        });
    }

    private void hitungLuasLayangLayang() {
        try {
            double diagonal1 = Double.parseDouble(etDiagonal1.getText().toString());
            double diagonal2 = Double.parseDouble(etDiagonal2.getText().toString());
            double luas = (diagonal1 * diagonal2) / 2;
            tvHasilLuasLayangLayang.setText("Luas Layang-layang: " + luas);
            tvHasilLuasLayangLayang.setVisibility(View.VISIBLE);
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Masukkan diagonal 1 dan diagonal 2 yang valid", Toast.LENGTH_SHORT).show();
        }
    }
}