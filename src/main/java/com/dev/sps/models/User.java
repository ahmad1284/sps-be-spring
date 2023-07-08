package com.dev.sps.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String name;
    
    private String email;
    
    private String password;
    
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    public User () {}

    public User(String name, String email, String password, Role role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

}
