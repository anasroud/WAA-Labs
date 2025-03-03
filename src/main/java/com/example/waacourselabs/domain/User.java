package com.example.waacourselabs.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
