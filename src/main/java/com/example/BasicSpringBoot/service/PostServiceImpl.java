package com.example.BasicSpringBoot.service;

import com.example.BasicSpringBoot.domain.Post;
import com.example.BasicSpringBoot.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    PostRepository postRepository;

    @Override
    public List<Post> getAll() {
        return postRepository.getAll();
    }

    @Override
    public Optional<Post> getById(int id) {
        return postRepository.getById(id);
    }
}
