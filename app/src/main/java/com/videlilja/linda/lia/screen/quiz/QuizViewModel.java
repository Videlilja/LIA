package com.videlilja.linda.lia.screen.quiz;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import com.videlilja.linda.lia.model.Quiz;
import com.videlilja.linda.lia.model.QuizLiveData;

import java.util.List;

public class QuizViewModel extends ViewModel{

    private final LiveData<List<Quiz>> mQuiz = new QuizLiveData();

    public QuizViewModel() {

    }
    public LiveData<List<Quiz>> getQuiz() {
        return mQuiz;
    }
}