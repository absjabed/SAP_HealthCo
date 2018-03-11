package com.absjbd.sap_healthco.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.absjbd.sap_healthco.R;
import com.absjbd.sap_healthco.Util.Constants;
import com.beardedhen.androidbootstrap.BootstrapButton;
import com.beardedhen.androidbootstrap.BootstrapLabel;

public class InfoActivity extends AppCompatActivity {


    BootstrapButton doctorBtn;
    String stringFromAnotherActivity, stringDesease;
    int DNO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        BootstrapLabel testTV = (BootstrapLabel) findViewById(R.id.testText);
        doctorBtn = (BootstrapButton) findViewById(R.id.seeDoctorBtn) ;
        BootstrapLabel deseaseName = (BootstrapLabel) findViewById(R.id.testTextDesease);



        Intent testIntent = getIntent();
        stringFromAnotherActivity = testIntent.getExtras().getString("eitaData"); //<-- getting extradata from intent
        stringDesease = testIntent.getExtras().getString("desease");
        DNO = testIntent.getIntExtra("D_NO", 0);

        testTV.setText(stringFromAnotherActivity);
        deseaseName.setText(stringDesease);

    }

//todo:
    public void onClickSeeDoctor(View view) {

        if(DNO == Constants.CHILD_MAL_NUTRITION){
            //TODO: TO doctor list
            Intent  intent = new Intent (InfoActivity.this, DoctorActivity.class);
            intent.putExtra("doctorType", Constants.CHILD_MAL_NUTRITION);
            startActivity(intent);
        }else if (DNO == Constants.CHILD_DENGUE){
            Intent  intent = new Intent (InfoActivity.this, DoctorActivity.class);
            intent.putExtra("doctorType", Constants.CHILD_DENGUE);
            startActivity(intent);
        }else if (DNO == Constants.CHILD_PNEUMONIA){
            Intent  intent = new Intent (InfoActivity.this, DoctorActivity.class);
            intent.putExtra("doctorType", Constants.CHILD_PNEUMONIA);
            startActivity(intent);
        }else if (DNO == Constants.CHILD_MALARIA){
            Intent  intent = new Intent (InfoActivity.this, DoctorActivity.class);
            intent.putExtra("doctorType", Constants.CHILD_MALARIA);
            startActivity(intent);
        }else if (DNO == Constants.CHILD_DIAHOREA){
            Intent  intent = new Intent (InfoActivity.this, DoctorActivity.class);
            intent.putExtra("doctorType", Constants.CHILD_DIAHOREA);
            startActivity(intent);
        }


    }
}
