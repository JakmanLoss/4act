package com.example.konint;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Main2 extends AppCompatActivity {
    public static int req = 1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        Intent i = getIntent();
        String str = i.getStringExtra(MainActivity.RES);

        Button buttonb2 = findViewById(R.id.back2);
        Button button21 = findViewById(R.id.but21);
        Button button23 = findViewById(R.id.but23);
        Button button24 = findViewById(R.id.but24);
        TextView textView = findViewById(R.id.TV2);
        textView.setText("2");
        buttonb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String end = "Good end";
                Intent i = new Intent();
                i.putExtra(MainActivity.RES, end);
                setResult(RESULT_OK, i);
                finish();
            }
        });
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2.this, MainActivity.class);
                startActivityForResult(intent, req);
            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2.this, Main3.class);
                startActivityForResult(intent, req);
            }
        });
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2.this, Main4.class);
                startActivityForResult(intent, req);
            }
        });
    }
}
