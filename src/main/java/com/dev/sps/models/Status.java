package com.dev.sps.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "STATUSES")
public class Status {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String name;

    public Status(){}

    public Status(String name) {
        this.name = name;
    }
    
}
