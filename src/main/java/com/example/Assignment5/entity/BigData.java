package com.example.Assignment5.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class BigData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String clusterName;
    String region;
    String clusterType;
    String softwareComponent;

    @OneToMany(targetEntity = Master.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "master_fk", referencedColumnName = "id")
    List<Master> master;

    @OneToMany(targetEntity = Worker.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "worker_fk", referencedColumnName = "id")
    List<Worker> worker;

    String encryption;

    public BigData(int id, String clusterName, String region, String clusterType, String softwareComponent, List<Master> master, List<Worker> worker, String encryption) {
        this.id = id;
        this.clusterName = clusterName;
        this.region = region;
        this.clusterType = clusterType;
        this.softwareComponent = softwareComponent;
        this.master = master;
        this.worker = worker;
        this.encryption = encryption;
    }

    public BigData() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getClusterType() {
        return clusterType;
    }

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    public String getSoftwareComponent() {
        return softwareComponent;
    }

    public void setSoftwareComponent(String softwareComponent) {
        this.softwareComponent = softwareComponent;
    }

    public List<Master> getMaster() {
        return master;
    }

    public void setMaster(List<Master> master) {
        this.master = master;
    }

    public List<Worker> getWorker() {
        return worker;
    }

    public void setWorker(List<Worker> worker) {
        this.worker = worker;
    }

    public String getEncryption() {
        return encryption;
    }

    public void setEncryption(String encryption) {
        this.encryption = encryption;
    }

    @Override
    public String toString() {
        return "BigData{" +
                "id=" + id +
                ", clusterName='" + clusterName + '\'' +
                ", region='" + region + '\'' +
                ", clusterType='" + clusterType + '\'' +
                ", softwareComponent='" + softwareComponent + '\'' +
                ", master=" + master +
                ", worker=" + worker +
                ", encryption='" + encryption + '\'' +
                '}';
    }
}
