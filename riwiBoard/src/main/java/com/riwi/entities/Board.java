package com.riwi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Board {
    @Id
    private int id;
    private String title;
    private String description;
    private int userId;

    public Board() {
    }

    public Board(int id, String title, String description, int user_id) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.userId = user_id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getUserId() {
        return userId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return  "id: " + this.id +
                ", title: " + this.title +
                ", description: " + this.description +
                ", userId: " + userId;
    }
}
