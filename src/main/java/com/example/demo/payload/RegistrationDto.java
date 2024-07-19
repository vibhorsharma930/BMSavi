package com.example.demo.payload;

public class RegistrationDto {

private String id;
private String  name;

private String email;
private String mobile;

    public String getName() {
        return name;
    }

    public RegistrationDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getMobile() {
        return mobile;
    }

    public RegistrationDto setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public RegistrationDto setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getId() {
        return id;
    }

    public RegistrationDto setId(String id) {
        this.id = id;
        return this;
    }
}
