import controller.StudentController;
import entity.Student;
import persistence.ConfigDB;

import javax.swing.*;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        StudentController objStudentController = new StudentController();

        String option ;

        do {
            option = JOptionPane.showInputDialog("" +
                    "Welcome to HIMALAYA \n" +
                    "Options: \n" +
                    "1. Create Student \n" +
                    "2. Show all Student \n" +
                    "3. Search Student by Id \n" +
                    "4. Delete Student by Id \n" +
                    "5. Exit \n" +
                    ":>");

            switch (option) {
                case "1" -> {
                    // Input of name
                    String name = JOptionPane.showInputDialog("Please insert to name");

                    // Input of age
                    int age = Integer.parseInt(JOptionPane.showInputDialog("Please insert to age"));

                    Object result = objStudentController.create(name, age);

                    JOptionPane.showMessageDialog(null, result.toString());
                }
                case "2" -> objStudentController.readAll();
                case "3" -> {
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Insert id"));
                    Object student = objStudentController.readById(id);
                    JOptionPane.showMessageDialog(null, student.toString());
                }
                case "4" -> {
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Insert id"));
                    boolean flag = objStudentController.delete(id);

                    if (flag){
                        JOptionPane.showMessageDialog(null, "Delete Student successful");
                    } else {
                        JOptionPane.showMessageDialog(null, "Delete Student failed");
                    }
                }
            }

        } while (!option.equals("5"));





    }
}