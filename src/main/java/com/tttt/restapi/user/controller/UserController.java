package com.tttt.restapi.user.controller;

import com.tttt.restapi.user.dto.UserDto;
import com.tttt.restapi.user.mapper.UserMapper;
import com.tttt.restapi.user.model.User;
import com.tttt.restapi.user.service.UserService;
import java.util.Optional;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class UserController {
    @Autowired
    private UserService userService;
    private final UserMapper userMapper;
    public UserController(){
        userMapper = Mappers.getMapper(UserMapper.class);
    }
    
    
//    @PostMapping("/users")
//    public String createUser (@RequestBody User user){
//        User u = userService.create(user);
//        return u.toString();
//}
    @PostMapping("/users")
    public ResponseEntity<User> create(@RequestBody final UserDto requestBody){
        return new ResponseEntity<>(userService.create(userMapper.userDtoToUser(requestBody)),HttpStatus.CREATED);
    }
    @GetMapping("/users")
    public Page<User> getAllUser(
            @RequestParam(value = "keyword", required = false) String keyword,
            Pageable pageable
            ){   
        Page<User> p = userService.getAllUser(keyword, pageable);
        return p;
    }
    @GetMapping("/users/{id}")
    public Optional<User> getUserbyID(@PathVariable("id") String id){
        return userService.getById(id);
    }
    @DeleteMapping("/users")
    public String deleteAll(){
        userService.deleteAll();
        return "Deleted all records";
    }
    @DeleteMapping("/users/{id}")
    public String delete(@PathVariable("id") String id){
        userService.deleteUser(id);
        return "Deleted";
    }
    @PutMapping("/users/{id}")
    public User updatePerson(@PathVariable("id") String id, @RequestBody User user){
        return userService.updateUser(id,user);
    }
}