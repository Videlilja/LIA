package com.videlilja.linda.lia.model;

public class Quiz {

    private String mName;
    private String mPicTxt;
    private int mImage;
    private String mQuestion;
    private int backgroundColor;


    public Quiz(String mName, String mPicTxt, int mImage, String mQuestion) {
        this.mName = mName;
        this.mPicTxt = mPicTxt;
        this.mImage = mImage;
        this.mQuestion = mQuestion;
    }

    public int getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(int backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmPicTxt() {
        return mPicTxt;
    }

    public void setmPicTxt(String mPicTxt) {
        this.mPicTxt = mPicTxt;
    }

    public int getmImage() {
        return mImage;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }

    public String getmQuestion() {
        return mQuestion;
    }

    public void setmQuestion(String mQuestion) {
        this.mQuestion = mQuestion;
    }
}