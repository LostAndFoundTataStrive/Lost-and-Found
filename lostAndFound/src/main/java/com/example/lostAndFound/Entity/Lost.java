package com.example.lostAndFound.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "lost_reports")
public class Lost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer lostReportId;

    private Integer organizationId;

    private Integer userId;

    private Integer categoryId;

    private Integer locationId;

    private String itemName;

    private String description;

    private LocalDate lostDate;

    private String imageUrl;

    private String status = "OPEN";

    private LocalDateTime createdAt = LocalDateTime.now();

}