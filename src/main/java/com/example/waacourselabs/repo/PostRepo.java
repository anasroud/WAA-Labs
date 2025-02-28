package com.example.waacourselabs.repo;

import com.example.waacourselabs.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post, Long> {
    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);

    void deleteAllById(long id);
}
