package com.arpitparekh.jigneshandroidmodule.fregment_object_string;

import androidx.appcompat.app.AppCompatActivity;
import com.arpitparekh.jigneshandroidmodule.R;
import com.arpitparekh.jigneshandroidmodule.databinding.ActivityAnotherHolderBinding;

import android.os.Bundle;

public class AnotherHolderActivity extends AppCompatActivity {

    private ActivityAnotherHolderBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAnotherHolderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportFragmentManager().beginTransaction()
                .add(R.id.fcvAnotherHolder,new FragmentOne())
                .commit();

    }
}