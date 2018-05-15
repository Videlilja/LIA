package com.videlilja.linda.lia.model;

import android.arch.lifecycle.LiveData;

import com.videlilja.linda.lia.R;

import java.util.ArrayList;
import java.util.List;

public class GameLiveData extends LiveData<List<Game>> {

    public GameLiveData() {

        List<Game> games = new ArrayList<>();
        games.add(new Game(R.string.animals, Games.ANIMALS, R.drawable.animalsicon));
        games.add(new Game(R.string.nature, Games.NATURE, R.drawable.natureicon));
        //games.add(new Game(R.string.math, Games.MATH, R.drawable.mathicon));
        games.add(new Game(R.string.flags, Games.FLAGS, R.drawable.flagsicon));
        games.add(new Game(R.string.capitals, Games.CAPITALS, R.drawable.capitalsicon));
        games.add(new Game(R.string.words, Games.WORDS, R.drawable.wordtopicicon));

        setValue(games);

    }

}
