package com.videlilja.linda.lia.screen.home;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import com.videlilja.linda.lia.model.Game;
import com.videlilja.linda.lia.model.GameLiveData;
import java.util.List;

/**
 * Created by ilisa on 2018-04-02.
 */

public class HomeViewModel extends ViewModel{

    private final LiveData<List<Game>> mGames = new GameLiveData();

    public HomeViewModel() {

    }

    public LiveData<List<Game>> getGames() {
        return mGames;
    }
}