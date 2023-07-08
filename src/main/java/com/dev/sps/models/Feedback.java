package com.dev.sps.models;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "FEEDBACKS")
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    
    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;
    
    private String feedback;
    
    private LocalDate dateGiven;

    public Feedback() {
    }

    public Feedback(User user, Project project, String feedback, LocalDate dateGiven) {
        this.user = user;
        this.project = project;
        this.feedback = feedback;
        this.dateGiven = dateGiven;
    }

    
}
