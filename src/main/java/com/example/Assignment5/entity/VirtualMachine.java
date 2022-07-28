package com.example.Assignment5.entity;

import javax.persistence.*;

@Entity
public class VirtualMachine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    String region;
    @Enumerated(EnumType.STRING)
    VirtualMachineEnum machineFamily;
    int CPU;
    int memory;
    int bootDiskSpace;
    String bootDiskOS;
    @Enumerated(EnumType.STRING)
    VirtualMachineTrafficEnum allowTraffic;

    public VirtualMachine(int id, String name, String region, VirtualMachineEnum machineFamily, int CPU, int memory, int bootDiskSpace, String bootDiskOS, VirtualMachineTrafficEnum allowTraffic) {
        this.id = id;
        this.name = name;
        this.region = region;
        this.machineFamily = machineFamily;
        this.CPU = CPU;
        this.memory = memory;
        this.bootDiskSpace = bootDiskSpace;
        this.bootDiskOS = bootDiskOS;
        this.allowTraffic = allowTraffic;
    }

    public VirtualMachine() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public VirtualMachineEnum getMachineFamily() {
        return machineFamily;
    }

    public int getCPU() {
        return CPU;
    }

    public int getMemory() {
        return memory;
    }

    public int getBootDiskSpace() {
        return bootDiskSpace;
    }

    public String getBootDiskOS() {
        return bootDiskOS;
    }

    public VirtualMachineTrafficEnum getAllowTraffic() {
        return allowTraffic;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setMachineFamily(VirtualMachineEnum machineFamily) {
        this.machineFamily = machineFamily;
    }

    public void setCPU(int CPU) {
        this.CPU = CPU;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setBootDiskSpace(int bootDiskSpace) {
        this.bootDiskSpace = bootDiskSpace;
    }

    public void setBootDiskOS(String bootDiskOS) {
        this.bootDiskOS = bootDiskOS;
    }

    public void setAllowTraffic(VirtualMachineTrafficEnum allowTraffic) {
        this.allowTraffic = allowTraffic;
    }

    @Override
    public String toString() {
        return "VirtualMachine{" +
                "id=" + id +
                ", Name='" + name + '\'' +
                ", Region='" + region + '\'' +
                ", MachineFamily=" + machineFamily +
                ", CPU=" + CPU +
                ", Memory=" + memory +
                ", BootDiskSpace=" + bootDiskSpace +
                ", BootDiskOS='" + bootDiskOS + '\'' +
                ", AllowTraffic=" + allowTraffic +
                '}';
    }
}
