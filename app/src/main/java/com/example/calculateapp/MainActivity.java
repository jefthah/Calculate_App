package com.example.calculateapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnMoveActivity;
    private Button btnHitungLuasLayangLayang;
    private Button btnHitungVolumeKubus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        btnHitungLuasLayangLayang = findViewById(R.id.btn_Luas_Layang_Layang);
        btnHitungLuasLayangLayang.setOnClickListener(this);

        btnHitungVolumeKubus = findViewById(R.id.btn_Volume_Kubus);
        btnHitungVolumeKubus.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_move_activity) {
            Intent intent = new Intent(MainActivity.this, HitungLuasSegitiga.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.btn_Luas_Layang_Layang) {
            Intent intent = new Intent(MainActivity.this, HitungLuasLayangLayang.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.btn_Volume_Kubus) {
            Intent intent = new Intent(MainActivity.this, HitungVolumeKubus.class);
            startActivity(intent);
        }
    }
}
