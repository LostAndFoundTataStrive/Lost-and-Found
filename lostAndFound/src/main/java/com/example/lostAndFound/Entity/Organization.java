package com.example.lostAndFound.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Organization {

    @Id
    private Integer organizationid;

    private String organizationname;
    private String organizationtype;
    private String organizationemail;
    private String organizationaddress;
    private String organizationstatus;
    private String organizationcreatedat;
}
