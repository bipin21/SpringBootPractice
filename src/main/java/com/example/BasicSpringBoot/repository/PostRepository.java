package com.example.BasicSpringBoot.repository;

import com.example.BasicSpringBoot.domain.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {

    /**
     * This default function is given by crudRepository so not required anymore
     */
//    public List<Post> findAll();
//
//    public Optional<Post> findById(int id);
//
//    public Post save(Post post);
//
//    public void deleteById(int id);

}
