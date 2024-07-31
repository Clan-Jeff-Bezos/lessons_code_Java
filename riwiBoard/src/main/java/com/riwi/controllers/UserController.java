package com.riwi.controllers;

import com.riwi.entities.UserEntity;
import com.riwi.models.UserModelImpl;
import com.riwi.persistence.imodel.IUserModel;

public class UserController {
    IUserModel userModel = new UserModelImpl();

    public UserEntity create(UserEntity request){
        return this.userModel.create(request);
    }
}
