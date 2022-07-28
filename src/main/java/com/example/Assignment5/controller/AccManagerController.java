package com.example.Assignment5.controller;

import com.example.Assignment5.entity.AccountManager;
import com.example.Assignment5.repositories.AccManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccManagerController {
    @Autowired
    AccManagerRepository map;

    @PostMapping("/accmange")
    public AccountManager postmanage(@RequestBody AccountManager acc)
    {
        map.save(acc);
        return acc;
    }

    @GetMapping("/accmange")
    public List<AccountManager> getAllacc_mange() {
        List<AccountManager> acc_mange = map.findAll();
        return acc_mange;
    }


    @GetMapping("/accmange/{id}")
    public AccountManager getac_mangeById(@PathVariable int id) {
        AccountManager acc_mange = map.findById(id).get();
        return acc_mange;
    }
    @DeleteMapping("/accmange/{id}")
    public void deleteMachine(@PathVariable int id){
        map.deleteById(id);
    }

    @PutMapping("/accmange")
    public AccountManager updateAccmange(@RequestBody AccountManager updateAcc)
    {
        AccountManager acc = map.getById(updateAcc.getId());

        acc.setId(updateAcc.getId());
        acc.setUserName(updateAcc.getUserName());
        acc.setAccName(updateAcc.getAccName());
        acc.setRoles(updateAcc.getRoles());

        map.save(acc);
        return  updateAcc;
    }
}

