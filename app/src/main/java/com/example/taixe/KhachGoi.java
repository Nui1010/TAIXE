package com.example.taixe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class KhachGoi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.khachdanggoi);
        Button mbtnVaoCa = findViewById(R.id.btnDY);

        mbtnVaoCa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KhachGoi.this, DonKhach.class);
                startActivity(intent);
            }
        });
    }
}
