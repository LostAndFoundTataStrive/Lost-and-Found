package com.example.lostAndFound.Service;

import com.example.lostAndFound.Entity.Organization;
import com.example.lostAndFound.Repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationService {

    @Autowired
    private OrganizationRepository organizationRepository;

    public Organization insert(Organization organization) {
        return organizationRepository.save(organization);
    }

    public List<Organization> insertMany(List<Organization> organization) {
        return organizationRepository.saveAll(organization);
    }

    public List<Organization> fetch() {
        return organizationRepository.findAll();
    }

    public Organization fetchbyid(Integer id) {
        return organizationRepository.findById(id).orElse(null);
    }

    public Organization update(Integer id, Organization organization) {
        Organization organization1 =
                organizationRepository.findById(id).orElse(null);

        if (organization1 != null) {
            organization1.setOrganizationname(organization.getOrganizationname());
            organization1.setOrganizationtype(organization.getOrganizationtype());
            organization1.setOrganizationemail(organization.getOrganizationemail());
            organization1.setOrganizationaddress(organization.getOrganizationaddress());
            organization1.setOrganizationstatus(organization.getOrganizationstatus());
            organization1.setOrganizationcreatedat(organization.getOrganizationcreatedat());

            return organizationRepository.save(organization1);
        }

        return null;
    }

    public String delete(Integer id) {
        if (organizationRepository.existsById(id)) {
            organizationRepository.deleteById(id);
            return "Data deleted successfully";
        }
        return null;
    }
}