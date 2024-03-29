package com.example.makharijal_hurufapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity3 extends AppCompatActivity implements View.OnClickListener {

    Button btnNext, btnSkip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home3);

        btnNext = findViewById(R.id.button);
        btnNext.setOnClickListener(this);

        btnSkip = findViewById(R.id.button2);
        btnSkip.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch(view.getId()){
            case R.id.button:
                intent = new Intent(HomeActivity3.this, HomeActivity4.class);
                finish();
                startActivity(intent);
                break;
            case R.id.button2:
                intent = new Intent(HomeActivity3.this, AppActivity1.class);
                finish();
                startActivity(intent);
                break;
        }
    }
}