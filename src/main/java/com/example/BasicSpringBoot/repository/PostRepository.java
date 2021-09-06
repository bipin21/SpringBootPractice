package com.example.BasicSpringBoot.repository;

import com.example.BasicSpringBoot.domain.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends CrudRepository<Post, Integer> {

    public List<Post> findAll();

    public Optional<Post> findById(int id);

    public Post save(Post post);

    public void deleteById(int id);

}
