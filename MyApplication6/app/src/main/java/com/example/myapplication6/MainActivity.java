package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Student student1 = new Student("يوسف",14,12,R.drawable.boy1);

        Student student2 = new Student("سلمان",13,10,R.drawable.boy1);

        Student student3 = new Student("ماجد",15,11,R.drawable.boy1);


    }
}