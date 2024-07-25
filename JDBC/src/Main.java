import controller.StudentController;
import persistence.ConfigDB;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        StudentController objStudentController = new StudentController();

        objStudentController.create();
    }
}