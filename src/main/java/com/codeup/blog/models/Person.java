package com.codeup.blog.models;

import javax.persistence.*;

@Entity
@Table(name="people")
public class Person {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private int age;

    @Column (nullable = false, length = 150)
    private String name;


    @Column (nullable = false, length = 100)
    private String state_residing;

    public Person(int age, String name, String state_residing) {
        this.age = age;
        this.name = name;
        this.state_residing = state_residing;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState_residing() {
        return state_residing;
    }

    public void setState_residing(String state_residing) {
        this.state_residing = state_residing;
    }

}