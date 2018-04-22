package com.videlilja.linda.lia.screen.quiz;

        import android.content.Context;
        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ImageView;
        import android.widget.TextView;

        import com.videlilja.linda.lia.R;
        import com.videlilja.linda.lia.model.Categories;


public class QuizActivity extends AppCompatActivity {

    private static final String TAG = "QuizActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

    }

    public static void start(Context context, Categories action){
        Intent intent = new Intent(context, QuizActivity.class);
        intent.putExtra("category", action);


        context.startActivity(intent);
    }
}