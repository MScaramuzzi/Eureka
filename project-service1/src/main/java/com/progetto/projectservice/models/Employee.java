package com.progetto.projectservice.models;

import com.progetto.projectservice.models.Progetto;

import java.util.LinkedList;
;

public class Employee {
    private String nome;
    private String cognome;
    private String employeeID;
    private float stipendio;





    public Employee() {}

    public Employee(String nome, String cognome, String employeeID,float stipendio) {
        this.nome = nome;
        this.cognome = cognome;
        this.employeeID = employeeID;
        this.stipendio = stipendio;
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

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                '}';
    }








}
