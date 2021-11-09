package com.example.makharijal_hurufapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class AppActivity2 extends AppCompatActivity {
    TextView[] row1 = new TextView[3];
    TextView[] row2 = new TextView[3];
    TextView[] row3 = new TextView[3];
    TextView[] row4 = new TextView[3];
    TextView[] row5 = new TextView[3];
    TextView[] row6 = new TextView[3];
    TextView[] row7 = new TextView[3];
    TextView[] row8 = new TextView[3];
    TextView[] row9 = new TextView[3];
    TextView[] row10 = new TextView[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        String [] questions = intent.getStringArrayExtra("string-question");
        String [] answers = intent.getStringArrayExtra("string-answers");
        String [] correct = intent.getStringArrayExtra("correctAnswers");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app2);

        row1[0] = findViewById(R.id.tcol0_row0);
        row1[1] = findViewById(R.id.tcol1_row0);
        row1[2] = findViewById(R.id.tcol2_row0);

        row1[0].setText(questions[0]);
        row1[1].setText(answers[0]);
        row1[2].setText(correct[0]);

        row2[0] = findViewById(R.id.tcol0_row1);
        row2[1] = findViewById(R.id.tcol1_row1);
        row2[2] = findViewById(R.id.tcol2_row1);

        row2[0].setText(questions[1]);
        row2[1].setText(answers[1]);
        row2[2].setText(correct[1]);

        row3[0] = findViewById(R.id.tcol0_row2);
        row3[1] = findViewById(R.id.tcol1_row2);
        row3[2] = findViewById(R.id.tcol2_row2);

        row3[0].setText(questions[2]);
        row3[1].setText(answers[2]);
        row3[2].setText(correct[2]);

        row4[0] = findViewById(R.id.tcol0_row3);
        row4[1] = findViewById(R.id.tcol1_row3);
        row4[2] = findViewById(R.id.tcol2_row3);

        row4[0].setText(questions[3]);
        row4[1].setText(answers[3]);
        row4[2].setText(correct[3]);

        row5[0] = findViewById(R.id.tcol0_row4);
        row5[1] = findViewById(R.id.tcol1_row4);
        row5[2] = findViewById(R.id.tcol2_row4);

        row5[0].setText(questions[4]);
        row5[1].setText(answers[4]);
        row5[2].setText(correct[4]);

        row6[0] = findViewById(R.id.tcol0_row5);
        row6[1] = findViewById(R.id.tcol1_row5);
        row6[2] = findViewById(R.id.tcol2_row5);

        row6[0].setText(questions[5]);
        row6[1].setText(answers[5]);
        row6[2].setText(correct[5]);

        row7[0] = findViewById(R.id.tcol0_row6);
        row7[1] = findViewById(R.id.tcol1_row6);
        row7[2] = findViewById(R.id.tcol2_row6);

        row7[0].setText(questions[6]);
        row7[1].setText(answers[6]);
        row7[2].setText(correct[6]);

        row8[0] = findViewById(R.id.tcol0_row7);
        row8[1] = findViewById(R.id.tcol1_row7);
        row8[2] = findViewById(R.id.tcol2_row7);

        row8[0].setText(questions[7]);
        row8[1].setText(answers[7]);
        row8[2].setText(correct[7]);

        row9[0] = findViewById(R.id.tcol0_row8);
        row9[1] = findViewById(R.id.tcol1_row8);
        row9[2] = findViewById(R.id.tcol2_row8);

        row9[0].setText(questions[8]);
        row9[1].setText(answers[8]);
        row9[2].setText(correct[8]);

        row10[0] = findViewById(R.id.tcol0_row9);
        row10[1] = findViewById(R.id.tcol1_row9);
        row10[2] = findViewById(R.id.tcol2_row9);

        row10[0].setText(questions[9]);
        row10[1].setText(answers[9]);
        row10[2].setText(correct[9]);

    }
}