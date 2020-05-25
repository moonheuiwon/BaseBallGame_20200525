package com.example.baseballgame_20200525;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;

import com.example.baseballgame_20200525.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    ActivityMainBinding binding;
    int[]  questoinArr = new int[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setupEvents();
        setValues();
    }
    public void setupEvents() {

    }
    public void setValues() {
        makeQuestion();
    }
    void makeQuestion() {
        for (int i=0; i < questoinArr.length; i++) {
            while (true) {

                int randomNum = (int) (Math.random() * 9 + 1);

                boolean isDuplOk = true;
                for (int num : questoinArr) {
                    if (num == randomNum) {
                        isDuplOk = false;
                        break;
                    }
                }
                if (isDuplOk) {
                    questoinArr[i] = randomNum;
                    break;
                }
            }
        }
        for (int num : questoinArr) {
            Log.d("문제숫자",num+"");
        }
    }
}
