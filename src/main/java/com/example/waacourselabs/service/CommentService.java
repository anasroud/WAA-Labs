package com.example.waacourselabs.service;

import com.example.waacourselabs.domain.Comment;

public interface CommentService {
    Comment getCommentById(long id);
    Boolean addComment(Comment comment);
    Boolean deleteComment(long id);
    Boolean updateComment(long id, Comment comment);
}
