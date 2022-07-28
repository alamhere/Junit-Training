package com.example.Assignment5.entity;

import javax.persistence.*;

@Entity
public class Master {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Enumerated(EnumType.STRING)
    MasterFamilyEnum machineFamily;
    int CPUs;
    int memory;
    int diskSize;

    @Enumerated(EnumType.STRING)
    MasterDiskEnum diskType;

    public Master(int id, MasterFamilyEnum machineFamily, int CPUs, int memory, int diskSize, MasterDiskEnum diskType) {
        this.id = id;
        this.machineFamily = machineFamily;
        this.CPUs = CPUs;
        this.memory = memory;
        this.diskSize = diskSize;
        this.diskType = diskType;
    }

    public Master() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MasterFamilyEnum getMachineFamily() {
        return machineFamily;
    }

    public void setMachineFamily(MasterFamilyEnum machineFamily) {
        this.machineFamily = machineFamily;
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

    public MasterDiskEnum getDiskType() {
        return diskType;
    }

    public void setDiskType(MasterDiskEnum diskType) {
        this.diskType = diskType;
    }

    @Override
    public String toString() {
        return "Master{" +
                "id=" + id +
                ", machineFamily=" + machineFamily +
                ", CPUs=" + CPUs +
                ", memory=" + memory +
                ", diskSize=" + diskSize +
                ", diskType=" + diskType +
                '}';
    }
}
