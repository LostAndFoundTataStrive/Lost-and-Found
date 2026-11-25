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

import com.example.lostAndFound.Entity.User;
import com.example.lostAndFound.Service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/insert")
    public User insert(@RequestBody User user)
    {
        return userService.insert(user);
    }


    @PostMapping("/insertMany")
    public List<User> insertAll(@RequestBody List<User> user)
    {
        return userService.insertMany(user);
    }


    @GetMapping("/fetch")
    public List<User> fetch( )
    {
        return userService.fetch();
    }


    @GetMapping("/fetch/{id}")
    public User fetchbyid(@PathVariable Integer id)
    {
        return userService.fetchbyid(id);
    }

    @PutMapping("/update/{id}")
    public User update(@PathVariable Integer id,@RequestBody User user)
    {
        return userService.update(id,user);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id)
    {
        return userService.delete(id);
    }
}
