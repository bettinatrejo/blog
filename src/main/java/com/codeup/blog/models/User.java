package com.codeup.blog.models;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "users")
public class User {


    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false, unique = true)
    private String email;


    @Column(nullable = false)
    private String password;


    public User(User copy) {
        this.id = copy.id;
        this.username = copy.username;
        this.email = copy.email;
        this.password = copy.password;
        }


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Post> posts;

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    this is useful to insert users
    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

//    to get a full user object
    public User(long id, String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.id = id;
    }

    public User() {
    }




}
