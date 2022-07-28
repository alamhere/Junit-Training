package com.example.Assignment5.repositories;

import com.example.Assignment5.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker,Integer> {
}
