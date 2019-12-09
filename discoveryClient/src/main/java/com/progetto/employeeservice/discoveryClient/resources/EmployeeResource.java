package com.progetto.employeeservice.discoveryClient.resources;

import com.progetto.employeeservice.discoveryClient.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeeResource {


    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private RestTemplate restTemplate;
//usare la porta http://localhost:8082/employees
    @RequestMapping("/employees")
    public String getEmployee(){

        return employeeService.getAllEmplyees();
    }

    @RequestMapping("/employees/{employeeID}")
    public Employee getEmployee(@PathVariable String employeeID){

        return employeeService.getEmployee(employeeID);
    }


    @RequestMapping(method = RequestMethod.POST,value = "/projects")
    public void addManager(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }
    @RequestMapping(method = RequestMethod.PUT,value = "/projects/{employeeID}")
    public void updateProgetto(@RequestBody Employee employee, @PathVariable String employeeID) {
        employeeService.updateEmployee(employee,employeeID);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/projects/{employeeID}")
    public void deleteProgetto(@RequestBody Employee employee, @PathVariable String employeeID) {
        employeeService.deleteEmployee(employeeID);
    }
}
