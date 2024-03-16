package com.example.calculateapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class HitungVolumeKubus extends AppCompatActivity {

    private EditText etSisi;
    private Button btnHitungVolumeKubus;
    private TextView tvHasilVolumeKubus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_volume_kubus);

        etSisi = findViewById(R.id.et_sisi);
        btnHitungVolumeKubus = findViewById(R.id.btn_hitung_volume_kubus);
        tvHasilVolumeKubus = findViewById(R.id.tv_hasil_volume_kubus);

        btnHitungVolumeKubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolumeKubus();
            }
        });
    }

    private void hitungVolumeKubus() {
        try {
            double sisi = Double.parseDouble(etSisi.getText().toString());
            double volume = Math.pow(sisi, 3);
            tvHasilVolumeKubus.setText("Volume Kubus: " + volume);
            tvHasilVolumeKubus.setVisibility(View.VISIBLE);
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Masukkan panjang sisi yang valid", Toast.LENGTH_SHORT).show();
        }
    }
}
