package com.example.waacourselabs.repo;

import com.example.waacourselabs.domain.Post;

import java.util.List;

public interface PostRepo {
    List<Post> getAllPosts();
    Post getPostById(int id);
    Boolean addPost(Post post);
    Boolean deletePost(int id);
    Boolean updatePost(int id, Post post);
}
