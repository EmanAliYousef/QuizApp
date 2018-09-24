package com.example.android.quizyourmath;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.HashSet;

public class MainActivity extends AppCompatActivity {


    int firstQuestionAnswer1 = 7;
    String firstQuestionAnswer2 = "2 * 10 - 13";
    boolean secondQuestionAnswer = true;
    int thirdQuestionAnswer = 998;
    String fourthQuestionAnswer = "3,7";
    int fifthQuestionAnswer = 12210;
    int score1;
    int score2;
    int score3;
    int score4;
    int score5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //displaying answer  for first question
    public void viewAnswer1(View view) {

        Toast.makeText(getBaseContext(), getString(R.string.AnswerMessage) + firstQuestionAnswer2 + "\n" + firstQuestionAnswer1, Toast.LENGTH_SHORT).show();
    }

    //if answer is not submitted  for any question ,QuestionScore Stills Equal Zero

    //Submit answer for first Question
    public void submit1(View view) {
        score1 = 0;
        CheckBox first = (CheckBox) findViewById(R.id.FQA1);

        CheckBox second = (CheckBox) findViewById(R.id.FQA2);

        CheckBox third = (CheckBox) findViewById(R.id.FQA3);

        if (first.isChecked() && third.isChecked() && !second.isChecked()) {
            score1 = 1;


            Toast.makeText(getBaseContext(), getString(R.string.PassQuestionMessage) + "\n" + getString(R.string.QuestionScoreMessage) + score1, Toast.LENGTH_SHORT).show();

        }

        if (first.isChecked() && third.isChecked() && second.isChecked()) {
            score1 = 0;


            Toast.makeText(getBaseContext(), getString(R.string.FalseQuestionMessage) + "\n" + getString(R.string.QuestionScoreMessage) + score1, Toast.LENGTH_SHORT).show();

        }

        if (first.isChecked() && !third.isChecked() && !second.isChecked()) {
            score1 = 0;


            Toast.makeText(getBaseContext(), getString(R.string.FalseQuestionMessage) + "\n" + getString(R.string.QuestionScoreMessage) + score1, Toast.LENGTH_SHORT).show();


        }

        if (!first.isChecked() && !third.isChecked() && second.isChecked()) {
            score1 = 0;


            Toast.makeText(getBaseContext(), getString(R.string.FalseQuestionMessage) + "\n" + getString(R.string.QuestionScoreMessage) + score1, Toast.LENGTH_SHORT).show();


        }

        if (!first.isChecked() && third.isChecked() && !second.isChecked()) {
            score1 = 0;


            Toast.makeText(getBaseContext(), getString(R.string.FalseQuestionMessage) + "\n" + getString(R.string.QuestionScoreMessage) + score1, Toast.LENGTH_SHORT).show();


        }

        if (first.isChecked() && third.isChecked() && second.isChecked()) {
            score1 = 0;


            Toast.makeText(getBaseContext(), getString(R.string.FalseQuestionMessage) + "\n" + getString(R.string.QuestionScoreMessage) + score1, Toast.LENGTH_SHORT).show();


        }
        if (!first.isChecked() && third.isChecked() && second.isChecked()) {
            score1 = 0;


            Toast.makeText(getBaseContext(), getString(R.string.FalseQuestionMessage) + "\n" + getString(R.string.QuestionScoreMessage) + score1, Toast.LENGTH_SHORT).show();


        }


    }

    //displaying answer  for second question
    public void viewAnswer2(View view) {

        Toast.makeText(getBaseContext(), "Answer is " + secondQuestionAnswer, Toast.LENGTH_SHORT).show();
    }

    //Submit answer for second Question
    public void submit2(View view) {

        RadioButton first = (RadioButton) findViewById(R.id.yes);


        if (first.isChecked()) {
            score2 = 1;

            Toast.makeText(getBaseContext(), getString(R.string.PassQuestionMessage) + "\n" + getString(R.string.QuestionScoreMessage) + score2, Toast.LENGTH_SHORT).show();

        } else {
            score2 = 0;
            Toast.makeText(getBaseContext(), getString(R.string.FalseQuestionMessage) + "\n" + getString(R.string.QuestionScoreMessage) + score2, Toast.LENGTH_SHORT).show();

        }
    }

