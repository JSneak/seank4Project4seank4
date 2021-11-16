package com.example.seank4project4seank4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    public MainActivity() {
        super(R.layout.activity_main);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            Bundle startScreenBundle = new Bundle();
            startScreenBundle.putInt("startState", 0);
            Bundle idleScreenBundle = new Bundle();
            idleScreenBundle.putInt("startState", -1);

            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragment_player1_view, PlayerFragment.class, startScreenBundle)
                    .add(R.id.fragment_player2_view, PlayerFragment.class, idleScreenBundle)
                    .commit();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.menu1:
                    /* Start the game */
                return true;
            case R.id.menu2:
                    /* Exit the program */
                    finish();
                    System.exit(0);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}