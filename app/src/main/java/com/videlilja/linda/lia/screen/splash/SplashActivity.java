package com.videlilja.linda.lia.screen.splash;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.videlilja.linda.lia.R;
import com.videlilja.linda.lia.screen.home.HomeActivity;
import com.videlilja.linda.lia.screen.welcome.WelcomeActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WelcomeActivity.start(this);
    }
}
