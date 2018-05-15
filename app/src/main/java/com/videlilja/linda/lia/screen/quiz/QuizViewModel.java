package com.videlilja.linda.lia.screen.quiz;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Pair;
import android.view.View;
import android.widget.Button;

import com.videlilja.linda.lia.R;
import com.videlilja.linda.lia.model.Categories;
import com.videlilja.linda.lia.model.CategoriesLiveData;
import com.videlilja.linda.lia.model.Category;
import com.videlilja.linda.lia.model.Games;
import com.videlilja.linda.lia.model.Quiz;
import com.videlilja.linda.lia.model.QuizLiveData;
import com.videlilja.linda.lia.screen.endofgame.EndOfGameActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class QuizViewModel extends AndroidViewModel {

    private MutableLiveData<List<Quiz>> mOptions = new MutableLiveData<>();
    private Quiz mRightAnswer;

    public int rightAnswers = 0;
    public MutableLiveData<Pair<Boolean, Quiz>> rightAnswer = new MutableLiveData<>();
    public int amountA = 0;
    public boolean perfect = false;

    public QuizViewModel(@NonNull Application application) {
        super(application);
        rightAnswer.setValue(new Pair<Boolean, Quiz>(false, null));
        perfect = false;
        rightAnswers = 0;
        amountA = 0;
    }

    public void setmQuiz(Categories category) {
        List<Quiz> quiz = new QuizLiveData(category, getApplication()).getValue();
        Random random = new Random();
        List<Quiz> options = new ArrayList<>();

        while (options.size() < 4) {
            int n = random.nextInt(quiz.size());
            if (!options.contains(quiz.get(n))) {
                options.add(quiz.get(n));
            }
        }

        mRightAnswer = options.get(random.nextInt(options.size()));
        mOptions.setValue(options);
        rightAnswer.setValue(new Pair<Boolean, Quiz>(false, null));
    }

    public Quiz getmRightAnswer() {
        return mRightAnswer;
    }

    public LiveData<List<Quiz>> getQuiz() {
        return mOptions;
    }

    public void quizClicked(Quiz quiz) {
        if (rightAnswer.getValue() != null) {
            if (!rightAnswer.getValue().first) {
                if (quiz == getmRightAnswer()) {
                    //RÄTT SVAR
                    rightAnswer.setValue(new Pair<>(true, quiz));
                    rightAnswers = rightAnswers + 1;
                    amountA = amountA + 1;
                } else {
                    //FEL SVAR
                    rightAnswer.setValue(new Pair<>(false, quiz));
                    amountA = amountA + 1;
                }
            }

        }
    }

}