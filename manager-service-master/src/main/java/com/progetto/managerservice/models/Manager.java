package com.progetto.managerservice.models;


import java.util.LinkedList;

public class Manager {
    private String nome,cognome,managerID;
    private float stipendio;
    private int anInt;
    //numero di anni  in cui si è svolto il ruolo di dirigente
    private LinkedList<Progetto> progetti;


    public Manager(){}

    public Manager(String nome, String cognome, String managerID, float stipendio, int anInt) {
        this.nome = nome;
        this.cognome = cognome;
        this.managerID = managerID;
        this.stipendio = stipendio;
        this.anInt = anInt;
        LinkedList<Progetto> progetti = new LinkedList<>() ;
    }
    //dati privati
    public float getStipendio() {
        return stipendio;
    }
    //dati privati
    public void setStipendio(float stipendio) {
        this.stipendio = stipendio;
    }
//dati privati
    public int getAnInt() {
        return anInt;
    }
    //dati privati
    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }


    public void addProject(Progetto project){
        progetti.add(project);
    }

    public Progetto getProgetto(String projectID){
       Progetto p = new Progetto();
        for( int i = 0; i< progetti.size() ; i++){
            if(progetti.get(i).getProjectID() == projectID){
                 p = progetti.get(i); }
        }
        return p;
    }

    public void removeProject(Progetto project){
        progetti.remove(project);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getManagerID() {
        return managerID;
    }

    public void setManagerID(String managerID) {
        this.managerID = managerID;
    }


    public  String toString(){
        String s = "MANAGER Nome: "+ nome + " Cognome: " + cognome;
        return s;
    }
}


