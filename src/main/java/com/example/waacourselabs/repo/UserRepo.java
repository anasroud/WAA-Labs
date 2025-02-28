package com.example.waacourselabs.repo;

import com.example.waacourselabs.domain.Post;
import com.example.waacourselabs.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByName(String name);
    Boolean existsByName(String name);
    User findByPost(List<Post> post);
}
