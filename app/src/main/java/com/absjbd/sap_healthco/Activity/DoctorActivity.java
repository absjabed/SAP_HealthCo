package com.absjbd.sap_healthco.Activity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;

import com.absjbd.sap_healthco.Adapter.DoctorAdapter;
import com.absjbd.sap_healthco.Adapter.DoctorManager;
import com.absjbd.sap_healthco.Model.DoctorModel;
import com.absjbd.sap_healthco.R;
import com.absjbd.sap_healthco.Util.Constants;

import java.util.ArrayList;

public class DoctorActivity extends AppCompatActivity {

    int docTypeInt;
    ListView doctorListView;
    ArrayList<DoctorModel> doctors = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_doctor);

        // Find the toolbar view inside the activity layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);


        Intent docIntent = getIntent();
        docTypeInt = docIntent.getIntExtra("doctorType", 0);

        doctorListView =  (ListView) findViewById(R.id.doctorListDeseaseWise);
        DoctorManager manager = new DoctorManager();

        if(docTypeInt== Constants.CHILD_DENGUE){
            //gets dengue doctor
            doctors = manager.getDengueDoctors();
            DoctorAdapter myAdapter = new DoctorAdapter(this,doctors);
            doctorListView.setAdapter(myAdapter);
        }else if(docTypeInt== Constants.CHILD_PNEUMONIA){
            //different doctor list
            doctors = manager.getPneumoniaDoctors();
            DoctorAdapter myAdapter = new DoctorAdapter(this,doctors);
            doctorListView.setAdapter(myAdapter);
        }else if(docTypeInt== Constants.CHILD_MAL_NUTRITION){
            //different doctor list
            doctors = manager.getNutritionDoctors();
            DoctorAdapter myAdapter = new DoctorAdapter(this,doctors);
            doctorListView.setAdapter(myAdapter);
        }else if(docTypeInt== Constants.CHILD_DIAHOREA){
            //different doctor list
            doctors = manager.getDiahoreaDoctors();
            DoctorAdapter myAdapter = new DoctorAdapter(this,doctors);
            doctorListView.setAdapter(myAdapter);
        }else if(docTypeInt== Constants.CHILD_MALARIA){
            //different doctor list
            doctors = manager.getMalariaDoctors();
            DoctorAdapter myAdapter = new DoctorAdapter(this,doctors);
            doctorListView.setAdapter(myAdapter);
        }else{
            //gets all doctor if doctor clicked from main activity
            doctors = manager.getAllDoctors();
            DoctorAdapter myAdapter = new DoctorAdapter(this,doctors);
            doctorListView.setAdapter(myAdapter);
        }








        //TODO: bind doctor custom list adapter as doctor type ---- using doctor model
    }
}
