package com.example.Assignment5.controller;

import com.example.Assignment5.entity.CloudServiceCategory;
import com.example.Assignment5.repositories.CloudServiceCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CloudServiceCategoryController {
    @Autowired
    CloudServiceCategoryRepository map;

    @PostMapping("/service")
    public CloudServiceCategory postservice(@RequestBody CloudServiceCategory serv)
    {
        map.save(serv);
        return  serv;

    }

    @GetMapping("/service")
    public List<CloudServiceCategory> getAllService() {
        List<CloudServiceCategory> serv = map.findAll();
        return serv;
    }

    @GetMapping("/service/{id}")
    public CloudServiceCategory getServiceById(@PathVariable int id) {
        CloudServiceCategory serv = map.findById(id).get();
        return serv;
    }

    @DeleteMapping("/servicde/{id}")
    public void deleteserv(@PathVariable int id){
        map.deleteById(id);
    }

}
