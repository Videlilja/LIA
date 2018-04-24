package com.videlilja.linda.lia.screen.quiz;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.videlilja.linda.lia.model.Categories;
import com.videlilja.linda.lia.model.Quiz;
import com.videlilja.linda.lia.model.QuizLiveData;

import java.util.List;

public class QuizViewModel extends ViewModel{
    private QuizLiveData mData = null;

    public void setmData(Categories category){
        mData = new QuizLiveData(category);
    }

    public LiveData<List<Quiz>> getEntities(){
        return mData;
    }
}