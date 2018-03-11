package com.absjbd.sap_healthco.Adapter;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.absjbd.sap_healthco.Model.DoctorModel;
import com.absjbd.sap_healthco.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by basha on 3/8/2018.
 */

public class DoctorAdapter extends ArrayAdapter {
    private static final int REQUEST_CALL = 1;
    ArrayList<DoctorModel> doctorsList = new ArrayList<>();
    Context context;
    Intent callIntent;
    public DoctorAdapter(Context context, ArrayList<DoctorModel> doctorsList) {
        super(context, R.layout.row_doctor, doctorsList);
        this.doctorsList = doctorsList;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        /*TODO: most of the things here are similar to SymptomAdapter*/
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View myView = inflater.inflate(R.layout.row_doctor, null);

        TextView doctorNameTV = (TextView) myView.findViewById(R.id.docNameTV);
        TextView doctorDesignationTV = (TextView)   myView.findViewById(R.id.docDesignationTV);
        TextView doctorAddressTV = (TextView) myView.findViewById(R.id.docAddressTV);
        TextView doctorPhoneTV = (TextView)   myView.findViewById(R.id.docPhoneTV);


        doctorNameTV.setText(doctorsList.get(position).getDoctorName());
        doctorDesignationTV.setText(doctorsList.get(position).getDoctorDesignation());
        doctorAddressTV.setText(doctorsList.get(position).getDoctorAddress());
        doctorPhoneTV.setText(doctorsList.get(position).getDoctorPhone());
        //symptomTv.setText(symptomList.get(position).getSymptom());
        //dummyTv.setText("Desease No:"+(position+1));

        myView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder
                        .setMessage("Do you want to make a phone call to Dr." +doctorsList.get(position).getDoctorName() + " ?")
                        .setTitle("Call Doctor")
                        .setCancelable(true)
                        .setPositiveButton("YES",
                                new DialogInterface.OnClickListener() {

                                    public void onClick(DialogInterface dialog, int id) {
                                        callIntent = new Intent(Intent.ACTION_CALL);
                                        callIntent.setData(Uri.parse("tel:" + doctorsList.get(position).getDoctorPhone()));
                                        if (ContextCompat.checkSelfPermission(context, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                            ActivityCompat.requestPermissions((Activity) context, new String[]{android.Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                                        } else {
                                            context.startActivity(callIntent);
                                        }
                                    }
                                });

                alertDialogBuilder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                        //finish();
                    }
                });
                AlertDialog alert = alertDialogBuilder.create();
                alert.show();
            }
        });

        return myView;
    }
}
