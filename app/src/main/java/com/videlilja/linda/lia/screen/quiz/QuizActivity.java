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
        import com.videlilja.linda.lia.R;
        import com.videlilja.linda.lia.model.Categories;
        import com.videlilja.linda.lia.model.Quiz;

        import java.util.List;


public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        QuizViewModel viewModel = ViewModelProviders.of(this).get(QuizViewModel.class);
        Categories action = (Categories) getIntent().getSerializableExtra("category");
        viewModel.setmQuiz(action);

        final QuizAdapter adapter = new QuizAdapter(new OnQuizClickedListener() {
            @Override
            public void onQuizClicked(final Quiz quiz) {
            }
        });

        viewModel.getQuiz().observe(this, new Observer<List<Quiz>>() {
            @Override
            public void onChanged(@Nullable final List<Quiz> quizzes) {
                adapter.setQuizList(quizzes);
            }
        });

        RecyclerView recyclerView = findViewById(R.id.quiz_recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(adapter);
    }
    public static void start(Context context, Categories action){
        Intent intent = new Intent(context, QuizActivity.class);
        intent.putExtra("category", action);
        context.startActivity(intent);
    }
}