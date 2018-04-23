package com.codeup.blog.Services;


import com.codeup.blog.dao.PostRepository;
import com.codeup.blog.models.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    private PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post findPost(long id) {
        return postRepository.findOne(id);
    }

    public Post save(Post post) {
        return postRepository.save(post);
    }

    public Iterable<Post> findAll() {
        return postRepository.findAll();
    }

//
//    private List<Post> posts;
//
//    public PostService() {
//        this.posts = new ArrayList<>();
//        createAds();
//    }
//
//    public List<Post> getAllPosts() {
//        return posts;
//    }
//
//    public Post getPost(long id) {
//        return posts.get(((int) id) - 1);
//    }
//
//    public void createAds() {
//        this.save(new post("Test Title 1", "This is a test post description 1."));
//        this.save(new post("Test Title 2", "This is a test post description 2."));
//        this.save(new post("Test Title 3", "This is a test post description 3."));
//        this.save(new post("Test Title 4", "This is a test post description 4."));
//    }
//
//    public void save(post post){
//        post.setId(this.posts.size()+1);
//        this.posts.add(post);
//    }
}




