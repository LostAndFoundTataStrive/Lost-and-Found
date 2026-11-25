package com.example.lostAndFound.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lostAndFound.Entity.Categories;
import com.example.lostAndFound.Entity.User;
import com.example.lostAndFound.Repository.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User insert(User user) {
        return userRepository.save(user);
    }

    public List<User> insertMany(List<User> user) {
        return userRepository.saveAll(user);
    }

    public List<User> fetch() {
        return userRepository.findAll();
    }

    public User fetchbyid(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    public User update(Integer id, User user) {
        User user1=userRepository.findById(id).orElse(null);
        if(user1!=null)
        {
            user1.setUserFullName(user.getUserFullName());
            user1.setUserEmail(user.getUserEmail());
            user1.setUserMembershipId(user.getUserMembershipId());
            user1.setUserRole(user.getUserRole());
            user1.setUserVerificationStatus(user.getUserVerificationStatus());
            user1.setUserpPassword(user.getUserpPassword());
            user1.setUserCreatedAt(user.getUserCreatedAt());
            return userRepository.save(user1);
        }
        return null;
    }

    public String delete(Integer id) {
        if(userRepository.existsById(id)){
            userRepository.deleteById(id);
            return "Data deleted successfully";
        }
        return null;
    }
}
