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

import com.example.lostAndFound.Entity.Lost;
import com.example.lostAndFound.Service.LostService;

@RestController
@RequestMapping("/lost")
public class LostController {

    @Autowired
    LostService lostService;

    // Insert single record
    @PostMapping("/insert")
    public Lost insert(@RequestBody Lost lost) {
        return lostService.insert(lost);
    }

    // Insert multiple records
    @PostMapping("/insertMany")
    public List<Lost> insertAll(@RequestBody List<Lost> lost) {
        return lostService.insertMany(lost);
    }

    // Fetch all records
    @GetMapping("/fetch")
    public List<Lost> fetch() {
        return lostService.fetch();
    }

    // Fetch by ID
    @GetMapping("/fetch/{id}")
    public Lost fetchbyid(@PathVariable Integer id) {
        return lostService.fetchbyid(id);
    }

    // Update
    @PutMapping("/update/{id}")
    public Lost update(@PathVariable Integer id, @RequestBody Lost lost) {
        return lostService.update(id, lost);
    }

    // Delete
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        return lostService.delete(id);
    }
}