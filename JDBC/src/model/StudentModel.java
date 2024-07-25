package model;

import entity.Student;
import persistence.ConfigDB;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentModel implements CRUDGeneric {
    @Override
    public Object create(Object object) {
        // Open connection
        Connection connection = ConfigDB.openConnection();

        // Transform object
        Student student = (Student) object;

        try {
            // Create SQL query
            String sqlQuery = "INSERT INTO student(name,age) VALUES(?,?);";

            // Create prepared Statement
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery, PreparedStatement.RETURN_GENERATED_KEYS);

            // assign to ?
            preparedStatement.setString(1, student.getName());
            preparedStatement.setInt(2,student.getAge());

            // execute query
            preparedStatement.execute();

            // get result
            ResultSet result = preparedStatement.getGeneratedKeys();

            while (result.next()){
                student.setId(result.getInt(1));
            }

            preparedStatement.close();

            JOptionPane.showMessageDialog(null,"the creation was successful");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        ConfigDB.closeConnection();
        return student;
    }

    @Override
    public Object readById(int id) {
        return null;
    }

    @Override
    public ArrayList<Object> readAll() {
        return null;
    }

    @Override
    public Object update(Object object, int id) {
        return null;
    }

    @Override
    public Boolean delete(int id) {
        return null;
    }
}
