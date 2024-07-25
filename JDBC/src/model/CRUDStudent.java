package model;

import entity.Student;

import java.util.ArrayList;

public interface CRUDStudent {
    public Student create(Student student);
    public Student readById(int id);
    public ArrayList<Student> readAll();
    public Student update(Student student, int id);
    public Boolean delete(int id);
}