    //displaying answer  for third question

    public void viewAnswer3(View view) {


        Toast.makeText(getBaseContext(), getString(R.string.AnswerMessage) + thirdQuestionAnswer, Toast.LENGTH_SHORT).show();
    }

    public void submit3(View view) {
        EditText thirdQuestion = (EditText) findViewById(R.id.evenNumbers);
        String answer = thirdQuestion.getText().toString();

        int ans = Integer.parseInt(answer);


        if (ans == thirdQuestionAnswer) {

            score3 = 1;
            Toast.makeText(getBaseContext(), getString(R.string.PassQuestionMessage) + "\n" + getString(R.string.QuestionScoreMessage) + score3, Toast.LENGTH_SHORT).show();
        } else {
            score3 = 0;
            Toast.makeText(getBaseContext(), getString(R.string.FalseQuestionMessage) + "\n" + getString(R.string.QuestionScoreMessage) + score3, Toast.LENGTH_SHORT).show();

        }
    }

    //displaying answer  for Fourth question
    public void viewAnswer4(View view) {


        Toast.makeText(getBaseContext(), getString(R.string.AnswerMessage) + fourthQuestionAnswer, Toast.LENGTH_SHORT).show();
    }


    //Submit answer for fourth Question


    public void submit4(View view) {

        RadioButton correctAnswer = (RadioButton) findViewById(R.id.yes2);


        if (correctAnswer.isChecked()) {
            score4 = 1;
            Toast.makeText(getBaseContext(), getString(R.string.PassQuestionMessage) + "\n" + getString(R.string.QuestionScoreMessage) + score4, Toast.LENGTH_SHORT).show();

        } else {
            score4 = 0;
            Toast.makeText(getBaseContext(), getString(R.string.FalseQuestionMessage) + "\n" + getString(R.string.QuestionScoreMessage) + score4, Toast.LENGTH_SHORT).show();

        }


    }

    //displaying answer  for Fifth question
    public void viewAnswer5(View view) {

        Toast.makeText(getBaseContext(), getString(R.string.AnswerMessage) + fifthQuestionAnswer, Toast.LENGTH_SHORT).show();
    }

    //Submit answer for fifth Question

    public void submit5(View view) {

        EditText fifthQuestion = (EditText) findViewById(R.id.Aq5);
        String answer = fifthQuestion.getText().toString().trim();

        int ans = Integer.parseInt(answer);


        if (fifthQuestionAnswer == ans) {

            score5 = 1;
            Toast.makeText(getBaseContext(), getString(R.string.PassQuestionMessage) + "\n" + getString(R.string.QuestionScoreMessage) + score5, Toast.LENGTH_SHORT).show();
        } else {
            score5 = 0;
            Toast.makeText(getBaseContext(), getString(R.string.FalseQuestionMessage) + "\n" + getString(R.string.QuestionScoreMessage) + score5, Toast.LENGTH_SHORT).show();

        }
    }

    //This method displays the result of your Test
    private void displayTotalScore() {
        int totalScore = score1 + score2 + score3 + score4 + score5;

        if (totalScore >= 3) {


            Toast.makeText(getBaseContext(), getString(R.string.PassingExamessage) + "\n" + getString(R.string.TotalScoreMessage) + totalScore, Toast.LENGTH_SHORT).show();
        } else {


            Toast.makeText(getBaseContext(), getString(R.string.RetestExamessage) + "\n" + getString(R.string.TotalScoreMessage) + totalScore, Toast.LENGTH_SHORT).show();
        }

    }

    //by clicking on this button ,The TotalScore will appear
    public void totalScore(View view) {

        displayTotalScore();
    }


}

