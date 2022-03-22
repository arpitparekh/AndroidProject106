package com.arpitparekh.jigneshandroidmodule.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.arpitparekh.jigneshandroidmodule.R;
import android.os.Bundle;

public class HolderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holder);

        setTitle("Activity");

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        ft.add(R.id.fav_Holder,new FirstFragment());
        ft.commit();

    }
}