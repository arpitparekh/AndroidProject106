package com.arpitparekh.jigneshandroidmodule.fregment_object_string;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arpitparekh.jigneshandroidmodule.R;
import com.arpitparekh.jigneshandroidmodule.databinding.FragmentTwoBinding;
import com.arpitparekh.jigneshandroidmodule.pass_object_activity.Student;

import java.util.ArrayList;


public class FragmentTwo extends Fragment {

    private FragmentTwoBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentTwoBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Bundle b = getArguments();

//        String newString = b.getString("string");

        Student s = (Student) b.getSerializable("object");

        binding.tvString.setText(getResources().getString(R.string.str));


    }
}