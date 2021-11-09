package com.example.makharijal_hurufapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity7 extends AppCompatActivity implements View.OnClickListener{

    Button btnStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home7);
        btnStart = findViewById(R.id.button2);
        btnStart.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch(view.getId()){
            case R.id.button2:
                intent = new Intent(HomeActivity7.this, AppActivity1.class);
                finish();
                startActivity(intent);
                break;
        }
    }
}