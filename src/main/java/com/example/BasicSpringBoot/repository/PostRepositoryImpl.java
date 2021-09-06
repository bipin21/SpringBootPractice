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

    @Override
    public Post save(Post post) {
        posts.add(post);
        return post;
    }

    @Override
    public Post update(Post post) {
        int count = posts.size();
        int id = post.getId();
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                Post oldPost = posts.get(i);
                if (oldPost.getId() == id) {
                    posts.set(i, post);
                    return post;
                }

            }
        }

        return null;
    }

    @Override
    public int delete(int id) {
        Optional<Post> postFind = getById(id);
        if (postFind.isEmpty()) {
            return 0;
        }
//        boolean remove = posts.remove(postFind);
        boolean remove = posts.removeIf( p -> p.getId() == id);
        return remove ? 1 : 0;

    }


}
