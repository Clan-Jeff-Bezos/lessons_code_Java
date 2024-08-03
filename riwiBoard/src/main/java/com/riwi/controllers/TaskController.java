package com.riwi.controllers;

import com.riwi.entities.Task;
import com.riwi.models.TaskModelImpl;
import com.riwi.persistence.imodel.ITaskByIdModel;

public class TaskController {

    ITaskByIdModel taskModel = new TaskModelImpl();

    public Task create(Task request){
        return  taskModel.create(request);
    }

    public Task readById(Integer id){
        return taskModel.readByID(id);
    }
}
