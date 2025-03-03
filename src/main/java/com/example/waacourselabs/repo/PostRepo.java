package com.example.waacourselabs.repo;

import com.example.waacourselabs.aspect.ExecutionTime;
import com.example.waacourselabs.domain.Comment;
import com.example.waacourselabs.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepo extends JpaRepository<Post, Long> {
    @ExecutionTime
    List<Post> findAll();
    @ExecutionTime
    Post findById(long id);
    @ExecutionTime
    Post save(Post post);
    @ExecutionTime
    void deleteAllById(long id);
    @ExecutionTime
    List<Comment> findCommentsById(long id);
}
