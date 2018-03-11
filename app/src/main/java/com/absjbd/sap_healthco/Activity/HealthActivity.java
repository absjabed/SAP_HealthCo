package com.absjbd.sap_healthco.Activity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.absjbd.sap_healthco.R;

public class HealthActivity extends AppCompatActivity {

    private Button fiveBt;
    private Button sixBt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_health);

        // Find the toolbar view inside the activity layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);

        fiveBt = (Button) findViewById(R.id.fiveBt);

       /* fiveBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });*/

        sixBt = (Button) findViewById(R.id.sixBt);
       /* sixBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/
    }

    public void FemaleBtnClick(View view) {
        Intent intent = new Intent(HealthActivity.this, DiseaseActivity.class);
        startActivity(intent);
    }

    public void ChildBtnClick(View view) {
        Intent intent = new Intent(HealthActivity.this, ChildDiseaseActivity.class);
        startActivity(intent);

    }
}
