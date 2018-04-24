package com.videlilja.linda.lia.screen.quiz;

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
        import com.videlilja.linda.lia.model.Categories;
        import com.videlilja.linda.lia.model.Category;
        import com.videlilja.linda.lia.model.Quiz;


        import java.util.List;


public class QuizActivity extends AppCompatActivity {

    private static final String TAG = "QuizActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        QuizViewModel viewModel = ViewModelProviders.of(this).get(QuizViewModel.class);
        Quiz action = (Quiz) getIntent().getSerializableExtra("quiz");
        viewModel.setmData(action);

        final QuizAdapter adapter = new QuizAdapter(new OnQuizClickedListener() {
            @Override
            public void onQuizClicked(Quiz quiz) {
                QuizActivity.start(getApplicationContext(), quiz.getmName());
            }
        });

        viewModel.getEntities().observe(this, new Observer<List<Category>>() {
            @Override
            public void onChanged(@Nullable final List<Category> strings) {
                adapter.setData(strings);
            }
        });

        RecyclerView recyclerView = findViewById(R.id.quiz_recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(adapter);

    }

    public static void start(Context context, Quiz action){
        Intent intent = new Intent(context, QuizActivity.class);
        intent.putExtra("category", action);


        context.startActivity(intent);
    }
}