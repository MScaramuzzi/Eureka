package com.progetto.managerservice.resources;

 import com.progetto.managerservice.models.Manager;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.*;
 import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ManagerResource {

    @Autowired
    private ManagerService managerService;

     @Autowired
     private RestTemplate restTemplate;

     @RequestMapping("/managers")
    public String getManager(){
         return managerService.getAllManagers();
     }

     @RequestMapping("/managers/{managerID}")
    public Manager getManager(@PathVariable String managerID){

         return managerService.getManager(managerID);
     }

    @RequestMapping(method = RequestMethod.POST,value = "/managers")
    public void addManager(@RequestBody Manager manager) {
        managerService.addManager(manager);
    }
    @RequestMapping(method = RequestMethod.PUT,value = "/managers/{managerID}")
    public void updateProgetto(@RequestBody Manager manager,@PathVariable String managerID) {
        managerService.updateManager(manager,managerID);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/managers/{managerID}")
    public void deleteManager(@RequestBody Manager manager,@PathVariable String managerID) {
        managerService.deleteManager(managerID);
    }
}
