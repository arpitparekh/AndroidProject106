package com.arpitparekh.jigneshandroidmodule.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.arpitparekh.jigneshandroidmodule.R;
import com.arpitparekh.jigneshandroidmodule.databinding.ActivityRadioBinding;

public class RadioActivity extends AppCompatActivity {

    private ActivityRadioBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRadioBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.rgGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int pos) {

                if(radioGroup.getCheckedRadioButtonId()==R.id.rbMale){

                    Toast.makeText(RadioActivity.this,binding.rbMale.getText().toString(), Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(RadioActivity.this,binding.rbFemale.getText().toString(), Toast.LENGTH_SHORT).show();
                }


            }
        });


    }
}