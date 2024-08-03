package com.riwi;

import com.riwi.controllers.UserController;
import com.riwi.entities.UserEntity;

import javax.swing.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserController userController = new UserController();

        String menu;
        do {
            menu = JOptionPane.showInputDialog("""
                    Welcome to RiwiBoard: \n
                    1. Login \n
                    2. Register \n
                    3. List Users \n
                    4. Exit \n
                    Option:""");

            switch (menu){
                case "1" -> {

                    String email = JOptionPane.showInputDialog("Insert to email:");
                    UserEntity user = userController.readByEmail(email);

                    if(user.getId() == null){
                        JOptionPane.showMessageDialog(null,"404: Email not found");
                        break;
                    }

                    String password = JOptionPane.showInputDialog("Insert to password:");

                    if (!password.equals(user.getPassword())){
                        JOptionPane.showMessageDialog(null, "403: Credentials invalid");
                        break;
                    }

                    MainDashboard.menu(user.getName());

                }
                case "2" -> {

                    String id = JOptionPane.showInputDialog("Insert to document:");
                    String name = JOptionPane.showInputDialog("Insert to name:");
                    String email = JOptionPane.showInputDialog("Insert to email:");
                    String password = JOptionPane.showInputDialog("Insert to password:");

                    UserEntity userCreate = userController.create(new UserEntity(id,name,email,password));

                    JOptionPane.showMessageDialog(null, userCreate);
                }
                case "3" -> {
                    String pageSize = JOptionPane.showInputDialog("How many users per page?");
                    int numberPage = 1;

                    String confirm;
                    do {
                        List<UserEntity> userList = userController.readAll(Integer.parseInt(pageSize), numberPage);
                        if (userList.isEmpty()){
                            numberPage--; // not more info
                        }

                        confirm = JOptionPane.showInputDialog(null, "Page: "+ numberPage + "\n" + userList
                                + "\n" + "prev or next");

                        if (confirm.equalsIgnoreCase("prev")){
                            numberPage--;

                            if (numberPage<1){
                                numberPage = 1;
                            }
                        } else if (confirm.equalsIgnoreCase("next")) {
                            numberPage++;
                        }

                    }while(confirm.equalsIgnoreCase("next") || confirm.equalsIgnoreCase("prev"));
                }
                case "4" -> JOptionPane.showMessageDialog(null, "POWER OFF");
            }

        } while (!menu.equals("4"));

    }
}