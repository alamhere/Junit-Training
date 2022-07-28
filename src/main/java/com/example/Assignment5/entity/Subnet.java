package com.example.Assignment5.entity;

import javax.persistence.*;

@Entity
public class Subnet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    String description;
    String region;
    String ipAddRange;

    @Enumerated(EnumType.STRING)
    SubnetEnum accessType;

    public Subnet(int id, String name, String description, String region, String ipAddRange, SubnetEnum accessType) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.region = region;
        this.ipAddRange = ipAddRange;
        this.accessType = accessType;
    }

    public Subnet() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getIpAddRange() {
        return ipAddRange;
    }

    public void setIpAddRange(String ipAddRange) {
        this.ipAddRange = ipAddRange;
    }

    public SubnetEnum getAccessType() {
        return accessType;
    }

    public void setAccessType(SubnetEnum accessType) {
        this.accessType = accessType;
    }

    @Override
    public String toString() {
        return "Subnet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", region='" + region + '\'' +
                ", ipAddRange='" + ipAddRange + '\'' +
                ", accessType=" + accessType +
                '}';
    }
}
