package com.progetto.projectservice.models;



        import java.util.LinkedList;

public class Manager {
    private String nome,cognome,managerID;
    private LinkedList<Progetto> progetti;


    public Manager(){}

    public Manager(String nome, String cognome, String managerID){
        this.nome = nome;
        this.cognome = cognome;
        this.managerID= managerID;
        LinkedList<Progetto> progetti = new LinkedList<>() ;

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

    @Override
    public String toString() {
        return "Manager{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                '}';
    }
/*
    public  String toString(){
        String s = "MANAGER Nome: "+ nome + " Cognome: " + cognome + " ManagerID: "+ managerID;
        return s;
    }

 */
}


