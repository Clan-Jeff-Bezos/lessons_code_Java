package com.riwi.controllers;

import com.riwi.entities.UserEntity;
import com.riwi.models.UserModelImpl;
import com.riwi.persistence.imodel.IUserModel;

import java.util.List;

public class UserController {
    IUserModel userModel = new UserModelImpl();

    public UserEntity create(UserEntity request){
        return this.userModel.create(request);
    }

    public List<UserEntity> readAll(int size, int numberPage) {
        return this.userModel.readAll(size, numberPage);
    }
}
