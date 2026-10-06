package net.shaikh.journelApp.controller;


import lombok.RequiredArgsConstructor;
import net.shaikh.journelApp.Entity.JournelEntity;
import net.shaikh.journelApp.Entity.JournelModule;
import net.shaikh.journelApp.service.ServiceInterface;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("journel")
public class journelController {

    public final ServiceInterface serviceInterface;

    @GetMapping("/getAll")
    public List <JournelEntity> getAllJournel(JournelEntity entity){
        return serviceInterface.getAllProduct();
    }

    @PostMapping("/addJournel")
    public JournelModule Addjarnel(@RequestBody JournelEntity entity){
        return serviceInterface.PostJournel(entity);
    }

    @GetMapping("/getby/{id}")
    public JournelModule GetbyId(@PathVariable String id){
        return serviceInterface.GetbyId(id);
    }

    @PutMapping("/updateJournel")
    public JournelModule UpdateJournel(@RequestBody JournelEntity entity){
        return serviceInterface.updateJournel(entity);
    }

    @DeleteMapping("/deleteJournel")
    public String DeleteJournel(@RequestParam String id){
        return serviceInterface.DeleteJournel(id);
    }
}
