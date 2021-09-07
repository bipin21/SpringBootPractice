package com.example.BasicSpringBoot.controller;

import com.example.BasicSpringBoot.domain.Post;
import com.example.BasicSpringBoot.domain.PostV2;
import com.example.BasicSpringBoot.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/posts")
@RestController
public class PostController {

    PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<Post> getAllPosts() {
        return postService.getAll();
    }

//    @GetMapping("/{id}")
//    public Optional<Post> getById(@PathVariable("id") int id) {
//        return postService.getById(id);
//    }

    @PostMapping
    public Post save(@RequestBody Post post) {
        return postService.save(post);
    }

    @PutMapping
    public Post update(@RequestBody Post post) {
        // crudRepository save works as save or update
        return postService.save(post);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        postService.deleteById(id);
        return null;
    }

    // get by Id with hateaos
    @GetMapping(value = "{id}", headers = "X-API-VERSION=1")
    protected EntityModel<Post> getById(@PathVariable("id") int id) {
        Post post = postService.getById(id).orElse(null);
        EntityModel<Post> resource = EntityModel.of(post);

        // save post link
        resource.add(WebMvcLinkBuilder.linkTo(
                WebMvcLinkBuilder.methodOn(this.getClass())
                        .save(post)).withRel("save-post"));

        // delete link
        resource.add(WebMvcLinkBuilder.linkTo(
                WebMvcLinkBuilder.methodOn(this.getClass())
                .delete(post.getId())).withRel("delete"));

        return resource;
    }


    // Versioning
    @GetMapping(value = "{id}", headers = "X-API-VERSION=2")
    protected PostV2 getById2(@PathVariable("id") int id) {
        PostV2 post = new PostV2(1, "Second", "second");
        return post;
    }


}
