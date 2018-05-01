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

        while (options.size() < 4){
            int n = random.nextInt(quiz.size());
            if (!options.contains(quiz.get(n))) {
                options.add(quiz.get(n));
            }
        }

        mRightAnswer = options.get(random.nextInt(options.size()));
        mOptions.setValue(options);
    }

    public Quiz getmRightAnswer() {
        return mRightAnswer;
    }

    public LiveData<List<Quiz>> getQuiz() {
        return mOptions;
    }
}