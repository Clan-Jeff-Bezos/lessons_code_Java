package controller;

import entity.Student;
import model.StudentModel;

import javax.swing.*;
import java.io.ObjectStreamException;
import java.util.ArrayList;

public class StudentController {

    // Model attribute
    StudentModel objStudentModel;

    public StudentController(){
        // create instance of Student Model
        this.objStudentModel = new StudentModel();
    }

    public Object create(String name, int age){
        return this.objStudentModel.create(new Student(name, age));
    }

    public Object readById(int id){
        return this.objStudentModel.readById(id);
    }

    public void readAll(){
        ArrayList<Object> result = this.objStudentModel.readAll();
        JOptionPane.showMessageDialog(null, result.toString());
    }

    public Boolean delete(int id){
        return this.objStudentModel.delete(id);
    }

}
