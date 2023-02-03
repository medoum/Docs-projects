package com.user.demo.Controller;

import com.user.demo.Entities.User;
import com.user.demo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/{userId}")
    public User getUserById(@PathVariable long userId){
        return userService.getUserById(userId);
    }


    @PostMapping("/newUser")
    public User AddUser(@RequestBody User newUser){
        return userService.addNewUser(newUser);
    }
}
