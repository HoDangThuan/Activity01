package com.example.lenovo.activity01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DaNangActivity extends Activity {
    Button  btnUTE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_da_nang);

        btnUTE=(Button) findViewById(R.id.buttonUTE);
        btnUTE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ite=new Intent(DaNangActivity.this, UTEActivity.class);
                startActivity(ite);
            }
        });
    }
}
