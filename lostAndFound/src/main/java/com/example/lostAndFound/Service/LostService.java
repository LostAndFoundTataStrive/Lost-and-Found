package com.example.lostAndFound.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lostAndFound.Entity.Lost;
import com.example.lostAndFound.Repository.LostRepository;

@Service
public class LostService {

    @Autowired
    LostRepository lostRepository;

    // Insert single record
    public Lost insert(Lost lost) {
        return lostRepository.save(lost);
    }

    // Insert multiple records
    public List<Lost> insertMany(List<Lost> lost) {
        return lostRepository.saveAll(lost);
    }

    // Fetch all records
    public List<Lost> fetch() {
        return lostRepository.findAll();
    }

    // Fetch record by ID
    public Lost fetchbyid(Integer id) {
        return lostRepository.findById(id).orElse(null);
    }

    // Update record
    public Lost update(Integer id, Lost lost) {

        Lost existing = lostRepository.findById(id).orElse(null);

        if (existing != null) {
            lost.setLostReportId(id);
            return lostRepository.save(lost);
        }

        return null;
    }

    // Delete record
    public String delete(Integer id) {

        if (lostRepository.existsById(id)) {
            lostRepository.deleteById(id);
            return "Lost report deleted successfully";
        }

        return "Lost report not found";
    }
}
