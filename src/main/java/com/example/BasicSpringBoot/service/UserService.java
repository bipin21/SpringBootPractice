package com.example.BasicSpringBoot.service;

import com.example.BasicSpringBoot.domain.Post;
import com.example.BasicSpringBoot.domain.User;
import com.example.BasicSpringBoot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;


public interface UserService {

    public List<User> getAllUsers();

    public Optional<User> getUserById(long id);

    public User save(User user);

    public List<Post> findPosts(long id);

    public List<User> UserWithMorePosts();
}
