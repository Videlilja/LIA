package com.videlilja.linda.lia.model;

import android.arch.lifecycle.LiveData;

import com.videlilja.linda.lia.R;

import java.util.ArrayList;
import java.util.List;

public class CategoriesLiveData extends LiveData<List<Category>> {

    public CategoriesLiveData(Games game) {
        switch (game) {
            case MATH:
                List<Category> mathCategories = new ArrayList<>();
                mathCategories.add(new Category("Addition", Categories.ADDITION, R.drawable.pinkwave));
                mathCategories.add(new Category("Subtraktion", Categories.SUBTRACTION, R.drawable.sandwave));
                mathCategories.add(new Category("Multiplikation", Categories.MULTIPLICATION, R.drawable.pinkwave));
                mathCategories.add(new Category("Division", Categories.DIVISION, R.drawable.sandwave));
                mathCategories.add(new Category("Geometri", Categories.GEOMETRY, R.drawable.splash));
                setValue(mathCategories);
                break;
            case FLAGS:
                List<Category> flagCategories = new ArrayList<>();
                flagCategories.add(new Category("Afrika", Categories.AFRICA, R.drawable.smiley));
                flagCategories.add(new Category("Asien", Categories.ASIA, R.drawable.smiley));
                flagCategories.add(new Category("Oceanien", Categories.OCEANIA, R.drawable.smiley));
                flagCategories.add(new Category("Sydamerika", Categories.SOUTH_AMERICA, R.drawable.smiley));
                flagCategories.add(new Category("Nordamerika", Categories.NORTH_AMERICA, R.drawable.smiley));
                flagCategories.add(new Category("Europa", Categories.EUROPE, R.drawable.smiley));
                setValue(flagCategories);
                break;
            case NATURE:
                List<Category> natureCategories = new ArrayList<>();
                natureCategories.add(new Category("Blommor", Categories.FLOWERS, R.drawable.smiley));
                natureCategories.add(new Category("Kryddväxter", Categories.HERBS, R.drawable.smiley));
                setValue(natureCategories);
                break;
            case ANIMALS:
                List<Category> animalsCategories = new ArrayList<>();
                animalsCategories.add(new Category("Däggdjur", Categories.MAMMALS, R.drawable.smiley));
                animalsCategories.add(new Category("Insekter", Categories.BIRDS, R.drawable.smiley));
                setValue(animalsCategories);
                break;
            case CAPITALS:
                List<Category> capitalsCategories = new ArrayList<>();
                capitalsCategories.add(new Category("Afrika", Categories.AFRICA, R.drawable.smiley));
                capitalsCategories.add(new Category("Asien", Categories.ASIA, R.drawable.smiley));
                capitalsCategories.add(new Category("Oceanien", Categories.OCEANIA, R.drawable.smiley));
                capitalsCategories.add(new Category("Sydamerika", Categories.SOUTH_AMERICA, R.drawable.smiley));
                capitalsCategories.add(new Category("Nordamerika", Categories.NORTH_AMERICA, R.drawable.smiley));
                capitalsCategories.add(new Category("Europa", Categories.EUROPE, R.drawable.smiley));
                setValue(capitalsCategories);
                break;
            case WORDS:
                List<Category> wordsCategories = new ArrayList<>();
                wordsCategories.add(new Category("Bild till ord", Categories.PIC_TO_WORD, R.drawable.smiley));
                wordsCategories.add(new Category("Ord till bild", Categories.WORD_TO_PIC, R.drawable.smiley));
                wordsCategories.add(new Category("Stavning", Categories.SPELLING, R.drawable.smiley));
                setValue(wordsCategories);
                break;
        }
    }
}
