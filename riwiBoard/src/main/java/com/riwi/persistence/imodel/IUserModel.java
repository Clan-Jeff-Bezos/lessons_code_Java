package com.riwi.persistence.imodel;

import com.riwi.entities.UserEntity;
import com.riwi.persistence.crud.CreateModel;
import com.riwi.persistence.crud.ReadAllModel;

public interface IUserModel
        extends CreateModel<UserEntity>,
        ReadAllModel<UserEntity> {

    public UserEntity readByEmail(String email);
}
