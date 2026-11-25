package com.example.lostAndFound.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lostAndFound.Entity.Categories;
import com.example.lostAndFound.Repository.CategoriesRepository;

@Service 
public class CategoriesSerivice {
    @Autowired
    CategoriesRepository categoriesRepository;

    public Categories insert(Categories categories) {
        return categoriesRepository.save(categories);
    }

    public List<Categories> insertMany(List<Categories> categories) {
        return categoriesRepository.saveAll(categories);
    }

    public List<Categories> fetch() {
        return categoriesRepository.findAll();
    }

    public Categories fetchbyid(Integer id) {
        return categoriesRepository.findById(id).orElse(null);
    }

    public Categories update(Integer id, Categories categories) {
        Categories categories1=categoriesRepository.findById(id).orElse(null);
        if(categories1!=null)
        {
            categories1.setCategoryName(categories.getCategoryName());
            categories1.setCategoryDescription(categories.getCategoryDescription());
            return categoriesRepository.save(categories);
        }
        return null;
    }

    public String delete(Integer id) {
        if(categoriesRepository.existsById(id)){
            categoriesRepository.deleteById(id);
            return "Data deleted successfully";
        }
        return null;
    }
}
