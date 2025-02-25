package com.example.waacourselabs.controller;

import com.example.waacourselabs.domain.Post;
import com.example.waacourselabs.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    PostService postService;

    @GetMapping
    public List<Post> returnAll() {
        return postService.getAllPosts();
    }

    @GetMapping("/{id}")
    public Post returnPost(@PathVariable int id) {
        return postService.getPostById(id);
    }

    @PostMapping
    public Boolean addPost(@RequestBody Post post) {
        return postService.addPost(post);
    }

    @DeleteMapping("/{id}")
    public Boolean deletePost(@PathVariable int id) {
        return postService.deletePost(id);
    }

    @PutMapping("/{id}")
    public Boolean updatePost(@PathVariable int id, @RequestBody Post post) {
        return postService.updatePost(id, post);
    }
}
