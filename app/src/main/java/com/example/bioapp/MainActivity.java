package com.example.bioapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText hobbiesEdtText;
    private Button btnAdd;
    private TextView hobbiesTxtView;
    private TextView bioTxtView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar_layout);

        hobbiesEdtText = (EditText) findViewById(R.id.hobbiesEdtText);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        hobbiesTxtView = (TextView) findViewById(R.id.hobbiesTxtView);
        bioTxtView = (TextView) findViewById(R.id.biotTxtView);

//
//        bioTxtView.setText("I'm Computer Science Student, I was born in Riyadh, \n" +
//                " I'm 22 years old, This is Android CourseYousef is a 22-year-old computer science student \n" +
//                "who was born and raised in the bustling city of Riyadh, Saudi Arabia. \n" +
//                "As a student, he spends a great deal of time studying and learning about the \n" +
//                "latest advancements in computer technology. He likely has a passion for programming languages, algorithms, and software development, \n" +
//                "and is always seeking new challenges to expand his knowledge and skills. Living in a city that is rapidly evolving and embracing technological progress, \n" +
//                "Yousef is well-positioned to contribute to the innovation and development of the field he loves.");


        bioTxtView.setText("I'm Computer Science Student, I was born in Riyadh," +
                " I'm 22 years old, This is Android CourseYousef is a 22-year-old computer science student" +
                " who was born and raised in the bustling city of Riyadh, Saudi Arabia." +
                " As a student, he spends a great deal of time studying and learning about the" +
                " latest advancements in computer technology. He likely has a passion for programming languages, algorithms, and software development," +
                " and is always seeking new challenges to expand his knowledge and skills. Living in a city that is rapidly evolving and embracing technological progress," +
                " Yousef is well-positioned to contribute to the innovation and development of the field he loves.");


        btnAdd.setOnClickListener(v -> {
            hobbiesTxtView.setVisibility(View.VISIBLE);
            String str = hobbiesEdtText.getText().toString();
            if (!(str.length() > 1)) {
                hobbiesTxtView.setVisibility(View.GONE);
            }
            hobbiesTxtView.setText(str);
        });

    }
}