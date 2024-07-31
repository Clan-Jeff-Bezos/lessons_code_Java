package com.riwi.persistence.imodel;

import com.riwi.entities.Task;
import com.riwi.persistence.crud.CreateModel;
import com.riwi.persistence.crud.DeleteModel;

public interface ITaskModel extends
        CreateModel<Task>,
        DeleteModel<Integer> {
}
