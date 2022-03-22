package com.arpitparekh.jigneshandroidmodule.fregment_object_string;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arpitparekh.jigneshandroidmodule.R;
import com.arpitparekh.jigneshandroidmodule.databinding.FragmentOneBinding;
import com.arpitparekh.jigneshandroidmodule.pass_object_activity.Student;

public class FragmentOne extends Fragment {

    private FragmentOneBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentOneBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnString.setOnClickListener(view1 -> {

            String data = binding.edtString.getText().toString();

            Student s = new Student("Bhagvat","Baroda");

            Bundle b = new Bundle();

            b.putSerializable("object",s);

            getParentFragmentManager().beginTransaction()
                    .replace(R.id.fcvAnotherHolder,FragmentTwo.class,b)
                    .addToBackStack("one")
                    .commit();


        });

    }
}