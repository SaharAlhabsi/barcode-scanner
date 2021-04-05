package com.databoat.barcodescanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnScan = findViewById(R.id.btn_scan);
        btnScan.setOnClickListener(v -> openScannerActivity());
    }

    private void openScannerActivity() {
        Intent intent = new Intent(this, ScannerActivity.class);
        startActivity(intent);
    }
}