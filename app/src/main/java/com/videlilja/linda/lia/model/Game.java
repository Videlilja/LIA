package com.videlilja.linda.lia.model;

/**
 * Created by ilisa on 2018-04-02.
 */

public class Game{

    private String mTitle;
    private Games mAction;
    private int mImage;

    public Game(String mTitle, Games mAction, int mImage) {
        this.mTitle = mTitle;
        this.mAction = mAction;
        this.mImage = mImage;
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

    public int getmImage() {
        return mImage;
    }

    public void setmImage(int mImage) { this.mImage = mImage; }
}
