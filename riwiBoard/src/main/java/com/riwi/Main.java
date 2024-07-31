package com.riwi;

import com.riwi.controllers.UserController;
import com.riwi.entities.UserEntity;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        UserController userController = new UserController();

        String id = JOptionPane.showInputDialog("insert to id");
        String name = JOptionPane.showInputDialog("insert to name");
        String email = JOptionPane.showInputDialog("insert to email");
        String password = JOptionPane.showInputDialog("insert to password");

        UserEntity user = new UserEntity(id,name,email,password);

        UserEntity user2 = userController.create(user);

        JOptionPane.showMessageDialog(null, user2);
    }
}