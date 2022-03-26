package com.arpitparekh.jigneshandroidmodule.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.arpitparekh.jigneshandroidmodule.databinding.ActivityEdittextBinding;

public class EdittextActivity extends AppCompatActivity {

    private ActivityEdittextBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEdittextBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }
}