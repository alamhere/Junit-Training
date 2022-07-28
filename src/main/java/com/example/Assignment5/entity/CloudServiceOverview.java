package com.example.Assignment5.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CloudServiceOverview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String subService;

    public CloudServiceOverview(int id, String subService) {
        this.id = id;
        this.subService = subService;
    }

    public CloudServiceOverview() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubService() {
        return subService;
    }

    public void setSubService(String subService) {
        this.subService = subService;
    }

    @Override
    public String toString() {
        return "CloudServiceOverview{" +
                "id=" + id +
                ", subService='" + subService + '\'' +
                '}';
    }
}
