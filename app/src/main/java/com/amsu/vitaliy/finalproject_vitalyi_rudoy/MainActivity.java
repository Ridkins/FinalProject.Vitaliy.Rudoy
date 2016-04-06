package com.amsu.vitaliy.finalproject_vitalyi_rudoy;

import android.app.ActionBar;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showTheBestSong(View view) {

        if (view.getId() == R.id.beatles) {
            Intent intentBeatles = new Intent(MainActivity.this, BeatlesActivity.class);
            startActivity(intentBeatles);
            overridePendingTransition(R.animator.activity_open_translate, R.animator.activity_close_scale);

        } else if (view.getId() == R.id.lana_del_rey) {

            Intent intentBeatles = new Intent(MainActivity.this, LanaDelReyActivity.class);
            startActivity(intentBeatles);
            overridePendingTransition(R.animator.activity_open_translate, R.animator.activity_close_scale);
        } else if (view.getId() == R.id.ocean) {

            Intent intentBeatles = new Intent(MainActivity.this, OceanActivity.class);
            startActivity(intentBeatles);
            overridePendingTransition(R.animator.activity_open_translate, R.animator.activity_close_scale);
        } else if (view.getId() == R.id.offspring) {

            Intent intentBeatles = new Intent(MainActivity.this, OffspringActivity.class);
            startActivity(intentBeatles);
            overridePendingTransition(R.animator.activity_open_translate, R.animator.activity_close_scale);
        } else if (view.getId() == R.id.nirvana) {

            Intent intentBeatles = new Intent(MainActivity.this, NirvanaActivity.class);
            startActivity(intentBeatles);
            overridePendingTransition(R.animator.activity_open_translate, R.animator.activity_close_scale);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        menu.findItem(R.id.action_previous).setVisible(false);
        menu.findItem(R.id.action_next).setVisible(false);
        menu.findItem(R.id.action_home).setVisible(false);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.action_quit) {
            openQuitDialog();
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onBackPressed() {
        // TODO Auto-generated method stub
        openQuitDialog();
    }

    private void openQuitDialog() {
        AlertDialog.Builder quitDialog = new AlertDialog.Builder(
                MainActivity.this);
        quitDialog.setTitle("Are you sure want to exit?");

        quitDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // TODO Auto-generated method stub
                System.exit(0);
            }
        });

        quitDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // TODO Auto-generated method stub
            }
        });

        quitDialog.show();
    }

}
