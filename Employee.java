package com.project.Visible_Campus_EmployeeDetails;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String EmployeeName;
    private Double compensation;
    private String Performance;
    private String feedback;
    private String address;
    private String ContactDetails;
    private String organizationId;
    private LocalDateTime createdTime;

    @PrePersist
    public void onCreate(){
        this.createdTime = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public Double getCompensation() {
        return compensation;
    }

    public void setCompensation(Double compensation) {
        this.compensation = compensation;
    }

    public String getPerformance() {
        return Performance;
    }

    public void setPerformance(String performance) {
        Performance = performance;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactDetails() {
        return ContactDetails;
    }

    public void setContactDetails(String contactDetails) {
        ContactDetails = contactDetails;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }
}
