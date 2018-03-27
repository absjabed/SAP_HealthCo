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

public class MainActivity extends AppCompatActivity {

    private Button oneBt;
    private Button twoBt;
    private Button threeBt;
    private Button fourBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);

        // Find the toolbar view inside the activity layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);

       /* oneBt = (Button) findViewById(R.id.oneBt);

        oneBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HospitalActivity.class);
                startActivity(intent);
            }
        });
*/
        oneBt = (Button) findViewById(R.id.oneBt);
        oneBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HealthActivity.class);
                startActivity(intent);
            }
        });

        twoBt = (Button) findViewById(R.id.twoBt);
        twoBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,HospitalActivity.class);
                startActivity(intent);
            }
        });

        threeBt = (Button) findViewById(R.id.threeBt);
        threeBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DoctorActivity.class);
                intent.putExtra("doctorType", 0);
                startActivity(intent);
            }

        });

        fourBt = (Button) findViewById(R.id.fourBt);
        fourBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, EmergencyInfo.class);
                startActivity(intent);
            }

        });

    }


    public void onClickAboutUs(View view) { //Todo: About Us
        Intent intent = new Intent(MainActivity.this,AboutUsActivity.class);
        startActivity(intent);
    }
}

