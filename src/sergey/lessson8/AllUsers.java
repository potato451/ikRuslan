package sergey.lessson8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AllUsers {
    private AllUsers() {
    }

    static ArrayList<String> users = new ArrayList<>(Arrays.asList("admin"));
    static ArrayList<String> passwords = new ArrayList<>(Arrays.asList("admin"));




    public static void printUsers() {
        System.out.println("Все пользователи:");
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i) + " - " + passwords.get(i));
        }
    }

    public static void addUser(User user) {
        users.add(user.name);
        passwords.add(user.password);
        System.out.println("Пользователь " + user.name + " успешно добавлен");
        ProfileUsers.newUser();
    }

    public static boolean chekUserPassvord(String login, String password) {
        for (int i = 0; i < users.size(); i++) {
            if ((users.get(i).equals(login)) && (passwords.get(i).equals(password))) {
                return true;
            }
        }
        return false;
    }

    public static boolean chekUser(String login) {
        for (int i = 0; i < users.size(); i++) {
            if ((users.get(i).equals(login))) {
                return false;
            }
        }
        return true;
    }
}
