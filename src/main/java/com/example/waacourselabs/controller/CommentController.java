package com.example.waacourselabs.controller;

import com.example.waacourselabs.domain.Comment;
import com.example.waacourselabs.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comments")
public class CommentController {
    @Autowired
    CommentService commentService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Comment getCommentById(long id) {
        return commentService.getCommentById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Boolean addComment(Comment comment) {
        return commentService.addComment(comment);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Boolean deleteComment(@PathVariable long id) {
        return commentService.deleteComment(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Boolean updateComment(@PathVariable long id, @RequestBody Comment comment) {
        return commentService.updateComment(id, comment);
    }
}
