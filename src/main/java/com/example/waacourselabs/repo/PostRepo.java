package com.example.waacourselabs.repo;

import com.example.waacourselabs.aspect.ExecutionTime;
import com.example.waacourselabs.domain.Comment;
import com.example.waacourselabs.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepo extends JpaRepository<Post, Long> {
    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);
    void deleteAllById(long id);
    List<Comment> findCommentsById(long id);
}
