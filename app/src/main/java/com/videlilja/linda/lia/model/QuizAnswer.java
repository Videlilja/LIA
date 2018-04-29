package com.videlilja.linda.lia.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class QuizAnswer {

    Random answer = new Random();

    private List<Quiz> quizList = new ArrayList<>();

    public int getAnswer(){
        int n = answer.nextInt(quizList.size());

        return quizList.indexOf(n);
    }
}