package com.example.waacourselabs.controller;

import com.example.waacourselabs.domain.User;
import com.example.waacourselabs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public List<User> returnAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User returnUser(@PathVariable long id) {
        return userService.getUserById(id).orElse(null);
    }

    @PostMapping
    public Boolean addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @DeleteMapping("/{id}")
    public Boolean deleteUser(@PathVariable long id) {
        return userService.deleteUser(id);
    }

    @PutMapping("/{id}")
    public Boolean updateUser(@PathVariable long id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    // filter users depending on the number of posts using numberPosts parameter
    @GetMapping("/filter")
    public List<User> filterUsers(@RequestParam int numberPosts) {
        return userService.filterUsers(numberPosts);
    }

}
