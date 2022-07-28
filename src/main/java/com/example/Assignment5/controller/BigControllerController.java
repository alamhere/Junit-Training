package com.example.Assignment5.controller;

import com.example.Assignment5.entity.BigData;
import com.example.Assignment5.repositories.BigDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BigControllerController {
    @Autowired
    BigDataRepository map;

    @PostMapping("/bigdata")
    public BigData postbigdata(@RequestBody BigData big) {
        map.save(big);
        return big;
    }

    @GetMapping("/bigdata")
    public List<BigData> getAllbig_data() {
        List<BigData> big_data = map.findAll();
        return big_data;

    }

    @GetMapping("/bigdata/{id}")
    public BigData getbig_dataById(@PathVariable int id) {
        BigData big_data = map.findById(id).get();
        return big_data;
    }

    @DeleteMapping("/bigdata/{id}")
    public void deletebig(@PathVariable int id){
        map.deleteById(id);
    }


    @PutMapping("/bigdata")
    public BigData updateBigData(@RequestBody BigData updatebig)
    {
        BigData big = map.getById(updatebig.getId());

        big.setId(updatebig.getId());
        big.setClusterName(updatebig.getClusterName());
        big.setRegion(updatebig.getRegion());
        big.setClusterType(updatebig.getClusterType());
        big.setSoftwareComponent(updatebig.getSoftwareComponent());
        big.setMaster(updatebig.getMaster());
        big.setWorker(updatebig.getWorker());
        big.setEncryption(updatebig.getEncryption());

        map.save(big);
        return  updatebig;
    }

}
