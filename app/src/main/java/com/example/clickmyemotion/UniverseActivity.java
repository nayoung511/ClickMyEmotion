package com.example.clickmyemotion;

import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class UniverseActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_universe);

        final ImageView star = findViewById(R.id.star);
        final ImageView star2 = findViewById(R.id.star2);
        final ImageView planet = findViewById(R.id.planet);
        final ImageView planet2 = findViewById(R.id.planet2);

        star.startAnimation(AnimationUtils.loadAnimation(this, R.anim.animation_fadein_fadeout));
        star2.startAnimation(AnimationUtils.loadAnimation(this, R.anim.animation_fadein_fadeout_star2));




        planet.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotate_planet));
        planet2.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotate_planet2));
    }
}
