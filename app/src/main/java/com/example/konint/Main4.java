package com.example.konint;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Main4 extends AppCompatActivity {
    public static int req = 1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiry4);

        Intent i = getIntent();
        String str = i.getStringExtra(MainActivity.RES);

        Button button = findViewById(R.id.back4);
        Button button41 = findViewById(R.id.but41);
        Button button42 = findViewById(R.id.but42);
        Button button43 = findViewById(R.id.but43);
        TextView textView = findViewById(R.id.TV4);
        textView.setText("4");
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
        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main4.this, MainActivity.class);
                startActivityForResult(intent, req);
            }
        });
        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main4.this, Main2.class);
                startActivityForResult(intent, req);
            }
        });
        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main4.this, Main3.class);
                startActivityForResult(intent, req);
            }
        });
    }
}
