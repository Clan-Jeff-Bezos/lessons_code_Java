package com.riwi;

import com.riwi.controllers.UserController;
import com.riwi.entities.UserEntity;

import javax.swing.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserController userController = new UserController();

        boolean isMenuOpened = true;
        while(isMenuOpened) {
            String option = JOptionPane.showInputDialog("Ingresa la op");
            switch (option) {
                case "0" -> isMenuOpened = false;
                case "2" -> {
                    JOptionPane.showMessageDialog(null, "Leyendo los usuarios");
                    String pageSize = JOptionPane.showInputDialog("Ingresa cuantos quieres ver por pagina: ");
                    int numberPage = 1;

                    String confirm;
                    do {
                        List<UserEntity> userList = userController.readAll(Integer.parseInt(pageSize), numberPage);
                        if (userList.isEmpty()){
                            JOptionPane.showMessageDialog(null, "No hay más paginas");
                            break;
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
            }
        }
    }
}