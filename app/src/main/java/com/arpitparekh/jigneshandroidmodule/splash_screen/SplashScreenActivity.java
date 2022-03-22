package com.arpitparekh.jigneshandroidmodule.splash_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.arpitparekh.jigneshandroidmodule.databinding.ActivitySplashScreenBinding;
import com.arpitparekh.jigneshandroidmodule.fregment_object_string.AnotherHolderActivity;

public class SplashScreenActivity extends AppCompatActivity {

    private ActivitySplashScreenBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        new Thread(new Runnable() {
            @Override
            public void run() {

                try{
                    Thread.sleep(4000);
                }catch (Exception e){

                }

                Intent i = new Intent(SplashScreenActivity.this, AnotherHolderActivity.class);
                startActivity(i);
                finish();

            }
        }).start();

    }
}