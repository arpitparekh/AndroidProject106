package com.arpitparekh.jigneshandroidmodule;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // activity lifeCycle

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = findViewById(R.id.btnGoNext);
        Button b1 = findViewById(R.id.btn1);
        TextView t = findViewById(R.id.tvText);
        ConstraintLayout layout = findViewById(R.id.parent);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setBackgroundColor(Color.BLUE);
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this,"This is Toast",Toast.LENGTH_LONG).show();
            }
        });

        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This is Another Toast", Toast.LENGTH_SHORT).show();
            }
        });



    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("lifecycle","start");

    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("lifecycle","resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("lifecycle","pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("lifecycle","stop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("lifecycle","restart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("lifecycle","destroy");
    }
}