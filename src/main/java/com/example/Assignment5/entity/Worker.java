package com.example.Assignment5.entity;

import javax.persistence.*;

@Entity
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Enumerated(EnumType.STRING)
    WorkerMachineEnum machineFamily;

    int noWorkerNode;
    int CPUs;
    int memory;
    int diskSize;

    @Enumerated(EnumType.STRING)
    WorkerDiskType diskType;


    public Worker(int id, WorkerMachineEnum machineFamily, int noWorkerNode, int CPUs, int memory, int diskSize, WorkerDiskType diskType) {
        this.id = id;
        this.machineFamily = machineFamily;
        this.noWorkerNode = noWorkerNode;
        this.CPUs = CPUs;
        this.memory = memory;
        this.diskSize = diskSize;
        this.diskType = diskType;
    }
    public Worker() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public WorkerMachineEnum getMachineFamily() {
        return machineFamily;
    }

    public void setMachineFamily(WorkerMachineEnum machineFamily) {
        this.machineFamily = machineFamily;
    }

    public int getNoWorkerNode() {
        return noWorkerNode;
    }

    public void setNoWorkerNode(int noWorkerNode) {
        this.noWorkerNode = noWorkerNode;
    }

    public int getCPUs() {
        return CPUs;
    }

    public void setCPUs(int CPUs) {
        this.CPUs = CPUs;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(int diskSize) {
        this.diskSize = diskSize;
    }

    public WorkerDiskType getDiskType() {
        return diskType;
    }

    public void setDiskType(WorkerDiskType diskType) {
        this.diskType = diskType;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", machineFamily=" + machineFamily +
                ", noWorkerNode=" + noWorkerNode +
                ", CPUs=" + CPUs +
                ", memory=" + memory +
                ", diskSize=" + diskSize +
                ", diskType=" + diskType +
                '}';
    }
}
