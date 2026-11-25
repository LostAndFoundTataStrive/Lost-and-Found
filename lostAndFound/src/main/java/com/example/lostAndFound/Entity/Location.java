
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
public class Location {

    @Id
    private Integer locationid;

    @ManyToOne
    private Organization organization;

    private String locationname;
    private String locationdescription;
}
