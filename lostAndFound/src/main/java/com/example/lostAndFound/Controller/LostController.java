
package com.example.lostAndFound.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.lostAndFound.Entity.Lost;
import com.example.lostAndFound.Service.LostService;

@RestController
@RequestMapping("/lost")
public class LostController {

    @Autowired
    LostService lostService;

    @PostMapping("/insert")
    public Lost insert(@RequestBody Lost lost) {
        return lostService.insert(lost);
    }

    @PostMapping("/insertMany")
    public List<Lost> insertAll(@RequestBody List<Lost> lost) {
        return lostService.insertMany(lost);
    }

    @GetMapping("/fetch")
    public List<Lost> fetch() {
        return lostService.fetch();
    }

    @GetMapping("/fetch/{id}")
    public Lost fetchbyid(@PathVariable Long id) {
        return lostService.fetchbyid(id);
    }

    @PutMapping("/update/{id}")
    public Lost update(@PathVariable Long id, @RequestBody Lost lost) {
        return lostService.update(id, lost);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        return lostService.delete(id);
    }
}
