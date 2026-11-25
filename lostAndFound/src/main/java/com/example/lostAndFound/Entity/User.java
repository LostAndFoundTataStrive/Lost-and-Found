package com.example.lostAndFound.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private Integer userId;
    @ManyToOne
    private Organization organization;
    private String userFullName;
    private String userEmail;
    private String userpPassword;
    private String userMembershipId;
    private String userRole;
    private String userVerificationStatus;
    private String userCreatedAt;
}
