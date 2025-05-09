package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Иван", "Иванов", (byte) 30);
        userService.saveUser("Ольга", "Петрова", (byte) 25);
        userService.saveUser("Алексей", "Сидоров", (byte) 40);
        userService.saveUser("Мария", "Смирнова", (byte) 35);

        System.out.println("\nВсе пользователи:");
        userService.getAllUsers().forEach(System.out::println);

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
