package ruslan.lesson8;

import java.util.ArrayList;

public class AllUsers {
    static ArrayList<String> users = new ArrayList<>();
    static ArrayList<String> passwords = new ArrayList<>();
    static int v = 0;


    private AllUsers() {

    }

    public static void addUsers(User user) {
        users.add(user.getName());
        passwords.add(user.getPassword());
        System.out.println(user.getName() + " Create!");
    }

    public static boolean checkUser(String name) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).equals(name)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkAccount(String name, String password) {
        boolean b = true;
        if (users.size() == 0) {
            b = false;
        } else {
            for (int c = 0; c < users.size(); c++) {
                if (users.get(c).equals(name) && passwords.get(c).equals(password)) {
                    b = true;
                    break;
                } else {
                    b = false;
                }
                v++;
            }
        }
        if (b == true) {
            return true;
        } else if (b == false) {
            return false;
        } else {
            return b;
        }
    }
}