package com.example.lostAndFound.Controller;

import com.example.lostAndFound.Entity.Location;
import com.example.lostAndFound.Entity.Organization;
import com.example.lostAndFound.Service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/location")
public class LocationController {
    @Autowired
    LocationService locationService;


    @PostMapping("/insert")
    public Location insert(@RequestBody Location location)
    {
        return locationService.insert(location);
    }


    @PostMapping("/insertMany")
    public List<Location> insertAll(@RequestBody List<Location> location)
    {
        return locationService.insertMany(location);
    }


    @GetMapping("/fetch")
    public List<Location> fetch( )
    {
        return locationService.fetch();
    }


    @GetMapping("/fetch/{id}")
    public Location fetchbyid(@PathVariable Integer id)
    {
        return locationService.fetchbyid(id);
    }

    @PutMapping("/update/{id}")
    public Location update(@PathVariable Integer id,@RequestBody Location orders)
    {
        return locationService.update(id,orders);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id)
    {
        return locationService.delete(id);
    }
}
