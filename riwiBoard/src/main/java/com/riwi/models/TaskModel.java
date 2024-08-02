package com.riwi.models;

import com.riwi.entities.Task;
import com.riwi.persistence.imodel.ITaskModel;

public class TaskModel implements ITaskModel {
    @Override
    public Task create(Task request) {
        return null;
    }

    @Override
    public void delete(Integer integer) {
    }

    @Override
    public Task readByID(Integer integer) {
        return null;
    }
}
