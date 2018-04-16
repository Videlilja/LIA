package com.videlilja.linda.lia.screen.home;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.videlilja.linda.lia.R;
import com.videlilja.linda.lia.model.Game;
import com.videlilja.linda.lia.screen.categories.CategoriesActivity;

import java.util.List;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        HomeViewModel viewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        final HomeAdapter adapter = new HomeAdapter(new OnHomeClickedListener() {
            @Override
            public void onHomeClicked(final Game entity) {
                CategoriesActivity.start(getApplicationContext(), entity.getmAction());
            }
        });

        viewModel.getGames().observe(this, new Observer<List<Game>>() {
            @Override
            public void onChanged(@Nullable List<Game> homes) {
                adapter.setData(homes);
            }
        });

        RecyclerView recyclerView = findViewById(R.id.home_recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(adapter);
    }
}
