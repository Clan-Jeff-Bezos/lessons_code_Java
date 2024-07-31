package com.riwi.entities;

import com.riwi.utils.enums.StatusTask;

import java.time.LocalDate;

public class Task {
    private int id;
    private String title;
    private String description;
    private StatusTask status;
    private LocalDate dueDate;
    private int boardId;
    private int taskId;

    public Task() {
    }

    public Task(int id, String title, String description, StatusTask status, LocalDate dueDate, int boardId, int taskId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.dueDate = dueDate;
        this.boardId = boardId;
        this.taskId = taskId;
    }
}
