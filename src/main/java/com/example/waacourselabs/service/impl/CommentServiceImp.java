package com.example.waacourselabs.service.impl;

import com.example.waacourselabs.domain.Comment;
import com.example.waacourselabs.repo.CommentRepo;
import com.example.waacourselabs.service.CommentService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CommentServiceImp implements CommentService {
    CommentRepo commentRepo;

    public CommentServiceImp(CommentRepo commentRepo) {
        this.commentRepo = commentRepo;
    }

    @Override
    public Comment getCommentById(long id) {
        return commentRepo.findById(id);
    }

    @Override
    public Boolean addComment(Comment comment) {
        commentRepo.save(comment);
        return true;
    }

    @Override
    public Boolean deleteComment(long id) {
        commentRepo.deleteById(id);
        return true;
    }

    @Override
    public Boolean updateComment(long id, Comment comment) {
        Comment existingComment = commentRepo.findById(id);
        if (existingComment == null) {
            return false;
        }
        comment.setId(id);
        commentRepo.save(comment);
        return true;
    }


}
