package com.example.BasicSpringBootPractice.service;

import com.example.BasicSpringBootPractice.domain.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {

    public List<Post> getAll();

    public Optional<Post> getById(int id);

    public Post save(Post post);

    public int deleteById(int id);

    public void delete(Post post);
}
