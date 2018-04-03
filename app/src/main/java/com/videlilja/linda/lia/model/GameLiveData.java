package com.videlilja.linda.lia.model;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

public class GameLiveData extends LiveData<List<Game>> {

    public GameLiveData() {

        List<Game> games = new ArrayList<>();
        games.add(new Game("Djur", Games.ANIMALS));
        games.add(new Game("Natur", Games.NATURE));
        games.add(new Game("Matte", Games.MATH));
        games.add(new Game("Flaggor", Games.FLAGS));
        games.add(new Game("Huvudstäder", Games.CAPITALS));

        setValue(games);

    }

}
