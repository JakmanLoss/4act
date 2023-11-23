package com.example.konint;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Main3 extends AppCompatActivity {
    public static int req = 1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);

        Intent i = getIntent();
        String str = i.getStringExtra(MainActivity.RES);

        Button button = findViewById(R.id.back3);
        Button button31 = findViewById(R.id.but31);
        Button button32 = findViewById(R.id.but32);
        Button button34 = findViewById(R.id.but34);
        TextView textView = findViewById(R.id.TV3);
        textView.setText("3");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String end = "Good end";
                Intent i = new Intent();
                i.putExtra(MainActivity.RES, end);
                setResult(RESULT_OK, i);
                finish();
            }
        });
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3.this, MainActivity.class);
                startActivityForResult(intent, req);
            }
        });
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3.this, Main2.class);
                startActivityForResult(intent, req);
            }
        });
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3.this, Main4.class);
                startActivityForResult(intent, req);
            }
        });
    }
}
