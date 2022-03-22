package com.arpitparekh.jigneshandroidmodule.viewBinding_dataBinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.arpitparekh.jigneshandroidmodule.databinding.ActivityMyBinding;

import java.util.ArrayList;

public class MyActivity extends AppCompatActivity {

    private ActivityMyBinding binding;  // declare

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // lambda method // {  int a -> print()  }

        binding.btnDemo.setOnClickListener(view -> {
//
//            ArrayList<Integer> list = new ArrayList<>();
//
//            list.add(binding..getText().toString());
//
//            i.putExtra("list",list);


        });

        //viewBinding

        //dataBinding

        binding.btnLoad.setOnClickListener(view -> {

            Emp e = new Emp("jaimin",34,true);

            binding.setObj(e);

            binding.setI(23);

        });

    }
}