package com.example.Assignment5.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class AccountManager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String userName;
    String accName;

    @OneToMany(targetEntity = Role.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "role_fk", referencedColumnName = "id")
    List<Role> roles;

    public AccountManager(int id, String userName, String accName, List<Role> roles) {
        this.id = id;
        this.userName = userName;
        this.accName = accName;
        this.roles = roles;
    }

    public AccountManager() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "AccountManager{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", accName='" + accName + '\'' +
                ", roles=" + roles +
                '}';
    }
}
