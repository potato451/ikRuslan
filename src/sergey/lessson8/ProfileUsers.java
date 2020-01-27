package sergey.lessson8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ProfileUsers {
    static ArrayList<String> names = new ArrayList<>(Arrays.asList("Сергей"));
    static ArrayList<String> sureName = new ArrayList<>(Arrays.asList("Науменко"));
    static ArrayList<String> lastNames = new ArrayList<>(Arrays.asList("Николаевич"));
    static ArrayList<String> birthdays = new ArrayList<>(Arrays.asList("24.03.1993"));

    public static String getNames(String login) {
        return names.get(AllUsers.users.indexOf(login));
    }

    public static void setNames(String login) {
        Scanner scanner = new Scanner(System.in);
        int index = AllUsers.users.indexOf(login);
        names.set(index,scanner.next());
    }

    public static String getSureName(String login) {
        return sureName.get(AllUsers.users.indexOf(login));
    }

    public static void setSureName(String login) {
        Scanner scanner = new Scanner(System.in);
        int index = AllUsers.users.indexOf(login);
        sureName.set(index,scanner.next());
    }

    public static String getLastName(String login) {
        return lastNames.get(AllUsers.users.indexOf(login));
    }

    public static void setLastNames(String login) {
        Scanner scanner = new Scanner(System.in);
        int index = AllUsers.users.indexOf(login);
        lastNames.set(index,scanner.next());
    }

    public static String getBirthdays(String login) {
        return birthdays.get(AllUsers.users.indexOf(login));
    }

    public static void setBirthdays(String login) {
        Scanner scanner = new Scanner(System.in);
        int index = AllUsers.users.indexOf(login);
        birthdays.set(index,scanner.next());
    }

    public static void newUser(){
        names.add("");
        lastNames.add("");
        sureName.add("");
        birthdays.add("");
    }
}
