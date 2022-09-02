package com.company;

import model.User;
import service.impl.UserServiceImpl;


public class Main {
    public static void main(String[] args) {

        User user = new User(1, "Adyl", 23, "M");
        User user2 = new User(2, "Mariya", 19, "W");
        User user3 = new User(3, "Beka", 20, "M");


        UserServiceImpl service = new UserServiceImpl();
        service.userKoshuu(user);
        service.userKoshuu(user2);
        service.userKoshuu(user3);
        try {
            System.out.println("user c" + service.naityPoId(2));
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        System.out.println("все user'ы  ");
        service.user();
        System.out.println();

        service.udalitPoIt(3 );
        service.user();
    }
}