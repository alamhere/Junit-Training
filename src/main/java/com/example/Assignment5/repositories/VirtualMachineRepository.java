package com.example.Assignment5.repositories;

import com.example.Assignment5.entity.VirtualMachine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VirtualMachineRepository extends JpaRepository<VirtualMachine,Integer> {
}
