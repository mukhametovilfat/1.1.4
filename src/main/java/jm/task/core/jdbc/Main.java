package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Петя","Кузнецов",(byte) 18);
        userService.saveUser("Иван","Иванов",(byte) 20);
        userService.saveUser("Анна","Ивановна",(byte) 24);
        userService.saveUser("Алюша","Папович",(byte) 35);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
