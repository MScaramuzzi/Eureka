package com.progetto.projectservice.resources;

import com.netflix.discovery.DiscoveryClient;
import com.progetto.projectservice.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedList;


@RestController

public class ProjectResource {


    @Autowired
    private ProjectService projectService;

    @Autowired
    public RestTemplate restTemplate;
/*
    @Autowired
    private DiscoveryClient discoveryClient;

 */

    @RequestMapping("/projects")
    public String getProject(){

        return projectService.getAllProjects();

    }

    @RequestMapping("/projects/{projectID}")
    public Progetto getProgetto(@PathVariable String projectID){
        return projectService.getProgetto(projectID);
    }



    @RequestMapping("/overview/{projectID}")
    public String overview(@PathVariable String projectID){

        String s = "Overview del progetto ";
        Manager m1= new Manager("Francesco","Rossi","789");

        Partecipanti partecipanti = new Partecipanti(projectID,m1.getManagerID());
        //   Manager manager = restTemplate.getForObject("http://localhost:8083/managers/" + managerID, UserRating.class);

        partecipanti.addPartecipanti( restTemplate.getForObject("http://employee-discovery/employees/456",Employee.class));
/*
        partecipanti.addPartecipanti( restTemplate.getForObject("http://localhost:8082/employees/666",Employee.class));
        partecipanti.addPartecipanti( restTemplate.getForObject("http://localhost:8082/employees/456",Employee.class));


 */

        s += "\n" + projectService.getProgetto(projectID).toString() + m1.toString()+ "\n" + partecipanti.toString() ;


        return s;
    }
    @RequestMapping(method = RequestMethod.POST,value = "/projects")
    public void addProgetto(@RequestBody Progetto progetto) {
        projectService.addProgetto(progetto);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/projects/{projectID}")
    public void updateProgetto(@RequestBody Progetto progetto,@PathVariable String projectID) {
        projectService.updateProgetto(progetto,projectID);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/projects/{projectID}")
    public void deleteProgetto(@RequestBody Progetto progetto,@PathVariable String projectID) {
        projectService.deleteProgetto(projectID);
    }

}