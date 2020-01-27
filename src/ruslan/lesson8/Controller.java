package ruslan.lesson8;

import java.util.List;
import java.util.Scanner;

public class Controller {
    boolean b =false;
    String use="no";
    Scanner sc = new Scanner(System.in);

    public void singIn() {
        System.out.println("login");
        String logi =sc.next();
        System.out.println("password");
        String pass =sc.next();
        if (AllUsers.checkAccount(logi,pass) ==true & b==false){
            b=true;
            System.out.println("You are just singIn");
            use =logi;
            ProfileUser profileUser =  new ProfileUser();
            profileUser.menuUser();
        }else{
            System.out.println("Wrong login or password");
        }

    }

    public void singUp() {
        System.out.println("login");
        String log = sc.next();
        System.out.println("password");
        String pas = sc.next();
        if (AllUsers.checkUser(log) && b==false) {
            User user = new User(log, pas);
            AllUsers.addUsers(user);
            ProfileUser.infoUsers.add(user);
        } else
            System.out.println("error");
    }

    public void printAll() {
        for (int i = 0; i < AllUsers.users.size(); i++) {
            System.out.println(AllUsers.users.get(i) + "--" + AllUsers.passwords.get(i));
        }
    }

    public void exit() {
        if (b==true){
            System.out.println("Bye " + use);
            b=false;
            use ="no";
        }else{
            System.out.println("first singIn");
        }
    }
}
