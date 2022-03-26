package com.arpitparekh.jigneshandroidmodule.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.arpitparekh.jigneshandroidmodule.R;
import com.arpitparekh.jigneshandroidmodule.databinding.ActivityAnimationBinding;

public class AnimationActivity extends AppCompatActivity {

    private ActivityAnimationBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAnimationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnAnimation.setOnClickListener(view -> {

            Animation animation = AnimationUtils.loadAnimation(this,R.anim.my_anim);
            binding.ivAnim.startAnimation(animation);

        });
    }
}