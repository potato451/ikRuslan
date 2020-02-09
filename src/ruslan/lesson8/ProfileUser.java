package ruslan.lesson8;

import com.sun.xml.internal.txw2.output.DumpSerializer;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Scanner;

public class ProfileUser {
    static ArrayList<User> infoUsers = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    void menuUser() {

        System.out.println("Choose");
        System.out.println("1 - info");
        System.out.println("2- interests");
        System.out.println("3 message");
        System.out.println("4- photos");
        System.out.println("5 - music");
        int check = sc.nextInt();
        if (check == 1) {
            InfoUser();
        } else if (check == 2) {
            System.out.println();
        } else if (check == 3) {
            System.out.println();
        } else if (check == 4) {
            System.out.println();
        } else if (check == 5) {
            System.out.println();
        } else {
            System.out.println("error");
        }
    }

    private void InfoUser() {
        if (infoUsers.size() == AllUsers.users.size()&&infoUsers.get(AllUsers.v).isF()==false) {
            setUser();
        }
        int i = AllUsers.v;
        System.out.println(infoUsers.get(i).getTrue_name());
        System.out.println(infoUsers.get(i).getLast_name());
        System.out.println(infoUsers.get(i).getBirthday());
        System.out.println(infoUsers.get(i).getClaver());
        System.out.println("change?,1(yes),2(no)");
        int n = sc.nextInt();
        if (n == 1) {
            changeInfo();
        }
        AllUsers.v = 0;
    }


    private User setUser() {
        User user = new User();
        System.out.println("name");
        infoUsers.set(AllUsers.v,user).setName(sc.next());
        System.out.println("last name");
        infoUsers.set(AllUsers.v,user).setLast_name(sc.next());
        System.out.println("birthday");
        infoUsers.set(AllUsers.v,user).setBirthday(sc.next());
        System.out.println("education");
        infoUsers.set(AllUsers.v,user).setClaver(sc.next());
        infoUsers.set(AllUsers.v,user).setF(true);
        return user;
    }


    private User changeInfo() {
        User user = new User();
        System.out.println("name");
        infoUsers.set(AllUsers.v, user).setTrue_name(sc.next());
        System.out.println("last name");
        infoUsers.set(AllUsers.v, user).setLast_name(sc.next());
        System.out.println("birthday");
        infoUsers.set(AllUsers.v, user).setBirthday(sc.next());
        System.out.println("claver");
        infoUsers.set(AllUsers.v, user).setClaver(sc.next());
        infoUsers.set(AllUsers.v,user).setF(true);
        return user;
    }
}

