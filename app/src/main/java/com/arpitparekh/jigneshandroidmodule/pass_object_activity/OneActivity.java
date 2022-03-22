package com.arpitparekh.jigneshandroidmodule.pass_object_activity;

import androidx.appcompat.app.AppCompatActivity;
import com.arpitparekh.jigneshandroidmodule.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        Button b = findViewById(R.id.btnObject);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Student s = new Student("jignesh","ahmedabad");

                Intent i = new Intent(OneActivity.this,TwoActivity.class);
                i.putExtra("object",s);
                startActivity(i);
            }
        });

    }
}