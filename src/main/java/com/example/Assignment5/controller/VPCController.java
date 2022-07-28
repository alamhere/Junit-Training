package com.example.Assignment5.controller;

import com.example.Assignment5.entity.Subnet;
import com.example.Assignment5.entity.VPC;
import com.example.Assignment5.repositories.FirewallRepository;
import com.example.Assignment5.repositories.SubnetRepository;
import com.example.Assignment5.repositories.VPC_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VPCController {
    @Autowired
    VPC_Repository map;
    @Autowired
    SubnetRepository map1;
    @Autowired
    FirewallRepository map2;

    @PostMapping("/vpc")
    public VPC postvpc(@RequestBody VPC virtual) {
        map.save(virtual);
        return virtual;
    }

    @GetMapping("/vpc")
    public List<VPC> getAllvpc() {
        List<VPC> vpc = map.findAll();
        return vpc;

    }

    @GetMapping("/vpc/{id}")
    public VPC getvpcById(@PathVariable int id) {
        VPC vpc = map.findById(id).get();
        return vpc;
    }

    @DeleteMapping("/vpc/{id}")
    public void deletevirtual(@PathVariable int id){
        map.deleteById(id);
    }

    @PutMapping("/vpc")
    public VPC updatevpc(@RequestBody VPC updateVP)
    {
        VPC net = map.getById(updateVP.getId());

        net.setId(updateVP.getId());
        net.setName(updateVP.getName());
        net.setDescription(updateVP.getDescription());
        net.setSubnet(updateVP.getSubnet());
        net.setFirewall(updateVP.getFirewall());

        map.save(net);
        return  updateVP;
    }


}
