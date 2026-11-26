package com.example.lostAndFound.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lostAndFound.Entity.FoundReports;
import com.example.lostAndFound.Service.FoundReportsService;

@RestController
@RequestMapping("/foundReports")
public class FoundReportController {

    @Autowired
    FoundReportsService foundReportsService;

    @PostMapping("/insert")
    public FoundReports insert(@RequestBody FoundReports foundReports) {
        return foundReportsService.insert(foundReports);
    }

    @PostMapping("/insertMany")
    public List<FoundReports> insertAll(@RequestBody List<FoundReports> foundReports) {
        return foundReportsService.insertMany(foundReports);
    }

    @GetMapping("/fetch")
    public List<FoundReports> fetch() {
        return foundReportsService.fetch();
    }

    @GetMapping("/fetch/{id}")
    public FoundReports fetchbyid(@PathVariable Integer id) {
        return foundReportsService.fetchbyid(id);
    }

    @PutMapping("/update/{id}")
    public FoundReports update(@PathVariable Integer id, @RequestBody FoundReports foundReports) {
        return foundReportsService.update(id, foundReports);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        return foundReportsService.delete(id);
    }
}