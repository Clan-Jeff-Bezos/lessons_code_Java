package com.riwi.persistence.imodel;

import com.riwi.entities.UserEntity;
import com.riwi.persistence.crud.CreateModel;
import com.riwi.persistence.crud.DeleteModel;

public interface IUserModel
        extends CreateModel<UserEntity>,
                DeleteModel<String> {
}
