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
        import android.widget.TextView;

        import com.videlilja.linda.lia.R;
        import com.videlilja.linda.lia.model.Categories;
        import com.videlilja.linda.lia.model.Quiz;

        import java.util.List;


public class QuizActivity extends AppCompatActivity {

    private int rightAnswers = 0;
    boolean rightAnswer = false;
    private int amountA = 0;
    boolean perfect = false;

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



        final QuizAdapter adapter = new QuizAdapter(new OnQuizClickedListener() {
            @Override
            public void onQuizClicked(final Quiz quiz) {
                if (quiz == viewModel.getmRightAnswer()) {
                    //RÄTT SVAR
                    rightAnswer = true;
                    rightAnswers = rightAnswers + 1;
                    amountA = amountA + 1;

                    //sleep 5 seconds
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (rightAnswers < 10){
                        System.out.println("");
                        System.out.println("Right answers: " + rightAnswers);
                        System.out.println("Right answer: " + rightAnswer);
                        System.out.println("Answers:  " + amountA);
                        viewModel.setmQuiz(category);
                    } else {
                        System.out.println("Right answers: " + rightAnswers);
                        System.out.println("Right answer: " + rightAnswer);
                        System.out.println("Answers:  " + amountA);

                        if(rightAnswers == amountA){
                            System.out.println("PERFECT!!! ");
                            perfect = true;
                        }
                        System.out.println("Byter till slut-skärm ");
                    }

                } else {
                    //FEL SVAR
                    rightAnswer = false;
                    amountA = amountA + 1;
                    System.out.println("Right answer: " + rightAnswer);
                    System.out.println("Answers" + amountA);
                }
            }
        });

        viewModel.getQuiz().observe(this, new Observer<List<Quiz>>() {
            @Override
            public void onChanged(@Nullable final List<Quiz> quizzes) {
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