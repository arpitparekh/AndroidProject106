package com.arpitparekh.jigneshandroidmodule.menu;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.arpitparekh.jigneshandroidmodule.R;
import com.arpitparekh.jigneshandroidmodule.databinding.ActivityMyMenuBinding;
import com.google.android.material.snackbar.Snackbar;

public class MyMenuActivity extends AppCompatActivity {

    private ActivityMyMenuBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMyMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // there are 3 types of menu

        // option menu  // action bar
        // popup menu  // single click
        // context menu  // long

        registerForContextMenu(binding.btnContext);

        binding.btnPopup.setOnClickListener(view -> {

            PopupMenu pop =new  PopupMenu(this,view);

            pop.getMenuInflater().inflate(R.menu.my_menu,pop.getMenu());

            pop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {

                    switch (item.getItemId()){

                        case R.id.actionItem1:
                            Snackbar.make(binding.getRoot(),"Item1",Snackbar.LENGTH_SHORT).show();
                            break;
                        case R.id.actionItem2:
                            Snackbar.make(binding.getRoot(),"Item2",Snackbar.LENGTH_SHORT).show();
                            break;
                        case R.id.actionItem3:
                            Snackbar.make(binding.getRoot(),"Item3",Snackbar.LENGTH_SHORT).show();
                            break;
                        case R.id.actionItem4:
                            Snackbar.make(binding.getRoot(),"Item4",Snackbar.LENGTH_SHORT).show();
                            break;
                        case R.id.actionItem7:
                            Snackbar.make(binding.getRoot(),"Item7",Snackbar.LENGTH_SHORT).show();
                            break;

                    }

                    return false;
                }
            });

            pop.show();

        });


    }

    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull final MenuItem item) {

        switch (item.getItemId()){

            case R.id.actionItem1:
                Snackbar.make(binding.getRoot(),"Item1",Snackbar.LENGTH_SHORT).show();
                break;
            case R.id.actionItem2:
                Snackbar.make(binding.getRoot(),"Item2",Snackbar.LENGTH_SHORT).show();
                break;
            case R.id.actionItem3:
                Snackbar.make(binding.getRoot(),"Item3",Snackbar.LENGTH_SHORT).show();
                break;
            case R.id.actionItem4:
                Snackbar.make(binding.getRoot(),"Item4",Snackbar.LENGTH_SHORT).show();
                break;
            case R.id.actionItem7:
                Snackbar.make(binding.getRoot(),"Item7",Snackbar.LENGTH_SHORT).show();
                break;

        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(final ContextMenu menu, final View v, final ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.my_menu,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull final MenuItem item) {

        switch (item.getItemId()){

            case R.id.actionItem1:
                Snackbar.make(binding.getRoot(),"Item1",Snackbar.LENGTH_SHORT).show();
                break;
            case R.id.actionItem2:
                Snackbar.make(binding.getRoot(),"Item2",Snackbar.LENGTH_SHORT).show();
                break;
            case R.id.actionItem3:
                Snackbar.make(binding.getRoot(),"Item3",Snackbar.LENGTH_SHORT).show();
                break;
            case R.id.actionItem4:
                Snackbar.make(binding.getRoot(),"Item4",Snackbar.LENGTH_SHORT).show();
                break;
            case R.id.actionItem7:
                Snackbar.make(binding.getRoot(),"Item7",Snackbar.LENGTH_SHORT).show();
                break;

        }

        return super.onContextItemSelected(item);
    }
}