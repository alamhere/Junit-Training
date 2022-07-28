package com.example.Assignment5.entity;

import javax.persistence.*;

@Entity
public class Firewall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Enumerated(EnumType.STRING)
    FirewallNameEnum name;

    @Enumerated(EnumType.STRING)
    FirewallTypeEnum typeEnum;

    String filter;
    String protocolPort;

    @Enumerated(EnumType.STRING)
    FirewallActionEnum actionEnum;

    public Firewall() {
    }

    public Firewall(int id, FirewallNameEnum name, FirewallTypeEnum typeEnum, String filter, String protocolPort, FirewallActionEnum actionEnum) {
        this.id = id;
        this.name = name;
        this.typeEnum = typeEnum;
        this.filter = filter;
        this.protocolPort = protocolPort;
        this.actionEnum = actionEnum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FirewallNameEnum getName() {
        return name;
    }

    public void setName(FirewallNameEnum name) {
        this.name = name;
    }

    public FirewallTypeEnum getTypeEnum() {
        return typeEnum;
    }

    public void setTypeEnum(FirewallTypeEnum typeEnum) {
        this.typeEnum = typeEnum;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getProtocolPort() {
        return protocolPort;
    }

    public void setProtocolPort(String protocolPort) {
        this.protocolPort = protocolPort;
    }

    public FirewallActionEnum getActionEnum() {
        return actionEnum;
    }

    public void setActionEnum(FirewallActionEnum actionEnum) {
        this.actionEnum = actionEnum;
    }

    @Override
    public String toString() {
        return "Firewall{" +
                "id=" + id +
                ", name=" + name +
                ", typeEnum=" + typeEnum +
                ", filter='" + filter + '\'' +
                ", protocolPort='" + protocolPort + '\'' +
                ", actionEnum=" + actionEnum +
                '}';
    }
}
