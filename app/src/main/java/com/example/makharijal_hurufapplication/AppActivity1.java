package com.example.makharijal_hurufapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AppActivity1 extends AppCompatActivity implements View.OnClickListener {


    Button option1, option2, option3, option4;
    TextView textView;
    public static String[] arabicQuestions = new String[10];
    public static String[] arabicAnswers = new String[10];
    public static String[] correct = new String[10];
    public static int questionNo=0;
    public static int randindex = 0;
    public static int[] options = {-1,-1,-1,-1};
    String[] arabicLetters = {"أ ہ", "ع ح", "غ خ","ق", "ک", "ج ش ی", "ض", "ل","ن","ر","ت د ط", "ظ  ذ  ث", "ص ز س","م ن","ف","ب", "م", "و","باَ بوُ بىِ"};
    String[] sound = {"End of Throat", "Middle of Throat", "Start of the Throat", "Base of Tongue which is near Uvula touching the mouth roof",
    "Portion of Tongue near its base touching the roof of mouth", "Tongue touching the center of the mouth roof",
            "One side of the tongue touching the molar teeth","Rounded tip of the tongue touching the base of the frontal 8 teeth",
    "Rounded tip of the tongue touching the base of the frontal 6 teeth","Rounded tip of the tongue and some portion near it touching the base of the frontal 4 teeth",
    "Tip of the tongue touching the base of the front 2 teeth", "Tip of the tongue touching the tip of the frontal 2 teeth",
            "Tip of the tongue comes between the front top and bottom teeth", "While pronouncing the ending sound of  م  or ن , bring the vibration to the nose",
            "Tip of the two upper jaw teeth touches the inner part of the lower lip", "Inner part of the both lips touch each other",
            "Outer part of both lips touch each other","Rounding both lips and not closing the mouth","Mouth empty space while speaking words like  باَ بوُ بىِ"
    };

    public int getRandomindex(){
        int min =0;
        int max = 18;
        int random = (int) (Math.random()*(max-min+1)+min);
        return random;
    }
    public int generateRandomValue(int min, int max){
        return (int) (Math.random()*(max-min+1)+min);
    }
    public void setArabicLetter(){
        textView.setText(arabicLetters[randindex]);
    }
    public void fillUniqueIndexes(){
        options[0] = randindex;
        for(int i=1;i<4;i++){
            options[i] = getRandomindex();
        }
    }
    public void swapIndexes(){
        int swappingIndex;
        for(int i=0;i<4;i++){
            swappingIndex = generateRandomValue(0,3);
            int temp = options[swappingIndex];
            options[swappingIndex] = options[i];
            options[i] = temp;
        }
    }
    public void setOptions(){
        option1.setText(sound[options[0]]);
        option2.setText(sound[options[1]]);
        option3.setText(sound[options[2]]);
        option4.setText(sound[options[3]]);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app1);

        option1 = findViewById(R.id.btnOption1);
        option1.setOnClickListener(this);

        option2 = findViewById(R.id.btnOption2);
        option2.setOnClickListener(this);

        option3 = findViewById(R.id.btnOption3);
        option3.setOnClickListener(this);

        option4 = findViewById(R.id.btnOption4);
        option4.setOnClickListener(this);

        textView = findViewById(R.id.letterTextView);

        //logic
        randindex = getRandomindex();
        setArabicLetter();
        fillUniqueIndexes();
        swapIndexes();
        setOptions();
    }
    @Override
    public void onClick(View view) {

    }
}