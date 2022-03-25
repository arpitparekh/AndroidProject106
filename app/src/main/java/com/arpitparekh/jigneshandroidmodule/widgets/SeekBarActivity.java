package com.arpitparekh.jigneshandroidmodule.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.SeekBar;

import com.arpitparekh.jigneshandroidmodule.databinding.ActivitySeekBarBinding;

public class SeekBarActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    private ActivitySeekBarBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySeekBarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.sbRed.setOnSeekBarChangeListener(this);
        binding.sbGreen.setOnSeekBarChangeListener(this);
        binding.sbBlue.setOnSeekBarChangeListener(this);

    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

        int red = binding.sbRed.getProgress();
        int green = binding.sbGreen.getProgress();
        int blue = binding.sbBlue.getProgress();

        binding.ivColorCode.setBackgroundColor(Color.rgb(red,green,blue));

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}