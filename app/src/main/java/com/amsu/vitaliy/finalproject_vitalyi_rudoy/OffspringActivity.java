package com.amsu.vitaliy.finalproject_vitalyi_rudoy;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class OffspringActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offspring);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.action_quit) {
            openQuitDialog();
        } else if (item.getItemId() == R.id.action_next) {
            Intent intentBeatles = new Intent(OffspringActivity.this, NirvanaActivity.class);
            startActivity(intentBeatles);
            overridePendingTransition(R.animator.activity_open_translate, R.animator.activity_close_scale);
            finish();
        } else if (item.getItemId() == R.id.action_previous) {
            Intent intentBeatles = new Intent(OffspringActivity.this, OceanActivity.class);
            startActivity(intentBeatles);
            overridePendingTransition(R.animator.activity_open_translate, R.animator.activity_close_scale);
            finish();
        } else if (item.getItemId() == R.id.action_home) {
            Intent intentBeatles = new Intent(OffspringActivity.this, MainActivity.class);
            startActivity(intentBeatles);
            overridePendingTransition(R.animator.activity_open_translate, R.animator.activity_close_scale);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    private void openQuitDialog() {
        AlertDialog.Builder quitDialog = new AlertDialog.Builder(
                OffspringActivity.this);
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
