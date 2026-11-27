
package com.example.lostAndFound.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.lostAndFound.Entity.FoundReports;
import com.example.lostAndFound.Service.FoundReportsService;

@RestController
@RequestMapping("/foundReports")
public class FoundReportController {

    @Autowired
    FoundReportsService foundService;

    @PostMapping("/insert")
    public FoundReports insert(@RequestBody FoundReports foundReports) {
        return foundService.insert(foundReports);
    }

    @PostMapping("/insertMany")
    public List<FoundReports> insertAll(@RequestBody List<FoundReports> foundReports) {
        return foundService.insertMany(foundReports);
    }

    @GetMapping("/fetch")
    public List<FoundReports> fetch() {
        return foundService.fetch();
    }

    @GetMapping("/fetch/{id}")
    public FoundReports fetchbyid(@PathVariable Long id) {
        return foundService.fetchbyid(id);
    }

    @PutMapping("/update/{id}")
    public FoundReports update(@PathVariable Long id,
                               @RequestBody FoundReports foundReports) {
        return foundService.update(id, foundReports);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        return foundService.delete(id);
    }
}
