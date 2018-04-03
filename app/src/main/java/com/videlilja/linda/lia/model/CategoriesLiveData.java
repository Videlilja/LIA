package com.videlilja.linda.lia.model;

import android.arch.lifecycle.LiveData;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CategoriesLiveData extends LiveData<List<Category>> {

    public CategoriesLiveData(Games game) {
        switch (game) {
            case MATH:
                List<Category> mathCategories = new ArrayList<>();
                mathCategories.add(new Category("Addition", Categories.PLUS));
                mathCategories.add(new Category("Minus", Categories.MINUS));
                mathCategories.add(new Category("Multiplikation", Categories.MULTIPLIKATION));
                mathCategories.add(new Category("Division", Categories.DIVISION));
                mathCategories.add(new Category("Former", Categories.FORMER));
                setValue(mathCategories);
                break;
            case FLAGS:

                break;
            case NATURE:
                List<Category> natureCategories = new ArrayList<>();
                natureCategories.add(new Category("Blommor", Categories.FLOWERS));
                natureCategories.add(new Category("ryddväxter", Categories.HERBS));
                setValue(natureCategories);
                break;
            case ANIMALS:

                break;
            case CAPITALS:
                break;
        }
    }
}
