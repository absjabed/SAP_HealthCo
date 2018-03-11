package com.absjbd.sap_healthco.Adapter;

import com.absjbd.sap_healthco.Model.DoctorModel;

import java.util.ArrayList;

/**
 * Created by basha on 3/7/2018.
 */

public class DoctorManager {

    //DoctorModel dengueDoctor = new DoctorModel();

    /*TODO: for example we will create 10 dengue doctor so we will use a loop to make
    * TODO: demo dengue doctors  Arraylist*/

    public ArrayList<DoctorModel> getDengueDoctors(){
        ArrayList<DoctorModel> doctors = new ArrayList<DoctorModel>();
        for(int i=1; i<=10; i++){
            DoctorModel dengueDoctor = new DoctorModel();
            dengueDoctor.setDoctorName("Dengue Doctor "+i+" Name");
            dengueDoctor.setDoctorAddress("Dengue Doctor "+i+" Address");
            dengueDoctor.setDoctorDesignation("Dengue Doctor "+i+" Designation");
            dengueDoctor.setDoctorPhone("Phone No: "+i+"98765467");

            doctors.add(dengueDoctor);

        }
        return doctors;
    }
    public ArrayList<DoctorModel> getNutritionDoctors(){
        ArrayList<DoctorModel> doctors = new ArrayList<DoctorModel>();
        for(int i=1; i<=10; i++){
            DoctorModel nutritionDoctor = new DoctorModel();
            nutritionDoctor.setDoctorName("Nutrition Doctor "+i+" Name");
            nutritionDoctor.setDoctorAddress("Nutrition Doctor "+i+" Address");
            nutritionDoctor.setDoctorDesignation("Nutrition Doctor "+i+" Designation");
            nutritionDoctor.setDoctorPhone("Phone No: "+i+"98765467");

            doctors.add(nutritionDoctor);

        }
        return doctors;
    }
    public ArrayList<DoctorModel> getPneumoniaDoctors(){
        ArrayList<DoctorModel> doctors = new ArrayList<DoctorModel>();
        for(int i=1; i<=10; i++){
            DoctorModel pneumoniaDoctor = new DoctorModel();
            pneumoniaDoctor.setDoctorName("Pneumonia Doctor "+i+" Name");
            pneumoniaDoctor.setDoctorAddress("Pneumonia Doctor "+i+" Address");
            pneumoniaDoctor.setDoctorDesignation("Pneumonia Doctor "+i+" Designation");
            pneumoniaDoctor.setDoctorPhone("Phone No: "+i+"98765467");

            doctors.add(pneumoniaDoctor);

        }
        return doctors;
    }

    public ArrayList<DoctorModel> getAllDoctors(){
        ArrayList<DoctorModel> doctors = new ArrayList<DoctorModel>();
        for(int i=1; i<=20; i++){
            DoctorModel allDoctor = new DoctorModel();
            allDoctor.setDoctorName("All Doctor "+i+" Name");
            allDoctor.setDoctorAddress("All Doctor "+i+" Address");
            allDoctor.setDoctorDesignation("All Doctor "+i+" Designation");
            allDoctor.setDoctorPhone("Phone No: "+i+"98765467");

            doctors.add(allDoctor);

        }
        return doctors;
    }

    public ArrayList<DoctorModel> getDiahoreaDoctors() {
        ArrayList<DoctorModel> doctors = new ArrayList<DoctorModel>();
        for(int i=1; i<=10; i++){
            DoctorModel DiahoreaDoctor = new DoctorModel();
            DiahoreaDoctor.setDoctorName("Diahorea Doctor "+i+" Name");
            DiahoreaDoctor.setDoctorAddress("Diahorea Doctor "+i+" Address");
            DiahoreaDoctor.setDoctorDesignation("Diahorea Doctor "+i+" Designation");
            DiahoreaDoctor.setDoctorPhone("Phone No: "+i+"98765467");

            doctors.add(DiahoreaDoctor);

        }
        return doctors;
    }

    public ArrayList<DoctorModel> getMalariaDoctors() {
        ArrayList<DoctorModel> doctors = new ArrayList<DoctorModel>();
        for(int i=1; i<=10; i++){
            DoctorModel MalariaDoctor = new DoctorModel();
            MalariaDoctor.setDoctorName("Malaria Doctor "+i+" Name");
            MalariaDoctor.setDoctorAddress("Malaria Doctor "+i+" Address");
            MalariaDoctor.setDoctorDesignation("Malaria Doctor "+i+" Designation");
            MalariaDoctor.setDoctorPhone("Phone No: "+i+"98765467");

            doctors.add(MalariaDoctor);

        }
        return doctors;
    }
}
