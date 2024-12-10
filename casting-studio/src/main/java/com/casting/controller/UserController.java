package com.casting.controller;

import com.casting.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class UserController {

    @GetMapping("/users")
    public List<User> getAllUsers(){

        List<User> users =  new ArrayList<>();
        User user1 =  new User(1,"nithyanand","nadar","demo@gmail.com","wthey");
        User user2 =  new User(2,"nithyanand","nadar","demo@gmail.com","wthey");
        users.add(user1);
        users.add(user2);

        return users;

    }

    @GetMapping("/users/{userId}")
    public User getUserById(@PathVariable("userId")Integer id){

        User user1 =  new User(1,"nithyanand","nadar","demo@gmail.com","wthey");
        user1.setId(id);

        return user1;

    }
}
