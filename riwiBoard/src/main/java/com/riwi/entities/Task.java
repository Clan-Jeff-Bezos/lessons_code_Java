package com.riwi.entities;

import com.riwi.utils.enums.StatusTask;

import java.sql.Date;
import java.time.LocalDate;

public class Task {
    private int id;
    private String title;
    private String description;
    private StatusTask status;
    private Date dueDate;
    private Integer boardId;
    private Integer taskId;

    public Task() {
    }

    public Task(String title, String description, StatusTask status, Date dueDate, Integer boardId, Integer taskId) {
        this.title = title;
        this.description = description;
        this.status = status;
        this.dueDate = dueDate;
        this.boardId = boardId;
        this.taskId = taskId;
    }

    public Task(int id, String title, String description, StatusTask status, Date dueDate, int boardId, int taskId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.dueDate = dueDate;
        this.boardId = boardId;
        this.taskId = taskId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public StatusTask getStatus() {
        return status;
    }

    public void setStatus(StatusTask status) {
        this.status = status;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }
}
