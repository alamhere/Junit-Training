package com.example.Assignment5.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class VPC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String Name;
    String Description;

    @OneToMany(targetEntity = Subnet.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "subnet_fk", referencedColumnName = "id")
    List<Subnet> subnet;

    @OneToOne(targetEntity = Firewall.class , cascade = CascadeType.ALL)
    @JoinColumn(name = "firewall_fk" , referencedColumnName = "id")
    List<Firewall> firewall;

    public VPC(int id, String name, String description, List<Subnet> subnet, List<Firewall> firewall) {
        this.id = id;
        Name = name;
        Description = description;
        this.subnet = subnet;
        this.firewall = firewall;
    }

    public VPC() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public List<Subnet> getSubnet() {
        return subnet;
    }

    public void setSubnet(List<Subnet> subnet) {
        this.subnet = subnet;
    }

    public List<Firewall> getFirewall() {
        return firewall;
    }

    public void setFirewall(List<Firewall> firewall) {
        this.firewall = firewall;
    }

    @Override
    public String toString() {
        return "VPC{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Description='" + Description + '\'' +
                ", subnet=" + subnet +
                ", firewall=" + firewall +
                '}';
    }
}
