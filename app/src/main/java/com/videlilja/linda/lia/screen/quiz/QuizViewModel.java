package com.videlilja.linda.lia.screen.quiz;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.NonNull;

import com.videlilja.linda.lia.model.Categories;
import com.videlilja.linda.lia.model.CategoriesLiveData;
import com.videlilja.linda.lia.model.Category;
import com.videlilja.linda.lia.model.Games;
import com.videlilja.linda.lia.model.Quiz;
import com.videlilja.linda.lia.model.QuizLiveData;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class QuizViewModel extends AndroidViewModel {

    private MutableLiveData<List<Quiz>> mOptions = new MutableLiveData<>();
    private Quiz mRightAnswer;

    public QuizViewModel(@NonNull Application application) {
        super(application);
    }

    public void setmQuiz(Categories category) {
        List<Quiz> quiz = new QuizLiveData(category, getApplication()).getValue();
        Random random = new Random();

        List<Quiz> options = new ArrayList<>();

        for(int i=0; i<4; i++){
            int n = random.nextInt(quiz.size());
            options.add(quiz.get(n));
        }

        mOptions.setValue(options);
        mRightAnswer = options.get(random.nextInt(options.size()));
    }

    public Quiz getmRightAnswer() {
        return mRightAnswer;
    }

    public LiveData<List<Quiz>> getQuiz() {
        return mOptions;
    }
}