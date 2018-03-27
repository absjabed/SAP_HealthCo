package com.absjbd.sap_healthco.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.absjbd.sap_healthco.Activity.InfoActivity;
import com.absjbd.sap_healthco.Model.Symptom;
import com.absjbd.sap_healthco.R;
import com.absjbd.sap_healthco.Util.Constants;

import java.util.ArrayList;

/**
 * Created by basha on 3/4/2018.
 */

public class SymptomAdapter extends ArrayAdapter {

    private ArrayList<Symptom> symptomList = new ArrayList<>();
    private Context context;


    public SymptomAdapter(Context context, ArrayList<Symptom> symptomList) {
        super(context, R.layout.row_view, symptomList);
        this.symptomList = symptomList;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View myView = inflater.inflate(R.layout.row_view, null);

        final TextView symptomTv = (TextView) myView.findViewById(R.id.deseaseListItemTv);
        TextView dummyTv = (TextView) myView.findViewById(R.id.dummyText);

        symptomTv.setText(symptomList.get(position).getSymptom());
        dummyTv.setText("লক্ষণ নং:" + (position + 1));

        //TODO: Setting listener for Listview Item --- List view te kono item e click korle ki hobe seta set kora
        myView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0) { // <-- If 1st list item clicked........
                    Toast.makeText(context, "You clicked item " + position, Toast.LENGTH_SHORT).show();
                    //TODO: now to go to new activity
                    Intent intent = new Intent(context, InfoActivity.class);
                    intent.putExtra("eitaData", symptomList.get(position).getSymptom());  // <-- Sending Extradata to another activity
                    intent.putExtra("desease", "অপুষ্টি জনিত সমস্যা");
                    intent.putExtra("D_NO", Constants.CHILD_MAL_NUTRITION);
                    context.startActivity(intent);
                } else if (position == 1) {   // <-- If 2nd list item clicked........
                    Toast.makeText(context, "You clicked item " + position, Toast.LENGTH_SHORT).show();
                    //TODO: now to go to new activity
                    Intent intent = new Intent(context, InfoActivity.class);
                    intent.putExtra("eitaData", symptomList.get(position).getSymptom()/*symptomTv.getText()*/);  // <-- Sending Extradata to another activity
                    intent.putExtra("desease", "নিউমোনিয়া");
                    intent.putExtra("D_NO", Constants.CHILD_PNEUMONIA);
                    context.startActivity(intent);
                } else if (position == 2) {  // <-- If 3rd list item clicked........
                    Toast.makeText(context, "You clicked item " + position, Toast.LENGTH_SHORT).show();
                    //TODO: now to go to new activity
                    Intent intent = new Intent(context, InfoActivity.class);
                    intent.putExtra("eitaData", symptomList.get(position).getSymptom()/*symptomTv.getText()*/);  // <-- Sending Extradata to another activity
                    intent.putExtra("desease", "ডেঙ্গু");
                    intent.putExtra("D_NO", Constants.CHILD_DENGUE);
                    context.startActivity(intent);
                } else if (position == 3) {  // <-- If 4th list item clicked........
                    Toast.makeText(context, "You clicked item " + position, Toast.LENGTH_SHORT).show();
                    //TODO: now to go to new activity
                    Intent intent = new Intent(context, InfoActivity.class);
                    intent.putExtra("eitaData", symptomList.get(position).getSymptom()/*symptomTv.getText()*/);  // <-- Sending Extradata to another activity
                    intent.putExtra("desease", "ম্যালেরিয়া");
                    intent.putExtra("D_NO", Constants.CHILD_MALARIA);
                    context.startActivity(intent);
                } else if (position == 4) {  // <-- If 4th list item clicked........
                    Toast.makeText(context, "You clicked item " + position, Toast.LENGTH_SHORT).show();
                    //TODO: now to go to new activity
                    Intent intent = new Intent(context, InfoActivity.class);
                    intent.putExtra("eitaData", symptomList.get(position).getSymptom()/*symptomTv.getText()*/);  // <-- Sending Extradata to another activity
                    intent.putExtra("desease", "ডায়রিয়া");
                    intent.putExtra("D_NO", Constants.CHILD_DIAHOREA);
                    context.startActivity(intent);
                }

            }

        });


        /*myView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position == 1){ // <-- If 1st list item clicked........
                    Toast.makeText(context, "You clicked item "+position, Toast.LENGTH_SHORT).show();
                    //TODO: now to go to new activity
                    Intent intent = new Intent(context,InfoActivity.class);
                    intent.putExtra("eitaData",symptomList.get(position).getSymptom()*//*symptomTv.getText()*//*);  // <-- Sending Extradata to another activity
                    intent.putExtra("desease","FEMALE_DESEASES_no1");
                    intent.putExtra("D_NO", Constants.FEMALE_DESEASES_no1);
                    context.startActivity(intent);
                }else if(position == 2){   // <-- If 2nd list item clicked........
                    Toast.makeText(context, "u clicked item "+position, Toast.LENGTH_SHORT).show();
                    //TODO: now to go to new activity
                    Intent intent = new Intent(context,InfoActivity.class);
                    intent.putExtra("eitaData",symptomList.get(position).getSymptom()*//*symptomTv.getText()*//*);  // <-- Sending Extradata to another activity
                    intent.putExtra("desease","FEMALE_DESEASES_no2");
                    intent.putExtra("D_NO", Constants.FEMALE_DESEASES_no2);
                    context.startActivity(intent);
                }else if(position == 8){  // <-- If 3rd list item clicked........
                    Toast.makeText(context, "You clicked item "+position, Toast.LENGTH_SHORT).show();
                    //TODO: now to go to new activity
                    Intent intent = new Intent(context,InfoActivity.class);
                    intent.putExtra("eitaData",symptomList.get(position).getSymptom()*//*symptomTv.getText()*//*);  // <-- Sending Extradata to another activity
                    intent.putExtra("desease","FEMALE_DESEASES_no3");
                    intent.putExtra("D_NO", Constants.FEMALE_DESEASES_no3);
                    context.startActivity(intent);
                }else if(position == 3){  // <-- If 4th list item clicked........
                    Toast.makeText(context, "You clicked item "+position, Toast.LENGTH_SHORT).show();
                    //TODO: now to go to new activity
                    Intent intent = new Intent(context,InfoActivity.class);
                    intent.putExtra("eitaData",symptomList.get(position).getSymptom()*//*symptomTv.getText()*//*);  // <-- Sending Extradata to another activity
                    intent.putExtra("desease","FEMALE_DESEASES_no4");
                    intent.putExtra("D_NO", Constants.FEMALE_DESEASES_no4);
                    context.startActivity(intent);
                }else if(position == 4){  // <-- If 5th list item clicked........
                    Toast.makeText(context, "You clicked item "+position, Toast.LENGTH_SHORT).show();
                    //TODO: now to go to new activity
                    Intent intent = new Intent(context,InfoActivity.class);
                    intent.putExtra("eitaData",symptomList.get(position).getSymptom()*//*symptomTv.getText()*//*);  // <-- Sending Extradata to another activity
                    intent.putExtra("desease","FEMALE_DESEASES_no5");
                    intent.putExtra("D_NO", Constants.FEMALE_DESEASES_no5);
                    context.startActivity(intent);
                }


            }
        });*/

        return myView;
    }

}
