package com.videlilja.linda.lia.screen.categories;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.videlilja.linda.lia.R;
import com.videlilja.linda.lia.model.Category;
import com.videlilja.linda.lia.model.Games;
import com.videlilja.linda.lia.screen.quiz.QuizActivity;

import java.util.List;

public class CategoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        CategoryViewModel viewModel = ViewModelProviders.of(this).get(CategoryViewModel.class);
        Games action = (Games) getIntent().getSerializableExtra("game");
        viewModel.setmData(action);

        final CategoryAdapter adapter = new CategoryAdapter(new OnCategoryClickedListener() {
            @Override
            public void onCategoryClicked(Category entity) {
                QuizActivity.start(getApplicationContext(), entity.getmAction());

                Log.i("TAG", "You clicked on " + entity.getmTitle());
            }
        });

        viewModel.getEntities().observe(this, new Observer<List<Category>>() {
            @Override
            public void onChanged(@Nullable final List<Category> strings) {
                adapter.setData(strings);
            }
        });

        RecyclerView recyclerView = findViewById(R.id.categories_recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(adapter);
    }

    public static void start(Context context, Games action){
        Intent intent = new Intent(context, CategoriesActivity.class);
        intent.putExtra("game", action);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

}