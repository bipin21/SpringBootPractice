package com.example.BasicSpringBootPractice.repository;

import com.example.BasicSpringBootPractice.domain.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

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
