package com.example.Assignment5.repositories;

import com.example.Assignment5.entity.AccountManager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccManagerRepository extends JpaRepository<AccountManager,Integer> {
}
