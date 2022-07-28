package com.example.Assignment5.controller;

import com.example.Assignment5.entity.CloudServiceOverview;
import com.example.Assignment5.repositories.CloudServiceOverviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CloudServiceOverviewController {
    @Autowired
    CloudServiceOverviewRepository map;

    @PostMapping("/overview")
    public CloudServiceOverview postover(@RequestBody CloudServiceOverview ov)
    {
        map.save(ov);
        return ov;
    }

    @GetMapping("/overview")
    public List<CloudServiceOverview> getAlloverview() {
        List<CloudServiceOverview> ov = map.findAll();
        return ov;
    }

    @GetMapping("/overview/{id}")
    public CloudServiceOverview getoverviewById(@PathVariable int id) {
        CloudServiceOverview ov = map.findById(id).get();
        return ov;
    }
    @DeleteMapping("/overview/{id}")
    public void deleteoverview(@PathVariable int id){
        map.deleteById(id);
    }


}
