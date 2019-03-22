package com.cf.demo.model;


import com.cf.demo.annotations.Name;

public class Person {

    private String id;
    @Name(value = "asdf", message = "The name should start with p I said")
    private String name;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
