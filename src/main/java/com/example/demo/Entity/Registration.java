package com.example.demo.Entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collation = "registration")
public class Registration {
    @
    private String id;
    @Field
    private String name;
    @Field
    private String email;
    @Field
    private String mobile;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public Registration setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public Registration setEmail(String email) {
        this.email = email;
        return this;
    }

    public Registration setName(String name) {
        this.name = name;
        return this;
    }

    public String getId() {
        return id;
    }

    public Registration setId(String id) {
        this.id = id;
        return this;
    }
}
