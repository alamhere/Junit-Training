package com.example.Assignment5.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class CloudServiceCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String name;

    @OneToMany(targetEntity = CloudServiceOverview.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "overview_fk", referencedColumnName = "id")
    List<CloudServiceOverview> overviews;

    public CloudServiceCategory(int id, String name, List<CloudServiceOverview> overviews) {
        Id = id;
        this.name = name;
        this.overviews = overviews;
    }

    public CloudServiceCategory() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CloudServiceOverview> getOverviews() {
        return overviews;
    }

    public void setOverviews(List<CloudServiceOverview> overviews) {
        this.overviews = overviews;
    }

    @Override
    public String toString() {
        return "CloudServiceCategory{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", overviews=" + overviews +
                '}';
    }
}
