
package com.example.lostAndFound.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "found_reports")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FoundReports {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long foundReportId;

    private Long organizationId;
    private Long userId;
    private Long categoryId;
    private Long locationId;

    private String itemName;
    private String description;

    private LocalDate foundDate;
    private String imageUrl;

    private String status = "AVAILABLE";

    private LocalDateTime createdAt = LocalDateTime.now();
}
