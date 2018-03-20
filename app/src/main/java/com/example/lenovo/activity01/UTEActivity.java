package com.example.lenovo.activity01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UTEActivity extends AppCompatActivity {
    Button btnVietNam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ute);

        btnVietNam=(Button) findViewById(R.id.buttonVietNam);
        btnVietNam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ite=new Intent(UTEActivity.this, MainActivity.class);
                startActivity(ite);
            }
        });
    }
}
