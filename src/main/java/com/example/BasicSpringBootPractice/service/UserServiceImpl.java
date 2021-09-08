package com.example.BasicSpringBootPractice.service;

import com.example.BasicSpringBootPractice.domain.Post;
import com.example.BasicSpringBootPractice.domain.User;
import com.example.BasicSpringBootPractice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public Optional<User> getUserById(long id) {
        return userRepository.findById(id);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<Post> findPosts(long id) {
        return userRepository.findPosts(id);
    }

    @Override
    public List<User> UserWithMorePosts() {
        return userRepository.UserWithMorePosts();
    }

    @Override
    public List<User> usersStartsWithB() {
        return userRepository.usersStartsWithB();
    }

    @Override
    public List<User> usersWithName(String name) {
        return userRepository.usersWithName(name);
    }
}
