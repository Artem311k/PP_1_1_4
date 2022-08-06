package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("User name one", "User LatName one", (byte) 10);
        userService.saveUser("User name two", "User LatName two", (byte) 15);
        userService.saveUser("User name three", "User LatName three", (byte) 20);
        userService.saveUser("User name four", "User LatName four", (byte) 25);

        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
