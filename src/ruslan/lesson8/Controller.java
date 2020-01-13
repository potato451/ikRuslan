package ruslan.lesson8;

import java.util.List;
import java.util.Scanner;

public class Controller {
    Scanner sc = new Scanner(System.in);

    public void singIn() {

    }

    public void singUp() {
        System.out.println("login");
        String log = sc.next();
        System.out.println("password");
        String pas = sc.next();
        if (AllUsers.checkUser(log)) {
            User user = new User(log, pas);
            AllUsers.addUsers(user);
        } else
            System.out.println("error");
    }

    public void printAll() {
        for (int i = 0; i < AllUsers.users.size(); i++) {
            System.out.println(AllUsers.users.get(i) + "--" + AllUsers.passwords.get(i));
        }
    }
}
