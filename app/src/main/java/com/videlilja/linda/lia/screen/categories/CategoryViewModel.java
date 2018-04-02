package com.videlilja.linda.lia.screen.categories;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.videlilja.linda.lia.model.Category;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ilisa on 2018-03-26.
 */

public class CategoryViewModel extends ViewModel {

    private final MutableLiveData<List<Category>> mData = new MutableLiveData<>();

    public CategoryViewModel() {
        // fyll en lista med 6 strängar från klassen Category.
        List<Category> data = new ArrayList<>();
        for (int i = 0; i < 6; ++i) {
            data.add(new Category("Europa" + i));
        }
        mData.setValue(data);
    }
    public LiveData<List<Category>> getEntities() {
        return mData;
    }
}
