package com.progetto.managerservice.resources;

import com.progetto.managerservice.models.Manager;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ManagerService {




    private List<Manager> managers = new ArrayList<>(Arrays.asList(
            new Manager("Giuseppe","Verdi","011",2500,1),
            new Manager("Luca","Rossi","012",4000,3),
            new Manager("Mario","Bianchi","013",3500,2)
    ));



    public String getAllManagers(){
        return managers.toString();
    }
    public Manager getManager(String managerID){
        return managers.stream().filter(m -> m.getManagerID().equals(managerID)).findFirst().get();
    }

    public void updateManager(Manager manager, String managerID) {
        for (int i = 0;i<managers.size();i++){
            Manager m = managers.get(i);
            if(m.getManagerID().equals(managerID)){
                managers.set(i,manager);
                return;
            }
        }
    }

    public void deleteManager(String managerID) {
        managers.removeIf(p -> p.getManagerID().equals(managerID));
    }

    public void addManager(Manager manager) {
        managers.add(manager);
    }
}
