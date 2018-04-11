package com.videlilja.linda.lia.model;

import android.arch.lifecycle.LiveData;

import com.videlilja.linda.lia.R;

import java.util.ArrayList;
import java.util.List;

public class GameLiveData extends LiveData<List<Game>> {

    public GameLiveData() {

        List<Game> games = new ArrayList<>();
        games.add(new Game("Djur", Games.ANIMALS, R.drawable.smiley));
        games.add(new Game("Natur", Games.NATURE, R.drawable.smiley));
        games.add(new Game("Matte", Games.MATH, R.drawable.smiley));
        games.add(new Game("Flaggor", Games.FLAGS, R.drawable.smiley));
        games.add(new Game("Huvudstäder", Games.CAPITALS, R.drawable.smiley));
        games.add(new Game("Ord", Games.WORDS, R.drawable.smiley));

        setValue(games);

    }

}
