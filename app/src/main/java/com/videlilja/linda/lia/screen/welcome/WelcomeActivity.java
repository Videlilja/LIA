package com.videlilja.linda.lia.screen.welcome;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.videlilja.linda.lia.R;
import com.videlilja.linda.lia.screen.home.HomeActivity;

public class WelcomeActivity extends AppCompatActivity {

    private static final String TAG = "WelcomeActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Button startBtn = findViewById(R.id.start_button);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomeActivity.this, HomeActivity.class);
                startActivity(intent);
                Log.d(TAG, "onClick() called with: view = [" + view + "]");
            }
        });
    }
    public static void start(Context context){
        context.startActivity(new Intent(context, WelcomeActivity.class));
    }
}
