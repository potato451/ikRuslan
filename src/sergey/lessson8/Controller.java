package sergey.lessson8;

import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);

    boolean flag = false;
    String currentUser;

    public void signUp() {
        System.out.println("Введите логин");
        String login = scanner.next();
        System.out.println("Введите пароль");
        String password = scanner.next();
        if (AllUsers.chekUser(login)) {
            User user = new User(login, password);
            AllUsers.addUser(user);
        } else
            System.out.println("Пользователь " + login + " уже есть");
    }

    public void SignIn() {
        System.out.println("Введите логин");
        String login = scanner.next();
        System.out.println("Введите пароль");
        String password = scanner.next();
        if (AllUsers.chekUserPassvord(login, password)) {
            System.out.println("Velcome, " + login);
            currentUser = login;
            flag = true;
        } else
            System.out.println("Неверное имя пользователя или пароль!!!");
    }

    public void error() {
        System.out.println("такого варианта не было");
    }

    public void printAllUsers() {
        AllUsers.printUsers();
    }

    public void exit() {
        if (flag) {
            System.out.println("Выход из " + currentUser + " выполнен");
            flag = false;
        }
        else
            System.out.println("Перед выходом нужно войти в учетку");
    }
}
