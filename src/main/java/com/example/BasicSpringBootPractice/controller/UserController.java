package com.example.BasicSpringBootPractice.controller;

import com.example.BasicSpringBootPractice.domain.Post;
import com.example.BasicSpringBootPractice.domain.User;
import com.example.BasicSpringBootPractice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public Optional<User> getById(@PathVariable("id") long id){
        return userService.getUserById(id);
    }

    @PostMapping
    @PutMapping
    public User save(@RequestBody User user){
        return userService.save(user);
    }

    @GetMapping("/{id}/posts")
    public List<Post> UserPosts(@PathVariable("id") long id){
        return userService.findPosts(id);
    }

   // get users who have more than 1 posts
    @GetMapping("usersWithMoreThanOnePosts")
    public List<User> UserWithMorePosts(){
        return userService.UserWithMorePosts();
    }

    @GetMapping("usersStartsWithB")
    public List<User> usersStartsWithB(){
        return userService.usersStartsWithB();
    }

    @GetMapping("usersWithName")
    public List<User> usersWithName(@RequestParam("name") String name){
        return userService.usersWithName(name);
    }



}
