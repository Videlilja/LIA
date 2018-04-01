package com.videlilja.linda.lia.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ilisa on 2018-03-26.
 */

public class Continent {
    private String title;

    public Continent(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Continent> getContinents() {
        List<Continent> continents = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Continent continent = new Continent("Europa" + i);
        }

        return continents;
    }

}
