package com.arpitparekh.jigneshandroidmodule.layouts;

import androidx.appcompat.app.AppCompatActivity;
import com.arpitparekh.jigneshandroidmodule.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.os.Bundle;
import android.view.View;

public class LayoutAcitivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_cordinator);

        FloatingActionButton b = findViewById(R.id.fab);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar.make(view,"This is snackBar",Snackbar.LENGTH_SHORT).show();

            }
        });

    }
}