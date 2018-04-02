package com.videlilja.linda.lia.model;

import com.videlilja.linda.lia.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ilisa on 2018-04-02.
 */

public class Home {
    private final String mLabel;

    public Home(final String label) {
        mLabel = label;
    }

    public String getLabel() {
        return mLabel;
    }

    public List<Home> getGames() {
        List<Home> games = new ArrayList<>();
        //games.add(R.string.animals).toString;

        return games;
    }
}
