package com.absjbd.sap_healthco.Activity;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;

import com.absjbd.sap_healthco.Adapter.SymptomAdapter;
import com.absjbd.sap_healthco.Adapter.SymptomManager;
import com.absjbd.sap_healthco.Model.Symptom;
import com.absjbd.sap_healthco.R;

import java.util.ArrayList;

public class ChildDiseaseActivity extends AppCompatActivity {

    private ListView child_diseaseLV;
    private ArrayList<Symptom> symptomList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        setContentView(R.layout.activity_child_disease);

        // Find the toolbar view inside the activity layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);

        child_diseaseLV =(ListView) findViewById(R.id.child_diseaseLV);
        SymptomManager manager = new SymptomManager();
        symptomList = manager.childSymptomLists();


        SymptomAdapter myAdapter = new SymptomAdapter(this,symptomList);
        child_diseaseLV.setAdapter(myAdapter);
        //registerForContextMenu(child_diseaseLV);
    }
}
