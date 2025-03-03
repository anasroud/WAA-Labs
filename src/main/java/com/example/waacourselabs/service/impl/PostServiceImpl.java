package com.example.waacourselabs.service.impl;

import com.example.waacourselabs.domain.Comment;
import com.example.waacourselabs.domain.Post;
import com.example.waacourselabs.repo.PostRepo;
import com.example.waacourselabs.service.PostService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PostServiceImpl implements PostService {
    PostRepo postRepo;

    public PostServiceImpl(PostRepo postRepo) {
        this.postRepo = postRepo;
    }

    @Override
    public List<Post> getAllPosts() {
        // find all with just the author id not the auther object
        return postRepo.findAll();
    }

    @Override
    public Post getPostById(long id) {
        return postRepo.findById(id);
    }

    @Override
    public Boolean addPost(Post post) {
        postRepo.save(post);
        return true;
    }

    @Override
    public Boolean deletePost(long id) {
        postRepo.deleteAllById(id);
        return true;
    }

    @Override
    public Boolean updatePost(long id, Post post) {
        Post existingPost = postRepo.findById(id);
        if (existingPost == null) {
            return false;
        }
        post.setId(id);
        postRepo.save(post);
        return true;
    }

    @Override
    public List<Comment> getAllComments(long id) {
        return postRepo.findCommentsById(id);
    }
}
