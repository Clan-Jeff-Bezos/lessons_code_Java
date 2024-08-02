package com.riwi.models;

import com.riwi.entities.UserEntity;
import com.riwi.persistence.configDB.MysqlConfig;
import com.riwi.persistence.imodel.IUserModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<UserEntity> readAll(int size, int numberPage) {
        List<UserEntity> userEntities = new ArrayList<>();
        Connection connection = MysqlConfig.openConnection();

        try{
            String sql = "SELECT * FROM user LIMIT ? OFFSET ?; ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, size);
            preparedStatement.setInt(2, (numberPage-1)*size);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                UserEntity user = new UserEntity(
                        resultSet.getString("id"),
                        resultSet.getString("name"),
                        resultSet.getString("email"),
                        resultSet.getString("password")
                );
                userEntities.add(user);
            }
            preparedStatement.close();
            resultSet.close();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            MysqlConfig.closeConnection();
        }
        return userEntities;
    }
}
