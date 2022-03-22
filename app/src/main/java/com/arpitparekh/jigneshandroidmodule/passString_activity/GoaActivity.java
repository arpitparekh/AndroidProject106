package com.arpitparekh.jigneshandroidmodule.passString_activity;

import androidx.appcompat.app.AppCompatActivity;
import com.arpitparekh.jigneshandroidmodule.R;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class GoaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goa);

        TextView tv = findViewById(R.id.tvReceive);

        Intent i = getIntent();

        String str = i.getStringExtra("thing");

        tv.setText(str);

    }
}