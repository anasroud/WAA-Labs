package com.example.waacourselabs.service;

import com.example.waacourselabs.domain.Comment;
import com.example.waacourselabs.domain.Post;

import java.util.List;

public interface PostService {
    List<Post> getAllPosts();
    Post getPostById(long id);
    Boolean addPost(Post post);
    Boolean deletePost(long id);
    Boolean updatePost(long id, Post post);
    List<Comment> getAllComments(long id);
}
