package model;

import controller.StudentController;
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
        // Open connection
        Connection connection = ConfigDB.openConnection();

        Student student = null;

        try {
            // Create SQL
            String sqlQuery = "SELECT * FROM student WHERE id = ?;";

            // Prepared statement
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            // Assign to ?
            preparedStatement.setInt(1,id);

            // Execute
            preparedStatement.execute();

            ResultSet result = preparedStatement.getResultSet();

            while (result.next()){
                student = new Student(
                        result.getInt("id"),
                        result.getString("name"),
                        result.getInt("age")
                );
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        ConfigDB.closeConnection();
        return student;
    }

    @Override
    public ArrayList<Object> readAll() {
        // Open connection
        Connection connection = ConfigDB.openConnection();

        // Instance arrayList<Student>
        ArrayList<Object> students = new ArrayList<>();

        try {
            // Create SQL query
            String sqlQuery = "SELECT * FROM student;";

            // Create prepared Statement
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            // execute query
            preparedStatement.execute();

            // get result
            ResultSet result = preparedStatement.getResultSet();

            while (result.next()) {
                Student student = new Student(
                        result.getInt("id"),
                        result.getString("name"),
                        result.getInt("age")

                );

                students.add(student);
            }

            preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            ConfigDB.closeConnection();
        }

        return students;
    }

    @Override
    public Object update(Object object, int id) {
        return null;
    }

    @Override
    public Boolean delete(int id) {

        Connection connection = ConfigDB.openConnection();

        boolean flag;

        try {
            String sqlQuery = "DELETE * FROM student WHERE id = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setInt(1,id);

            flag = preparedStatement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return flag;
    }
}
