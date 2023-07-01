package com.example.animation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button_start;
    private Button button_restart;
    private ImageView car1;
    private ImageView car2;
    private ImageView car3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_start = findViewById(R.id.button_start);
        button_restart = findViewById(R.id.button_restart);

        car1 = findViewById(R.id.car1);
        car2 = findViewById(R.id.car2);
        car3 = findViewById(R.id.car3);
        //animate start
        ObjectAnimator car1Animator = ObjectAnimator.ofFloat(car1, "X", 400);
        ObjectAnimator car2Animator = ObjectAnimator.ofFloat(car2, "X", 400);
        ObjectAnimator car3Animator = ObjectAnimator.ofFloat(car3, "X", 400);
        //duration start
        car1Animator.setDuration(750);
        car2Animator.setDuration(600);
        car3Animator.setDuration(500);

        //animate start
        ObjectAnimator car1restart = ObjectAnimator.ofFloat(car1, "X", 20);
        ObjectAnimator car2restart = ObjectAnimator.ofFloat(car2, "X", 20);
        ObjectAnimator car3restart = ObjectAnimator.ofFloat(car3, "X", 20);
        //duration start
        car1restart.setDuration(3000);
        car2restart.setDuration(3000);
        car3restart.setDuration(3000);



        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(
                        car1Animator,
                        car2Animator,
                        car3Animator
                );

                animatorSet.start();
            }
        });

        button_restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(
                        car1restart,
                        car2restart,
                        car3restart
                );

                animatorSet.start();
            }
        });
    }
}