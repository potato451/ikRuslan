package sergey.lessson8;

import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);




    boolean flag = false;
    String currentUser;
    User userCurret;

    public void signUp() {
        if (!flag) {
            System.out.println("Введите логин");
            String login = scanner.next();
            System.out.println("Введите пароль");
            String password = scanner.next();
            if (AllUsers.chekUser(login)) {
                User user = new User(login, password);
                AllUsers.addUser(user);
                userCurret = user;
            } else
                System.out.println("Пользователь " + login + " уже есть");
        } else
            System.out.println("Для того чтобы добавть пользоватея, сначала нужно выйти");
    }

    public void SignIn() {
        if (!flag) {
            System.out.println("Введите логин");
            String login = scanner.next();
            System.out.println("Введите пароль");
            String password = scanner.next();
            if (AllUsers.chekUserPassvord(login, password)) {
                System.out.println("Velcome, " + login);
                currentUser = login;
                flag = true;
                profile();
//                profile2(userCurret);
            } else
                System.out.println("Неверное имя пользователя или пароль!!!");
        } else
            System.out.println("Для того чтобы войти, сначала нужно выйти");
    }

    public void profile() {
        System.out.println("----Профиль " + currentUser + "-----");
        System.out.println("Имя: " + ProfileUsers.getNames(currentUser));
        System.out.println("Фамилия: " + ProfileUsers.getSureName(currentUser));
        System.out.println("Отчество: " + ProfileUsers.getLastName(currentUser));
        System.out.println("Дата рождения: " + ProfileUsers.getBirthdays(currentUser));
        System.out.println("----------------------------------");
        System.out.println("1 -- Редактировать профиль");
        System.out.println("2 -- Выйти из профиль");
        System.out.println("3 -- Выйти из" + currentUser);
        int answer = scanner.nextInt();
        if (answer == 1) {
            updateProfile();
        } else if (answer == 2) {
            System.out.println("Выход из профиля осуществлен");
        } else if (answer == 3) {
            exit();
        }

    }

    public void profile2(User user) {
        System.out.println("----Профиль " + userCurret.getName() + "-----");
        System.out.println("Имя: " + user.getTrueName());
        System.out.println("Фамилия: " + user.getSureName());
        System.out.println("Отчество: " + user.getLastName());
        System.out.println("Дата рождения: " + user.getBirthday());
        System.out.println("----------------------------------");
        System.out.println("1 -- Редактировать профиль");
        System.out.println("2 -- Выйти из профиль");
        System.out.println("3 -- Выйти из" + userCurret.getName());
        int answer = scanner.nextInt();
        if (answer == 1) {
            updateProfile();
//            updateProfile2(user);
        } else if (answer == 2) {
            System.out.println("Выход из профиля осуществлен");
        } else if (answer == 3) {
            exit();
        }

    }

    private void updateProfile() {
        System.out.println("Введите новое имя");
        ProfileUsers.setNames(currentUser);
        System.out.println("Введите новую фамилию");
        ProfileUsers.setSureName(currentUser);
        System.out.println("Введите новое отчество");
        ProfileUsers.setLastNames(currentUser);
        System.out.println("Введите дату рождения");
        ProfileUsers.setBirthdays(currentUser);
    }

    private void updateProfile2(User user) {
        System.out.println("Введите новое имя");
        user.setTrueName(scanner.next());
        System.out.println("Введите новую фамилию");
        user.setSureName(scanner.next());
        System.out.println("Введите новое отчество");
        user.setLastName(scanner.next());
        System.out.println("Введите дату рождения");
        user.setBirthday(scanner.next());
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
        } else
            System.out.println("Перед выходом нужно войти в учетку");
    }
}
