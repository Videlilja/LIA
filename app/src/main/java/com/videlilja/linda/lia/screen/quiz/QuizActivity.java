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
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
        import com.videlilja.linda.lia.R;
        import com.videlilja.linda.lia.model.Categories;
        import com.videlilja.linda.lia.model.Quiz;
        import com.videlilja.linda.lia.screen.endofgame.EndOfGameActivity;

        import java.util.List;


public class QuizActivity extends AppCompatActivity {

    private int rightAnswers = 0;
    boolean rightAnswer = false;
    private int amountA = 0;
    public boolean perfect = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        final QuizViewModel viewModel = ViewModelProviders.of(this).get(QuizViewModel.class);

        final Categories category = (Categories) getIntent().getSerializableExtra("category");
        viewModel.setmQuiz(category);

        final TextView sortTxt = findViewById(R.id.sort_text);
        sortTxt.setText(viewModel.getmRightAnswer().getmName());

        final TextView questionTxt = findViewById(R.id.question_text);
        questionTxt.setText(viewModel.getmRightAnswer().getmQuestion());

        Button next = findViewById(R.id.next);
        next.setEnabled(false);
        next.setBackgroundColor(getResources().getColor(R.color.noColor));

        final QuizAdapter adapter = new QuizAdapter();


        adapter.setmQuizClickListener(new OnQuizClickedListener() {

            @Override
            public void onQuizClicked(final Quiz quiz) {
                if (!rightAnswer) {
                    if (quiz == viewModel.getmRightAnswer()) {
                        //RÄTT SVAR
                        rightAnswer = true;
                        rightAnswers = rightAnswers + 1;
                        amountA = amountA + 1;
                        Button next = findViewById(R.id.next);
                        next.setEnabled(true);
                        next.setBackgroundColor(getResources().getColor(R.color.colorSecondary));
                        // Läs in listan igen med förändrad bakgrund
                        quiz.setBackgroundColor(R.color.colorGreen);

                        // 0.5 seconds delay
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        if (rightAnswers < 10) {

                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Button next = findViewById(R.id.next);
                                    next.setEnabled(false);
                                    next.setBackgroundColor(getResources().getColor(R.color.noColor));
                                    viewModel.setmQuiz(category);
                                }
                            });

                        } else {
                            if (rightAnswers == amountA) {
                                perfect = true;
                            }

                            next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    // Spelet är slut, byt till EndOfGame
                                    Intent intent = new Intent(getApplicationContext(), EndOfGameActivity.class);

                                    //Skicka med prefect och score
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("perfect", perfect);
                                    bundle.putString("score", Integer.toString(10 - (amountA - rightAnswers)));
                                    bundle.putSerializable("action", category);
                                    intent.putExtras(bundle);

                                    //Starta nästa activity
                                    startActivity(intent);
                                    finish();
                                }
                            });
                        }
                    } else {
                        //FEL SVAR
                        quiz.setBackgroundColor(R.color.colorRed);
                        rightAnswer = false;
                        amountA = amountA + 1;
                        Button next = findViewById(R.id.next);
                        next.setEnabled(false);
                        next.setBackgroundColor(getResources().getColor(R.color.noColor));
                        next.getShadowColor();
                    }
                }
            }
        });

        viewModel.getQuiz().observe(this, new Observer<List<Quiz>>() {
            @Override
            public void onChanged(@Nullable final List<Quiz> quizzes) {
                rightAnswer = false;
                adapter.setQuizList(quizzes);
                sortTxt.setText(viewModel.getmRightAnswer().getmName());
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