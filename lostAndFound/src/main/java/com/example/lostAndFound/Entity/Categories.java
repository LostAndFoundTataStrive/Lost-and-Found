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
public class Categories {
    @Id
    private Integer categoryId;
    private String categoryName;
    private String categoryDescription;
}
