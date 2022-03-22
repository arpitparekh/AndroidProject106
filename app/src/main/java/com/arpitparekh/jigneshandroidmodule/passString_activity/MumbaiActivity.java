package com.arpitparekh.jigneshandroidmodule.passString_activity;

import androidx.appcompat.app.AppCompatActivity;
import com.arpitparekh.jigneshandroidmodule.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MumbaiActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mumbai);

        Button b = findViewById(R.id.btnSend);

        EditText e = findViewById(R.id.edtSomething);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String data = e.getText().toString();

                Toast.makeText(MumbaiActivity.this,data, Toast.LENGTH_SHORT).show();

                Intent i = new Intent(MumbaiActivity.this,GoaActivity.class);
                i.putExtra("thing",data);
                startActivity(i);

            }
        });

    }
}