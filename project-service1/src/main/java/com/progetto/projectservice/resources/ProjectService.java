package com.progetto.projectservice.resources;

import com.progetto.projectservice.models.Progetto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProjectService {

    private List<Progetto> projects = new ArrayList<>(Arrays.asList(
            new Progetto("001","Project 1","ProgettoSpaziale",400),
            new Progetto("002","Project 2","ProgettoTreni",666),
            new Progetto("003","Project 3","ProgettoSoftware",0)
    ));

    public String getAllProjects() {
        return projects.toString();
    }

    public Progetto getProgetto(String projectID){
        return projects.stream().filter(p -> p.getProjectID().equals(projectID)).findFirst().get();
    }

    public void addProgetto(Progetto progetto) {
        projects.add(progetto);
    }

    public void updateProgetto(Progetto progetto,String projectID) {
        for (int i = 0;i<projects.size();i++){
            Progetto p = projects.get(i);
            if(p.getProjectID().equals(projectID)){
                projects.set(i,progetto);
                return;
            }
        }
    }

    public void deleteProgetto(String projectID) {
        projects.removeIf(p -> p.getProjectID().equals(projectID));
    }
}
