package com.example.Assignment5.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PRS {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String PrsName;

    public PRS(int id, String prsName) {
        this.id = id;
        PrsName = prsName;
    }

    public PRS() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrsName() {
        return PrsName;
    }

    public void setPrsName(String prsName) {
        PrsName = prsName;
    }

    @Override
    public String toString() {
        return "PRS{" +
                "id=" + id +
                ", PrsName='" + PrsName + '\'' +
                '}';
    }
}
