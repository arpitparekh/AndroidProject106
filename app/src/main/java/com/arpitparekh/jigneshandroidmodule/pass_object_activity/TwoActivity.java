package com.arpitparekh.jigneshandroidmodule.pass_object_activity;

import androidx.appcompat.app.AppCompatActivity;
import com.arpitparekh.jigneshandroidmodule.R;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        TextView tv = findViewById(R.id.tvObject);
        TextView tv2 = findViewById(R.id.tvObject2);

        Intent i = getIntent();

        Student s =  (Student) i.getSerializableExtra("object");

        tv.setText(s.name);
        tv2.setText(s.address);
    }
}