package com.arpitparekh.jigneshandroidmodule.activity_switch;

import androidx.appcompat.app.AppCompatActivity;
import com.arpitparekh.jigneshandroidmodule.R;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        setTitle("First Activity");  // change actionBar name

        Button b = findViewById(R.id.btnSwitch);
        Button b1 = findViewById(R.id.btnImplicit);

        Log.i("life","create");

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Intent

                // explicit intent

                Intent i = new Intent(FirstActivity.this,SecondActivity.class);
                startActivity(i);
//                finish();  // do not come back to this activity

            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Intent.ACTION_MAIN);    // implicit intent
//                i.addCategory(Intent.CATEGORY_APP_CONTACTS);
                i.addCategory(Intent.CATEGORY_HOME);
                startActivity(i);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("life","start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("life","resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("life","pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("life","stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("life","destroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("life","restart");
    }

}