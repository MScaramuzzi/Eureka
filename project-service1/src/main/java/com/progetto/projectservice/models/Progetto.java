package com.progetto.projectservice.models;

import java.util.LinkedList;

public class Progetto {
    private String projectID;
    private String nomeProgetto;
    private String descrizione;
    private float budget;



    public Progetto() {}

    public Progetto(String projectID,String nomeProgetto, String descrizione, float budget) {
        this.projectID = projectID;
        this.nomeProgetto = nomeProgetto;
        this.descrizione = descrizione;
        this.budget = budget;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public String getNomeProgetto() {
        return nomeProgetto;
    }

    public void setNomeProgetto(String nomeProgetto) {
        this.nomeProgetto = nomeProgetto;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public float getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }


    @Override
    public String toString() {
        return "Progetto{" +
                "nomeProgetto='" + nomeProgetto + '\'' +
                '}';
    }
}
