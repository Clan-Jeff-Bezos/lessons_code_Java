package com.riwi.entities;

public class UserEntity {
    private String id;
    private String name;
    private String email;
    private String password;

    public UserEntity() {
    }

    public UserEntity(String id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return  "id: " + this.id +
                ", name: " + this.name +
                ", email: " + this.email +
                ", password: " + this.password + "\n";
    }
}
