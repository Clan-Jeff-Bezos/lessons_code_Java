package com.riwi.persistence.configDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConfig {

    private static Connection connection = null;

    public static Connection openConnection(){

        String URL = "jdbc:mysql://localhost:3306/riwiboarddb";
        String user = "root";
        String password = "0212";

        try {
            connection = DriverManager.getConnection(URL,user,password);

            System.out.println("Connection successful");
        } catch (SQLException error){
            throw new RuntimeException(error.getMessage());
        }

        return  connection;
    }

    public static void closeConnection(){

        if (connection != null){
            try {
                connection.close();

                System.out.println("Connection closed");
            } catch (SQLException error){
                throw new RuntimeException(error.getMessage());
            }
        }
    }
}
