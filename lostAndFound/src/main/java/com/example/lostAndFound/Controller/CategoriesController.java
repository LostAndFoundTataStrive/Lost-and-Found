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

import com.example.lostAndFound.Entity.Categories;
import com.example.lostAndFound.Service.CategoriesSerivice;

@RestController
@RequestMapping("/categories")
public class CategoriesController {
    @Autowired
    CategoriesSerivice categoriesSerivice;

    @PostMapping("/insert")
    public Categories insert(@RequestBody Categories categories)
    {
        return categoriesSerivice.insert(categories);
    }


    @PostMapping("/insertMany")
    public List<Categories> insertAll(@RequestBody List<Categories> categories)
    {
        return categoriesSerivice.insertMany(categories);
    }


    @GetMapping("/fetch")
    public List<Categories> fetch( )
    {
        return categoriesSerivice.fetch();
    }


    @GetMapping("/fetch/{id}")
    public Categories fetchbyid(@PathVariable Integer id)
    {
        return categoriesSerivice.fetchbyid(id);
    }

    @PutMapping("/update/{id}")
    public Categories update(@PathVariable Integer id,@RequestBody Categories categories)
    {
        return categoriesSerivice.update(id,categories);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id)
    {
        return categoriesSerivice.delete(id);
    }
}
