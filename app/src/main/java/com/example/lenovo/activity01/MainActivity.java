package com.example.lenovo.activity01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    Button  btnDaNang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDaNang=(Button) findViewById(R.id.buttonDaNang);
        btnDaNang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  ite=new Intent(MainActivity.this,DaNangActivity.class);
                startActivity(ite);
            }
        });
    }
}
