package com.absjbd.sap_healthco.Adapter;

import com.absjbd.sap_healthco.Model.Symptom;

import java.util.ArrayList;

/**
 * Created by basha on 3/2/2018.
 */

public class SymptomManager {

    Symptom aSymptom = new Symptom("অতিরিক্ত ওজন কমে যাওয়া,\nবুকের হাড় দেখা যাওয়া,\nকোমড় বুক আর পেটের চেয়ে ছোট হওয়া,\n" +
            "দুই পা ফুলে যাওয়া,\nপায়ে পানি চলে আসা,\nহাতের তালু ফ্যাকাশে হয়ে যাওয়া,\nবয়সের তুলনায় ওজন অনেক কম হওয়া");
    Symptom bSymptom = new Symptom("বাচ্চা বুকের দুধ খেতে পারছেনা,\n জোরে জোরে নিঃশ্বাস নিচ্ছে ,\n নিঃশ্বাস নেওয়ার সময় বুক আর পেটের একটা অংশ ঢেবে যাচ্ছে, \n " +
            "বাচ্চার বুকে ঘড়ঘড় শব্দ হচ্ছে ,\nযা খাচ্ছে বমি করে ফেলছে ,\n খিঁচুনি ,\n  নাক দিয়ে পানি পড়া ,কাশি \n");
    Symptom cSymptom = new Symptom("জ্বর ৯৯ ডিগ্রি ফারেনহাইটের বেশি থাকা \n");
    Symptom dSymptom = new Symptom("অনেক বেশি জ্বর ১০১/১০২ এর উপরে\n গিঁটে  গিঁটে  ব্যথা \n");
    Symptom eSymptom = new Symptom("পাতলা পায়খানা ,\nচোখ ঢেবে যাওয়া আর গর্তে বসে যাওয়া");


    public ArrayList<Symptom> childSymptomLists(){
        ArrayList<Symptom> symptomList = new ArrayList<Symptom>();
        symptomList.add(aSymptom);
        symptomList.add(bSymptom);
        symptomList.add(cSymptom);
        symptomList.add(dSymptom);
        symptomList.add(eSymptom);
        return symptomList;
    }

    public ArrayList<Symptom> femaleSymptomLists(){
        ArrayList<Symptom> symptomList = new ArrayList<Symptom>();
        //todo: female symptop list gula ei khane add korba similar to the previous one.

        return symptomList;
    }



    }