package com.riwi.persistence.imodel;

import com.riwi.entities.Task;
import com.riwi.persistence.crud.CreateModel;
import com.riwi.persistence.crud.DeleteModel;
import com.riwi.persistence.crud.ReadByIdModel;

public interface ITaskByIdModel extends
        CreateModel<Task>,
        DeleteModel<Integer>,
        ReadByIdModel<Integer, Task> {
}
