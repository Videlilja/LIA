package com.videlilja.linda.lia.screen.home;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.videlilja.linda.lia.R;
import com.videlilja.linda.lia.model.Home;

import java.util.List;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        HomeViewModel viewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        final HomeAdapter adapter = new HomeAdapter(new OnHomeClickedListener() {
            @Override
            public void onHomeClicked(final Home entity) {
                Log.i("TAG", "You clicked on " + entity.getLabel());
            }
        });

        viewModel.getEntities().observe(this, new Observer<List<Home>>() {
            @Override
            public void onChanged(@Nullable List<Home> homes) {
                adapter.setData(homes);
            }
        });
        RecyclerView recyclerView = findViewById(R.id.home_recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(adapter);
    }
}
