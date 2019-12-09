package com.progetto.employeeservice.discoveryClient.resources;

import com.progetto.employeeservice.discoveryClient.models.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {


    private List<Employee> employees = new ArrayList<>(Arrays.asList(
            new Employee ("Mario","Rossi","123",1500),
            new Employee ("Gianluca","Degaetano","666",1200),
            new Employee ("Giuseppe","Verdi","456",1000),
            new Employee ("Francesco","Giuliani","789",2000)

    ));



    public String getAllEmplyees() {
        return employees.toString();

    }

    public Employee getEmployee(String employeeID){

        return employees.stream().filter(e -> e.getEmployeeID().equals(employeeID)).findFirst().get();

    }


    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void updateEmployee(Employee employee, String employeeID) {
        for (int i = 0;i<employees.size();i++){
            Employee e = employees.get(i);
            if(e.getEmployeeID().equals(employeeID)){
                employees.set(i,employee);

            }
        }
    }

    public void deleteEmployee(String employeeID) {
        employees.removeIf(e -> e.getEmployeeID().equals(employeeID));
    }
}
