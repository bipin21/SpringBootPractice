package com.example.BasicSpringBoot.controller;

import com.example.BasicSpringBoot.domain.Post;
import com.example.BasicSpringBoot.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/posts")
@RestController
public class PostController {

    PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<Post> getAllPosts(){
        return  postService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Post> getById(@PathVariable("id") int id){
        return postService.getById(id);
    }

    @PostMapping
    public Post save(@RequestBody Post post){
        return postService.save(post);
    }

    @PutMapping
    public Post update(@RequestBody Post post){
        return postService.update(post);
    }

    @DeleteMapping("/{id}")
    public int delete(@PathVariable("id") int id){
       return postService.delete(id);
    }


}
