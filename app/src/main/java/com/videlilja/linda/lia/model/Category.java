package com.videlilja.linda.lia.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ilisa on 2018-03-26.
 */

public class Category {

    private final String mTitle;
    private Categories mAction;

    public Category(String mTitle, Categories mAction) {
        this.mTitle = mTitle;
        this.mAction = mAction;
    }

    public String getmTitle() {
        return mTitle;
    }

    public Categories getmAction() {
        return mAction;
    }

    public void setmAction(Categories mAction) {
        this.mAction = mAction;
    }
}
