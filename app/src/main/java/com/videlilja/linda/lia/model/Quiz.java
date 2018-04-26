package com.videlilja.linda.lia.model;

public class Quiz {

    private int mName;
    private int mImage;
    private int mQuestion;

    public Quiz(int mName, int mImage, int mQuestion) {
        this.mName = mName;
        this.mImage = mImage;
        this.mQuestion = mQuestion;
    }

    public int getmName() {
        return mName;
    }

    public void setmName(int mName) {
        this.mName = mName;
    }

    public int getmImage() {
        return mImage;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }

    public int getmQuestion() {
        return mQuestion;
    }

    public void setmQuestion(int mQuestion) {
        this.mQuestion = mQuestion;
    }
}