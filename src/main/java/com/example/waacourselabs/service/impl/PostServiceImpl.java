package com.example.waacourselabs.service.impl;

import com.example.waacourselabs.domain.Post;
import com.example.waacourselabs.repo.PostRepo;
import com.example.waacourselabs.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostRepo postRepo;

    @Override
    public List<Post> getAllPosts() {
        return postRepo.getAllPosts();
    }

    @Override
    public Post getPostById(int id) {
        return postRepo.getPostById(id);
    }

    @Override
    public Boolean addPost(Post post) {
        return postRepo.addPost(post);
    }

    @Override
    public Boolean deletePost(int id) {
        return postRepo.deletePost(id);
    }

    @Override
    public Boolean updatePost(int id, Post post) {
        return postRepo.updatePost(id, post);
    }
}
