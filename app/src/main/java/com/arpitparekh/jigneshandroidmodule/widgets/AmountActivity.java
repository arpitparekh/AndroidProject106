package com.arpitparekh.jigneshandroidmodule.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;

import com.arpitparekh.jigneshandroidmodule.R;
import com.arpitparekh.jigneshandroidmodule.databinding.ActivityAmountBinding;

public class AmountActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private ActivityAmountBinding binding;
    private int amount=0;
    private Drawable d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAmountBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnShow.setVisibility(View.GONE);

        binding.cb1.setOnCheckedChangeListener(this);
        binding.cb2.setOnCheckedChangeListener(this);
        binding.cb3.setOnCheckedChangeListener(this);

        binding.btnShow.setOnClickListener(view -> {

            if(binding.cb1.isChecked()){



            }

        });

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        int number = 0 ;

        if(b){

            if(compoundButton==binding.cb1){

                number =  Integer.parseInt(binding.cb1.getText().toString());
                d = compoundButton.getButtonDrawable();
                compoundButton.setButtonDrawable(R.drawable.ic_phyco);

            }else if(compoundButton==binding.cb2){
                number =  Integer.parseInt(binding.cb2.getText().toString());
            }else if(compoundButton==binding.cb3){
                number =  Integer.parseInt(binding.cb3.getText().toString());
            }
            amount += number;

            binding.edtAmount.setText(String.valueOf(amount));

            binding.btnShow.setVisibility(View.VISIBLE);

        }else{

            number = 0;

            if(compoundButton==binding.cb1){
                number =  Integer.parseInt(binding.cb1.getText().toString());
                compoundButton.setButtonDrawable(d);

            }else if(compoundButton==binding.cb2){
                number =  Integer.parseInt(binding.cb2.getText().toString());
            }else if(compoundButton==binding.cb3){
                number =  Integer.parseInt(binding.cb3.getText().toString());
            }

            amount -= number;

            binding.edtAmount.setText(String.valueOf(amount));

            if(amount==0){

                binding.btnShow.setVisibility(View.GONE);
            }

        }

    }

}