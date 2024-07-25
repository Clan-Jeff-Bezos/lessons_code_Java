package controller;

import entity.Student;
import model.StudentModel;

import javax.swing.*;

public class StudentController {

    // Model attribute
    StudentModel objStudentModel;

    public StudentController(){
        // create instance of Student Model
        this.objStudentModel = new StudentModel();
    }

    public void create(){
        // Create instance of Student
//        Student objStudent = new Student();

        // Input of name
        String name = JOptionPane.showInputDialog("Please insert to name");

        // Input of age
        int age = Integer.parseInt(JOptionPane.showInputDialog("Please insert to age"));

        Student objStudent = new Student(name, age);
//        objStudent.setName(name);
//        objStudent.setAge(age);

        Student result = (Student) this.objStudentModel.create(objStudent);

        JOptionPane.showMessageDialog(null, result.toString());
    }



}
