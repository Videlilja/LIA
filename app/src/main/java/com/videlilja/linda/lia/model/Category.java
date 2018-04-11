package com.videlilja.linda.lia.model;

/**
 * Created by ilisa on 2018-03-26.
 */

public class Category {

    private String mTitle;
    private Categories mAction;
    private int mImage;

    public Category(String mTitle, Categories mAction, int mImage) {
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

    public Categories getmAction() {
        return mAction;
    }

    public void setmAction(Categories mAction) {
        this.mAction = mAction;
    }

    public int getmImage() {
        return mImage;
    }

    public void setmImage(int mImage) { this.mImage = mImage; }
}
