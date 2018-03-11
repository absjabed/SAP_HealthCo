package com.absjbd.sap_healthco.Model;

/**
 * Created by basha on 3/2/2018.
 */
// This is a Model class
public class Symptom {
    private int id;
    private String symptom;

    public Symptom(int id, String symptom) {
        this.id = id;
        this.symptom = symptom;
    }

    public Symptom(String symptom) {
        this.symptom = symptom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }
}
