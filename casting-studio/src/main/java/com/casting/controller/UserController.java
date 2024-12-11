package com.casting.controller;

import com.casting.models.User;
import com.casting.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

public class UserController {
    @Autowired
    UserRepository userRepository;

   @PostMapping("/users")
    public User createUser(@RequestBody User user){
        User newUser = new User();
        newUser.setEmail(user.getEmail());
        newUser.setFirstName(user.getFirstName());
        newUser.setLastName(user.getLastName());
        newUser.setPassword(user.getPassword());
        newUser.setId(user.getId());

        User savedUser =  userRepository.save(newUser);

        return savedUser;
    }

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


    @PutMapping("/users")
    public User updateUser(@RequestBody User user){
        User user1 =  new User(1,"nithyanand","nadar","demo@gmail.com","wthey");

        if(user.getFirstName()!=null){
            user1.setFirstName(user.getFirstName());
        }
        if(user.getLastName()!=null){
            user1.setLastName(user.getLastName());
        }
        if(user.getEmail()!=null){
            user1.setEmail(user.getEmail());
        }

        return user1;
    }
    @DeleteMapping("/users/{userId}")
    public String userDeleted(@PathVariable Integer userId){
        return "User Deleted with id "+  userId;
    }
}
