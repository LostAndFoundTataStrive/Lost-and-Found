package com.example.lostAndFound.Entity;


import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "found_reports")
public class FoundReports {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer foundReportId;

    private Integer organizationId;

    private Integer userId;

    private Integer categoryId;

    private Integer locationId;

    private String itemName;

    private String description;

    private LocalDate foundDate;

    private String imageUrl;

    private String status = "AVAILABLE";

    private LocalDateTime createdAt = LocalDateTime.now();


    // Getters and Setters

    public Integer getFoundReportId() {
        return foundReportId;
    }

    public void setFoundReportId(Integer foundReportId) {
        this.foundReportId = foundReportId;
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getFoundDate() {
        return foundDate;
    }

    public void setFoundDate(LocalDate foundDate) {
        this.foundDate = foundDate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}