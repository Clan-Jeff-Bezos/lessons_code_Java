package com.riwi.models;

import com.riwi.entities.UserEntity;
import com.riwi.persistence.configDB.MysqlConfig;
import com.riwi.persistence.imodel.IUserModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserModelImpl implements IUserModel {
    @Override
    public UserEntity create(UserEntity request) {
        Connection connection = MysqlConfig.openConnection();

        String slqQuery = "INSERT INTO user(id,name,email,password) values(?,?,?,?);";

        UserEntity user = new UserEntity();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(slqQuery);

            preparedStatement.setString(1,request.getId());
            preparedStatement.setString(2,request.getName());
            preparedStatement.setString(3,request.getEmail());
            preparedStatement.setString(4,request.getPassword());

            int rowAffected = preparedStatement.executeUpdate();

            if(rowAffected == 1){
                return request;
            }

            preparedStatement.close();
        } catch (SQLException error){
            throw new RuntimeException(error.getMessage());
        } finally {
            MysqlConfig.closeConnection();
        }

        return user;
    }

    @Override
    public void delete(String id) {

    }
}
