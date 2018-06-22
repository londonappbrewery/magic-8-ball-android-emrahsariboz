package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final ImageView ballImageView = (ImageView) findViewById(R.id.image_eightball);

        final int[] ballArray = {R.drawable.ball1, R.drawable.ball2, R.drawable.ball3, R.drawable.ball4, R.drawable.ball5};

        Button myBall = findViewById(R.id.askButton);

        myBall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rn = new Random();
                int ballRandom = rn.nextInt(4);

                ballImageView.setImageResource(ballArray[ballRandom]);
            }
        });
    }
}
