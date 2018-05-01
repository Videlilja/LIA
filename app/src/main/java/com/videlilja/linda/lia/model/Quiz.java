package com.videlilja.linda.lia.model;

public class Quiz {

    private String mName;
    private int mImage;
    private String mQuestion;


    public Quiz(String mName, int mImage, String mQuestion) {
        this.mName = mName;
        this.mImage = mImage;
        this.mQuestion = mQuestion;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
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