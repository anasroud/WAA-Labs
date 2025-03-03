package com.example.waacourselabs.repo;

import com.example.waacourselabs.aspect.ExecutionTime;
import com.example.waacourselabs.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CommentRepo extends JpaRepository<Comment, Long> {
    @ExecutionTime
    Comment findById(long id);
    @ExecutionTime
    Comment save(Comment comment);
    @ExecutionTime
    void deleteById(long id);
}
