package com.example.lostAndFound.Controller;

import com.example.lostAndFound.Entity.Organization;
import com.example.lostAndFound.Service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/organization")

public class OrganizationController {
    @Autowired
    OrganizationService organizationService;

    @PostMapping("/insert")
    public Organization insert(@RequestBody Organization organization)
    {
        return organizationService.insert(organization);
    }


    @PostMapping("/insertMany")
    public List<Organization> insertAll(@RequestBody List<Organization> organization)
    {
        return organizationService.insertMany(organization);
    }


    @GetMapping("/fetch")
    public List<Organization> fetch( )
    {
        return organizationService.fetch();
    }


    @GetMapping("/fetch/{id}")
    public Organization fetchbyid(@PathVariable Integer id)
    {
        return organizationService.fetchbyid(id);
    }

    @PutMapping("update/{id}")
    public Organization update(@PathVariable Integer id,@RequestBody Organization organization)
    {
        return organizationService.update(id,organization);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id)
    {
        return organizationService.delete(id);
    }
}
