package com.example.lostAndFound.Service;

import com.example.lostAndFound.Entity.Location;
import com.example.lostAndFound.Repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {
    @Autowired
    LocationRepository locationRepository;

    public Location insert(Location location) {
        return locationRepository.save(location);
    }

    public List<Location> insertMany(List<Location> location) {
        return locationRepository.saveAll(location);
    }

    public List<Location> fetch() {
        return locationRepository.findAll();
    }

    public Location fetchbyid(Integer id) {
        return locationRepository.findById(id).orElse(null);
    }

    public Location update(Integer id, Location location) {
        Location location1=locationRepository.findById(id).orElse(null);
        if(location1!=null)
        {
            location1.setLocationname(location.getLocationname());
            location1.setLocationdescription(location.getLocationdescription());
            return locationRepository.save(location1);
        }
        return null;
    }

    public String delete(Integer id) {
        if(locationRepository.existsById(id)){
            locationRepository.deleteById(id);
            return "Data deleted successfully";
        }
        return null;

    }
}
