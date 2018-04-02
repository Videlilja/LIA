package com.videlilja.linda.lia.screen.home;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.videlilja.linda.lia.model.Home;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ilisa on 2018-04-02.
 */

public class HomeViewModel extends ViewModel{
    private final MutableLiveData<List<Home>> mData = new MutableLiveData<>();

    public HomeViewModel() {
        // fyll en lista med 6 strängar från klassen Home.
        List<Home> data = new ArrayList<>();
        for (int i = 0; i < 6; ++i) {
            data.add(new Home("Djur" + i));
        }
        mData.setValue(data);
    }
    public LiveData<List<Home>> getEntities() {
        return mData; }
}