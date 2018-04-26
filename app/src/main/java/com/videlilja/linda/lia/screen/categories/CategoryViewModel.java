package com.videlilja.linda.lia.screen.categories;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import com.videlilja.linda.lia.model.CategoriesLiveData;
import com.videlilja.linda.lia.model.Category;
import com.videlilja.linda.lia.model.Games;
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