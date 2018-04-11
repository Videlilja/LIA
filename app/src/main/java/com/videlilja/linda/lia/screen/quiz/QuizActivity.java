package com.videlilja.linda.lia.screen.quiz;

        import android.content.Context;
        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;

        import com.videlilja.linda.lia.R;



public class QuizActivity extends AppCompatActivity {
    private static final String TAG = "QuizActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

    }

    public static void start(Context context){
        context.startActivity(new Intent(context, QuizActivity.class));
    }
}
