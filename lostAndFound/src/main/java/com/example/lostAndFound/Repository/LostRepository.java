
package com.example.lostAndFound.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lostAndFound.Entity.Lost;

@Repository
public interface LostRepository extends JpaRepository<Lost, Long> {

}
