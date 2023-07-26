package com.example.taixe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SanSangDK extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sansangdonkhach);
        Button mbtnBD = findViewById(R.id.btnBD);

        mbtnBD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SanSangDK.this, KhachGoi.class);
                startActivity(intent);
            }
        });
    }
}