package com.example.waacourselabs.service;

import com.example.waacourselabs.domain.Post;
import com.example.waacourselabs.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();
    Optional<User> getUserById(long id);
    Boolean addUser(User user);
    Boolean deleteUser(long id);
    Boolean updateUser(long id, User user);
    User findByName(String name);
    Boolean existsByName(String name);
    User findByPost(Post post);
}
