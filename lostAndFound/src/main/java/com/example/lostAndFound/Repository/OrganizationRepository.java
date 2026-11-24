package com.example.lostAndFound.Repository;

import com.example.lostAndFound.Entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization,Integer> {

}
