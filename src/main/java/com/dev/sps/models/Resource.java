package com.dev.sps.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "RESOURCES")
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String name;
    
    private String link;
    
    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    public Resource() {
    }

    public Resource(String name, String link, Project project) {
        this.name = name;
        this.link = link;
        this.project = project;
    }

}
