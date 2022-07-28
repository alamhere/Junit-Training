package com.example.Assignment5.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    @OneToMany(targetEntity = PRS.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "prs_fk",referencedColumnName = "id")
    List<PRS> prs;

    public Role(int id, String name, List<PRS> prs) {
        this.id = id;
        this.name = name;
        this.prs = prs;
    }

    public Role() {
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

    public List<PRS> getPrs() {
        return prs;
    }

    public void setPrs(List<PRS> prs) {
        this.prs = prs;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", prs=" + prs +
                '}';
    }
}
