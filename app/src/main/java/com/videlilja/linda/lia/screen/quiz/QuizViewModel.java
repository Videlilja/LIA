package com.videlilja.linda.lia.screen.quiz;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.videlilja.linda.lia.model.Categories;
import com.videlilja.linda.lia.model.CategoriesLiveData;
import com.videlilja.linda.lia.model.Category;
import com.videlilja.linda.lia.model.Games;
import com.videlilja.linda.lia.model.Quiz;
import com.videlilja.linda.lia.model.QuizLiveData;

import java.util.List;



public class QuizViewModel extends ViewModel {

    private QuizLiveData mQuiz = null;

    public void setmQuiz(Categories category) {
        mQuiz = new QuizLiveData(category);
    }

    public LiveData<List<Quiz>> getQuiz() {
        return mQuiz;
    }
}