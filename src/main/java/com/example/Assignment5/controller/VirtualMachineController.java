package com.example.Assignment5.controller;

import com.example.Assignment5.entity.VirtualMachine;
import com.example.Assignment5.repositories.VirtualMachineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VirtualMachineController {
    @Autowired
    VirtualMachineRepository map;

    @PostMapping("/virtualmachine")
    public VirtualMachine postvirtualmach(@RequestBody VirtualMachine mach)
    {
        map.save(mach);
        return mach;
    }

    @GetMapping("/virtualmachine")
    public List<VirtualMachine> getAllVirtual_Mach() {
        List<VirtualMachine> virtual_Mach = map.findAll();
        return virtual_Mach;
    }

    @GetMapping("/virtualmachine/{id}")
    public VirtualMachine getVirtual_MachById(@PathVariable int id) {
        VirtualMachine Virtual_Mach = map.findById(id).get();
        return Virtual_Mach;
    }

    @DeleteMapping("/virtualmachine/{id}")
    public void deleteMachine(@PathVariable int id){
        map.deleteById(id);
    }

    @PutMapping("/virtualmachine")
    public VirtualMachine updateVirtualMachines(@RequestBody VirtualMachine updateVirtualMachines)
    {
        VirtualMachine virtualMachines = map.getById(updateVirtualMachines.getId());

        virtualMachines.setId(updateVirtualMachines.getId());
        virtualMachines.setName(updateVirtualMachines.getName());
        virtualMachines.setRegion(updateVirtualMachines.getRegion());
        virtualMachines.setMachineFamily(updateVirtualMachines.getMachineFamily());
        virtualMachines.setCPU(updateVirtualMachines.getCPU());
        virtualMachines.setMemory(updateVirtualMachines.getMemory());
        virtualMachines.setBootDiskSpace(updateVirtualMachines.getBootDiskSpace());
        virtualMachines.setBootDiskOS(updateVirtualMachines.getBootDiskOS());
        virtualMachines.setAllowTraffic(updateVirtualMachines.getAllowTraffic());


        map.save(virtualMachines);
        return  updateVirtualMachines;
    }
}
