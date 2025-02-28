package com.example.waacourselabs.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    @OneToMany(mappedBy = "author")
    List<Post> post;

    public User() {}

    public User(String name, List<Post> post) {
        this.name = name;
        this.post = post;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Post> getPost() {
        return post;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPost(List<Post> post) {
        this.post = post;
    }
}
