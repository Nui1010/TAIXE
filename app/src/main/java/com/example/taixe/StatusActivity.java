package com.example.taixe;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class StatusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chuavaoca);
        Button mbtnVaoCa = findViewById(R.id.btnVaoCa);
        ImageView mmenu = findViewById(R.id.menu);

        mbtnVaoCa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StatusActivity.this, SanSangDK.class);
                startActivity(intent);
            }
        });

        mmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(StatusActivity.this, ThuNhap.class);
                startActivity(intent1);
            }
        });
    }
}
