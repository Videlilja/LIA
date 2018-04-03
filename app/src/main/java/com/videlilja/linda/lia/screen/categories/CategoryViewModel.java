package com.videlilja.linda.lia.screen.categories;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.NonNull;
import android.widget.Switch;
import android.widget.Toast;

import com.videlilja.linda.lia.model.CategoriesLiveData;
import com.videlilja.linda.lia.model.Category;
import com.videlilja.linda.lia.model.Game;
import com.videlilja.linda.lia.model.Games;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ilisa on 2018-03-26.
 */

public class CategoryViewModel extends ViewModel {

    private CategoriesLiveData mData = null;


    public void setmData(Games game) {
        mData = new CategoriesLiveData(game);
    }

    public LiveData<List<Category>> getEntities() {
        return mData;
    }

}
