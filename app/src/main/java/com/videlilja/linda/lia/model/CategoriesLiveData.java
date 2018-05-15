package com.videlilja.linda.lia.model;

import android.arch.lifecycle.LiveData;

import com.videlilja.linda.lia.R;

import java.util.ArrayList;
import java.util.List;

public class CategoriesLiveData extends LiveData<List<Category>> {


    public CategoriesLiveData(Games game) {

        switch (game) {
            case ANIMALS:
                List<Category> animalsCategories = new ArrayList<>();
                animalsCategories.add(new Category(R.string.mammals, Categories.MAMMALS, R.drawable.animalsicon2));
                animalsCategories.add(new Category(R.string.birds, Categories.BIRDS, R.drawable.birdsicon));
                setValue(animalsCategories);
                break;

            case NATURE:
                List<Category> natureCategories = new ArrayList<>();
                natureCategories.add(new Category(R.string.flowers, Categories.FLOWERS, R.drawable.flowersicon));
                natureCategories.add(new Category(R.string.herbs, Categories.HERBS, R.drawable.herbsicon));
                setValue(natureCategories);
                break;

            /*case MATH:
                List<Category> mathCategories = new ArrayList<>();
                mathCategories.add(new Category(R.string.addition, Categories.ADDITION, R.drawable.mathicon));
                mathCategories.add(new Category(R.string.subtraction, Categories.SUBTRACTION, R.drawable.mathicon));
                mathCategories.add(new Category(R.string.multiplication, Categories.MULTIPLICATION, R.drawable.mathicon));
                mathCategories.add(new Category(R.string.division, Categories.DIVISION, R.drawable.mathicon));
                setValue(mathCategories);
                break;*/

            case FLAGS:
                List<Category> flagCategories = new ArrayList<>();
                flagCategories.add(new Category(R.string.africa, Categories.F_AFRICA, R.drawable.africaicon));
                flagCategories.add(new Category(R.string.asia, Categories.F_ASIA, R.drawable.asiaicon));
                flagCategories.add(new Category(R.string.europe, Categories.F_EUROPE, R.drawable.europeicon));
                flagCategories.add(new Category(R.string.north_america, Categories.F_NORTH_AMERICA, R.drawable.northamericaicon));
                flagCategories.add(new Category(R.string.south_america, Categories.F_SOUTH_AMERICA, R.drawable.southamericaicon));
                flagCategories.add(new Category(R.string.oceania, Categories.F_OCEANIA, R.drawable.australiaicon));
                setValue(flagCategories);
                break;

            case CAPITALS:
                List<Category> capitalsCategories = new ArrayList<>();
                capitalsCategories.add(new Category(R.string.africa, Categories.C_AFRICA, R.drawable.africaicon));
                capitalsCategories.add(new Category(R.string.asia, Categories.C_ASIA, R.drawable.asiaicon));
                capitalsCategories.add(new Category(R.string.europe, Categories.C_EUROPE, R.drawable.europeicon));
                capitalsCategories.add(new Category(R.string.north_america, Categories.C_NORTH_AMERICA, R.drawable.northamericaicon));
                capitalsCategories.add(new Category(R.string.south_america, Categories.C_SOUTH_AMERICA, R.drawable.southamericaicon));
                capitalsCategories.add(new Category(R.string.oceania, Categories.C_OCEANIA, R.drawable.australiaicon));
                setValue(capitalsCategories);
                break;

            case WORDS:
                List<Category> wordsCategories = new ArrayList<>();
                //wordsCategories.add(new Category(R.string.pic_to_word, Categories.PIC_TO_WORD, R.drawable.wordtopicicon));
                wordsCategories.add(new Category(R.string.word_to_pic, Categories.WORD_TO_PIC, R.drawable.wordtopicicon));
                setValue(wordsCategories);
                break;
        }
    }
}
