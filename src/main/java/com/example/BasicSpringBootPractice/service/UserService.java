package com.example.BasicSpringBootPractice.service;

import com.example.BasicSpringBootPractice.domain.Post;
import com.example.BasicSpringBootPractice.domain.User;

import java.util.List;
import java.util.Optional;


public interface UserService {

    public List<User> getAllUsers();

    public Optional<User> getUserById(long id);

    public User save(User user);

    public List<Post> findPosts(long id);

    public List<User> UserWithMorePosts();

    public List<User> usersStartsWithB();

    public List<User> usersWithName(String name);
}
