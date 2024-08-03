package com.riwi;

import com.riwi.controllers.TaskController;
import com.riwi.entities.Task;
import com.riwi.utils.enums.StatusTask;

import javax.swing.*;
import java.sql.Date;

public class MainDashboard {

    public static void menu(String name){

        TaskController taskController = new TaskController();

        String message = "Welcome "+ name +": \n" +
                    "1. Create Board \n" +
                    "2. Create Task \n" +
                    "3. help \n" +
                    "4. Logout \n" +
                    "Option:";

        String menu = JOptionPane.showInputDialog(message);

        switch (menu) {
            case "2" -> {
                String title = JOptionPane.showInputDialog("insert title");
                String description = JOptionPane.showInputDialog("insert description");
                StatusTask statusTask = (StatusTask) JOptionPane.showInputDialog(
                        null,
                        "Choose a Status:",
                        "",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        StatusTask.values(),
                        StatusTask.values()
                );

                Date date = Date.valueOf((JOptionPane.showInputDialog("insert due date")));
                int boardId = Integer.parseInt(JOptionPane.showInputDialog("insert board id"));
                int taskId = Integer.parseInt(JOptionPane.showInputDialog("insert task id"));

                Task task = new Task(
                        title,
                        description,
                        statusTask,
                        date,
                        boardId,
                        taskId
                );

                Task taskCreate = taskController.create(task);

                JOptionPane.showInputDialog(null, taskCreate);

            }
            case "4" -> JOptionPane.showMessageDialog(null, "See you later!");
        }

        if(!menu.equalsIgnoreCase("4")){
            MainDashboard.menu(name);
        }
    }
}
