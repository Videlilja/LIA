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
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.videlilja.linda.lia.R;
import com.videlilja.linda.lia.model.Categories;
import com.videlilja.linda.lia.model.Quiz;
import com.videlilja.linda.lia.screen.endofgame.EndOfGameActivity;

import java.util.List;


public class QuizActivity extends AppCompatActivity {

    private Button mNext;

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

        final QuizAdapter adapter = new QuizAdapter();
        RecyclerView recyclerView = findViewById(R.id.quiz_recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(adapter);

        mNext = findViewById(R.id.next);
        mNext.setEnabled(false);
        mNext.setBackgroundColor(getResources().getColor(R.color.noColor));
        mNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (viewModel.rightAnswers < 9) {
                    viewModel.setmQuiz(category);
                } else {
                    // Spelet är slut, byt till EndOfGame
                    Intent intent = new Intent(getApplicationContext(), EndOfGameActivity.class);

                    //Skicka med prefect och score
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("perfect", (viewModel.rightAnswers == viewModel.amountA));
                    bundle.putString("score", Integer.toString(10 - (viewModel.amountA - viewModel.rightAnswers)));
                    bundle.putSerializable("action", category);
                    intent.putExtras(bundle);

                    //Starta nästa activity
                    startActivity(intent);
                    finish();
                }
            }
        });


        adapter.setmQuizClickListener(new OnQuizClickedListener() {

            @Override
            public void onQuizClicked(final Quiz quiz) {
                if (viewModel.rightAnswer.getValue() != null) {
                    if (!viewModel.rightAnswer.getValue().first) {
                        viewModel.quizClicked(quiz);
                    }
                }
            }
        });

        viewModel.getQuiz().observe(this, new Observer<List<Quiz>>() {
            @Override
            public void onChanged(@Nullable final List<Quiz> quizzes) {
                mNext.setEnabled(false);
                mNext.setBackgroundColor(getResources().getColor(R.color.noColor));
                mNext.getShadowColor();
                adapter.setQuizList(quizzes);
                sortTxt.setText(viewModel.getmRightAnswer().getmName());
            }
        });

        viewModel.rightAnswer.observe(this, new Observer<Pair<Boolean, Quiz>>() {
            @Override
            public void onChanged(@Nullable Pair<Boolean, Quiz> rightAnswer) {
                if (rightAnswer != null) {

                    if (rightAnswer.second != null) {

                        if (rightAnswer.first) {

                            mNext.setEnabled(true);
                            mNext.setBackgroundColor(getResources().getColor(R.color.colorSecondary));
                            rightAnswer.second.setBackgroundColor(R.color.colorGreen);

                        } else {

                            rightAnswer.second.setBackgroundColor(R.color.colorRed);
                            mNext.setEnabled(false);
                            mNext.setBackgroundColor(getResources().getColor(R.color.noColor));
                            mNext.getShadowColor();

                        }

                    }
                }
            }
        });

    }

    public static void start(Context context, Categories action) {
        Intent intent = new Intent(context, QuizActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra("category", action);
        context.startActivity(intent);
    }
}