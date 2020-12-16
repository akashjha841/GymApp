package com.example.gym;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    Button btnPlans, btnAllTrainings,btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        Utils.initTrainings();




        btnAllTrainings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AllTrainingsActivity.class);
                startActivity(intent);
            }
        });

        btnPlans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PlanActivity.class);
                startActivity(intent);
            }
        });

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this)
                        .setTitle("About")
                        .setMessage("Created by Akash Jha")
                        .setNegativeButton("Dismiss", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        }).setPositiveButton("Visit Website", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                               
                                Intent intent = new Intent(MainActivity.this, WebsiteActivity.class);
                                startActivity(intent);
                            }
                        });
                builder.create().show();
            }
        });
    }

    private void initViews() {
        Log.d(TAG, "initViews: started");

        btnPlans = findViewById(R.id.btnPlanActivity);
        btnAllTrainings = findViewById(R.id.btnAllActivities);
        btnAbout = findViewById(R.id.btnAbout);

    }
}
