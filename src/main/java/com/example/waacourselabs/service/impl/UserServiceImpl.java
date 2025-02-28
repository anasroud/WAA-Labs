package com.example.waacourselabs.service.impl;

import com.example.waacourselabs.domain.Post;
import com.example.waacourselabs.domain.User;
import com.example.waacourselabs.repo.UserRepo;
import com.example.waacourselabs.service.UserService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    UserRepo userRepo;

    UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public List<User> getAllUsers() {
        return this.userRepo.findAll();
    }

    @Override
    public Optional<User> getUserById(long id) {
        return userRepo.findById(id);
    }

    @Override
    public Boolean addUser(User user) {
        this.userRepo.save(user);
        return true;
    }

    @Override
    public Boolean deleteUser(long id) {
        this.userRepo.deleteAllById(Collections.singleton(id));
        return true;
    }

    @Override
    public Boolean updateUser(long id, User user) {
        user.setId(id);
        this.userRepo.save(user);
        return true;
    }

    @Override
    public User findByName(String name) {
        return this.userRepo.findByName(name);
    }

    @Override
    public Boolean existsByName(String name) {
        return this.userRepo.existsByName(name);
    }

    @Override
    public User findByPost(Post post) {
        return this.userRepo.findByPost(Collections.singletonList(post));
    }
}
