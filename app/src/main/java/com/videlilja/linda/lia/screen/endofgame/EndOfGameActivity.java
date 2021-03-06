package com.videlilja.linda.lia.screen.endofgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.videlilja.linda.lia.R;
import com.videlilja.linda.lia.model.Categories;
import com.videlilja.linda.lia.model.Category;
import com.videlilja.linda.lia.screen.home.HomeActivity;
import com.videlilja.linda.lia.screen.quiz.QuizActivity;

public class EndOfGameActivity extends AppCompatActivity {

    String notPerfect = "";
    String strBefore = "";
    String strAfter = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_of_game);

        ImageView endImage = findViewById(R.id.result);
        TextView scoreText = findViewById(R.id.scoreText);

        Bundle bundle = getIntent().getExtras();

        boolean perfect = bundle.getBoolean("perfect");
        String score = bundle.getString("score");
        final Categories category = (Categories) bundle.getSerializable("action");
        //Toast.makeText(this, "bla bla bla" + category, Toast.LENGTH_SHORT).show();

        if(perfect){
            endImage.setImageResource(R.drawable.perfectscore);
            scoreText.setText(R.string.perfectscore);
        } else {
            endImage.setImageResource(R.drawable.butterfly);
            strBefore = getString(R.string.score);
            strAfter = getString(R.string.ten);
            notPerfect = strBefore + " " + score + " " + strAfter;
            scoreText.setText(notPerfect);
        }

        Button quit = findViewById(R.id.quit);
        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });

        Button home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
            }
        });

        Button repeat = findViewById(R.id.repeat);
        repeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                QuizActivity.start(getApplicationContext(), category);
                finish();
            }
        });
    }
}