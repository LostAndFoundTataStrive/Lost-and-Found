
package com.example.lostAndFound.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "lost_reports")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lostReportId;

    private Long organizationId;
    private Long userId;
    private Long categoryId;
    private Long locationId;

    private String itemName;
    private String description;

    private LocalDate lostDate;
    private String imageUrl;

    private String status = "OPEN";

    private LocalDateTime createdAt = LocalDateTime.now();
}
