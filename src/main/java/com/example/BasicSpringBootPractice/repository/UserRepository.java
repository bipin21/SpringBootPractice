package com.example.BasicSpringBootPractice.repository;

import com.example.BasicSpringBootPractice.domain.Post;
import com.example.BasicSpringBootPractice.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    @Query("select u.posts from User u where u.id = :id")
    public List<Post> findPosts(@Param("id") Long id);

    @Query("select u from User u where u.posts.size > 1")
    public List<User> UserWithMorePosts();

    @Query("select u from User u where u.name like 'B%'")
    public List<User> usersStartsWithB();

    @Query("select u from User u where lower(u.name) = lower(:name)")
    public List<User> usersWithName(String name);
}
