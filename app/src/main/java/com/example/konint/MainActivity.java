package com.example.konint;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static String RES = "result";
    public static int req = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button12 = findViewById(R.id.but12);
        Button button13 = findViewById(R.id.but13);
        Button button14 = findViewById(R.id.but14);
        Button buttonb1 = findViewById(R.id.back1);
        TextView textView = findViewById(R.id.TV1);
        textView.setText("1");
        buttonb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String end = "Good end";
                Intent i = new Intent();
                i.putExtra(MainActivity.RES, end);
                setResult(RESULT_OK, i);
                finish();
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2.class);
                startActivityForResult(intent, req);
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main3.class);
                startActivityForResult(intent, req);
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main4.class);
                startActivityForResult(intent, req);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == req){
            String str = data.getStringExtra(RES);
            Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
        }
    }
}