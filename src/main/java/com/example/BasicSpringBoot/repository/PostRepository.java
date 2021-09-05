package com.example.BasicSpringBoot.repository;

import com.example.BasicSpringBoot.domain.Post;

import java.util.List;
import java.util.Optional;

public interface PostRepository {

    public List<Post> getAll();

    public Optional<Post> getById(int id);
    
    public Post save(Post post);

    public Post update(Post post);

    public int delete(int id);

}
