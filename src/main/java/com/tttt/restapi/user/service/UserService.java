package com.tttt.restapi.user.service;

import com.tttt.restapi.user.model.User;
import com.tttt.restapi.user.repository.UserRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    public User create(User user){
        return userRepository.save(user);
    }
    public Page<User> getAllUser(String keyword, Pageable pageable) {
        return userRepository.findAllByKey(keyword,pageable);
    }
    public Optional<User> getById(String id){
        return userRepository.findById(id);
    }
    
    public User updateUser(String id, User user) {
        Optional<User> u = userRepository.findById(id);
        
        User u1 = u.get();
        u1.setFirstName(user.getFirstName());
        u1.setLastName(user.getLastName());
        u1.setUserName(user.getUserName());
        u1.setPassword(user.getPassword());
        u1.setAddress(user.getAddress());
        u1.setPhoneNumber(user.getPhoneNumber());
        return userRepository.save(u1);
    }
    public void deleteAll(){
        userRepository.deleteAll();
    }
    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }
    
}
