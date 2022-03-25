package com.arpitparekh.jigneshandroidmodule.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.CompoundButton;

import com.arpitparekh.jigneshandroidmodule.R;
import com.arpitparekh.jigneshandroidmodule.databinding.ActivityCtsactivityBinding;

public class CTSActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private ActivityCtsactivityBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCtsactivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.checkBox.setOnCheckedChangeListener(this);
        binding.switch1.setOnCheckedChangeListener(this);
        binding.toggleButton.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if(b){

//            binding.getRoot().setBackgroundColor(Color.GREEN);
//            binding.getRoot().setBackgroundColor(Color.rgb(197,42,186));
            binding.getRoot().setBackgroundResource(R.drawable.banner);
            binding.checkBox.setText("On");
            binding.switch1.setText("On");

            binding.checkBox.setChecked(true);
            binding.switch1.setChecked(true);
            binding.toggleButton.setChecked(true);

        }else{

            binding.getRoot().setBackgroundColor(Color.WHITE);
            binding.checkBox.setText("Off");
            binding.switch1.setText("Off");

            binding.checkBox.setChecked(false);
            binding.switch1.setChecked(false);
            binding.toggleButton.setChecked(false);

        }

    }
}