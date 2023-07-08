package com.dev.sps.models;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "PROJECTS")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne
    @JoinColumn(name = "student_id")
    private User student;
    
    @ManyToOne
    @JoinColumn(name = "supervisor_id")
    private User supervisor;
    
    private String title;
    
    private String proposalLink;
    
    private String githubLink;
    
    private String webpageLink;
    
    private String literatureReviewLink;
    
    private String srsLink;
    
    private String sddLink;
    
    private String reportLink;
    
    private LocalDate dateProposed;
    
    private String academicYear;
    
    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;
    
    private float grade;

    public Project() {
    }

    public Project(User student, User supervisor, String title, String proposalLink, String githubLink,
            String webpageLink, String literatureReviewLink, String srsLink, String sddLink, String reportLink,
            LocalDate dateProposed, String academicYear, Status status, float grade) {
        this.student = student;
        this.supervisor = supervisor;
        this.title = title;
        this.proposalLink = proposalLink;
        this.githubLink = githubLink;
        this.webpageLink = webpageLink;
        this.literatureReviewLink = literatureReviewLink;
        this.srsLink = srsLink;
        this.sddLink = sddLink;
        this.reportLink = reportLink;
        this.dateProposed = dateProposed;
        this.academicYear = academicYear;
        this.status = status;
        this.grade = grade;
    }

    
}
