package com.example.lostAndFound.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lostAndFound.Entity.FoundReports;
import com.example.lostAndFound.Repository.FoundReportsRepository;

@Service
public class FoundReportsService {

    @Autowired
    FoundReportsRepository foundReportsRepository;

    // Insert single record
    public FoundReports insert(FoundReports foundReports) {
        return foundReportsRepository.save(foundReports);
    }

    // Insert multiple records
    public List<FoundReports> insertMany(List<FoundReports> foundReports) {
        return foundReportsRepository.saveAll(foundReports);
    }

    // Fetch all records
    public List<FoundReports> fetch() {
        return foundReportsRepository.findAll();
    }

    // Fetch record by ID
    public FoundReports fetchbyid(Integer id) {
        return foundReportsRepository.findById(id).orElse(null);
    }

    // Update record
    public FoundReports update(Integer id, FoundReports foundReports) {

        FoundReports existing = foundReportsRepository.findById(id).orElse(null);

        if (existing != null) {
            foundReports.setFoundReportId(id);
            return foundReportsRepository.save(foundReports);
        }

        return null;
    }

    // Delete record
    public String delete(Integer id) {

        if (foundReportsRepository.existsById(id)) {
            foundReportsRepository.deleteById(id);
            return "Found report deleted successfully";
        }

        return "Found report not found";
    }
}
