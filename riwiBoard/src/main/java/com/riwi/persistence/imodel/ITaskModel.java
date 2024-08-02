package com.riwi.persistence.imodel;

import com.riwi.entities.Task;
import com.riwi.persistence.crud.CreateModel;
import com.riwi.persistence.crud.DeleteModel;
import com.riwi.persistence.crud.ReadModel;

public interface ITaskModel extends
        CreateModel<Task>,
        DeleteModel<Integer>,
        ReadModel<Integer, Task> {
}
