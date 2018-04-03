package com.videlilja.linda.lia.model;

import com.videlilja.linda.lia.R;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by ilisa on 2018-04-02.
 */

public class Game{

    private String mTitle;
    private Games mAction;

    public Game(String mTitle, Games mAction) {
        this.mTitle = mTitle;
        this.mAction = mAction;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Games getmAction() {
        return mAction;
    }

    public void setmAction(Games mAction) {
        this.mAction = mAction;
    }
}
