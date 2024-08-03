package com.riwi.models;

import com.riwi.entities.Task;
import com.riwi.persistence.configDB.MysqlConfig;
import com.riwi.persistence.imodel.ITaskByIdModel;
import com.riwi.utils.enums.StatusTask;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TaskModelImpl implements ITaskByIdModel {
    @Override
    public Task create(Task request) {
        Task task = new Task();
        try {
            Connection connection = MysqlConfig.openConnection();

            String sqlQuery = "INSERT INTO task (title, description, status, due_date, board_id, task_id) values(?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery, PreparedStatement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, request.getTitle());
            preparedStatement.setString(2, request.getDescription());
            preparedStatement.setString(3, request.getStatus().name());
            preparedStatement.setDate(4,request.getDueDate());
            preparedStatement.setInt(5, request.getBoardId());
            preparedStatement.setInt(6,request.getTaskId());

            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getGeneratedKeys();

            if (resultSet.next()){
                task = request;
                task.setId(resultSet.getInt(1));
            }

            preparedStatement.close();

        } catch (SQLException error){
            throw new RuntimeException(error.getMessage());
        } finally {
            MysqlConfig.closeConnection();
        }

        return task;
    }

    @Override
    public void delete(Integer integer) {
    }

    @Override
    public Task readByID(Integer id) {

        Connection connection = MysqlConfig.openConnection();

        Task task = new Task();

        try {
            String sqlQuery = "SELECT * FROM student WHERE id = ?;";

            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setInt(1, id);

            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getResultSet();

            while (resultSet.next()){
                task = new Task(
                        resultSet.getInt("id"),
                        resultSet.getString("title"),
                        resultSet.getString("description"),
                        StatusTask.valueOf(resultSet.getString("status")),
                        resultSet.getDate("due_date"),
                        resultSet.getInt("board_id"),
                        resultSet.getInt("task_id")
                );
            }

            preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MysqlConfig.closeConnection();
        }

        return task;
    }
}
