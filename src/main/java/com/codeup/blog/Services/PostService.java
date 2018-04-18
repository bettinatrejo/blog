package com.codeup.blog.Services;


import com.codeup.blog.models.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

// Create a PostService class and inject it into your posts controller.
// The service should keep an array list of posts internally,
// and have methods for:
//
//    finding a post (retrieving an individual post object)
//    retrieving all the posts

    private List<Post> posts;

    public PostService() {
        this.posts = new ArrayList<>();
        createPosts();

    }

    public Post findPost(long id) {
        return posts.get(((int) id) - 1);
    }

    public List<Post> findAll() {
        return posts;
    }

    public void createPosts() {
        this.save(new Post("Test Title 1", "Description 1"));
        this.save(new Post("Test Title 2", "Description 2"));

    }


    public Post save(Post post) {
        post.setId(this.posts.size() + 1);
        posts.add(post);
        return post;
    }



}
