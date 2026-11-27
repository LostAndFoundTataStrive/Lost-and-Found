
package com.example.lostAndFound.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lostAndFound.Entity.FoundReports;

@Repository
public interface FoundReportsRepository
        extends JpaRepository<FoundReports, Long> {

}
