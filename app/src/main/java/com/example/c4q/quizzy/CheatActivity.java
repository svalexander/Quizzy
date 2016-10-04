package com.example.c4q.quizzy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CheatActivity extends QuizActivity {

    private static final int Status_Cheated = 222;
    private Question currentQuestion;
    private Question[] copyQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button button = (Button) findViewById(R.id.cheat_button);
        copyQuestion = super.questionBank;

        button.setVisibility(View.GONE); // gone removes it vs invisible which sets it invisible
        TextView questionTV = (TextView) findViewById(R.id.question_text_view);
        Intent intent = getIntent();
        int myIndex = intent.getExtras().getInt("Current Index");
        currentQuestion = copyQuestion[myIndex];
        boolean answer = currentQuestion.isAnswerTrue();
        questionTV.setText(currentQuestion.getTextResId()) ;
        questionTV.append(": " +  answer); //have to append the answer b/c the answer is the
//        String myQuestion = intent.getExtras().getString("Current Question");
//        boolean myAnswer = intent.getExtras().getBoolean("Current Answer");
//        questionTV.setText(myQuestion + ": " + myAnswer);
    }
}
