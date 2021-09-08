package com.example.BasicSpringBootPractice.service;

import com.example.BasicSpringBootPractice.domain.Post;
import com.example.BasicSpringBootPractice.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PostServiceImpl implements PostService {

    @Autowired
    PostRepository postRepository;

    @Override
    public List<Post> getAll() {
        return (List<Post>) postRepository.findAll();
    }

    @Override
    public Optional<Post> getById(int id) {
        return postRepository.findById(id);
    }

    @Override
    public Post save(Post post) {
        return postRepository.save(post);
    }

    @Override
    public int deleteById(int id) {
        postRepository.deleteById(id);
        return 1;
    }

    @Override
    public void delete(Post post) {
        postRepository.delete(post);
    }
}
