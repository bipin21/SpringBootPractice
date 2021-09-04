package com.example.BasicSpringBoot.repository;

import com.example.BasicSpringBoot.domain.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class PostRepositoryImpl implements PostRepository {

    List<Post> posts = new ArrayList<>(Arrays.asList(
            new Post(1, "Bitcoin", "digital cryptocurrency", "Elon Musk"),
            new Post(2, "Momo", "very tasty", "Bipin")
    ));

    @Override
    public List<Post> getAll() {
        return posts;
    }

    @Override
    public Optional<Post> getById(int id) {
        return posts.stream().filter((p -> p.getId() == id)).findFirst();
    }
}
