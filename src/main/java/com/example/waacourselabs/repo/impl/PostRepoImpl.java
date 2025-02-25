package com.example.waacourselabs.repo.impl;

import com.example.waacourselabs.domain.Post;
import com.example.waacourselabs.repo.PostRepo;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PostRepoImpl implements PostRepo {
    ArrayList<Post> posts = new ArrayList<>();

    public PostRepoImpl() {
        fetchTheData();
    }

    public void fetchTheData() {
        posts.add(new Post(1, "First Post", "This is the first post", "John Doe"));
        posts.add(new Post(2, "Second Post", "This is the second post", "Jane Doe"));
        posts.add(new Post(3, "Third Post", "This is the third post", "John Doe"));
        posts.add(new Post(4, "Fourth Post", "This is the fourth post", "Jane Doe"));
        posts.add(new Post(5, "Fifth Post", "This is the fifth post", "John Doe"));
        posts.add(new Post(6, "Sixth Post", "This is the sixth post", "Jane Doe"));
        posts.add(new Post(7, "Seventh Post", "This is the seventh post", "John Doe"));
        posts.add(new Post(8, "Eighth Post", "This is the eighth post", "Jane Doe"));
    }

    @Override
    public List<Post> getAllPosts() {
        return posts;
    }

    @Override
    public Post getPostById(int id) {
        return posts.stream().filter(post -> post.getId() == id).findFirst().orElse(null);
    }

    @Override
    public Boolean addPost(Post post) {
        return posts.add(post);
    }

    @Override
    public Boolean deletePost(int id) {
        return posts.removeIf(post -> post.getId() == id);
    }

    @Override
    public Boolean updatePost(int id, Post post) {
        for (int i = 0; i < posts.size(); i++) {
            if (posts.get(i).getId() == id) {
                posts.set(i, post);
                return true;
            }
        }
        return false;
    }
}
