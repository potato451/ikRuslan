package ruslan.lesson8;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UserRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Controller cont = new Controller();
        while (true) {
            System.out.println("Choose");
            System.out.println("1 - singIn");
            System.out.println("2- reg");
            System.out.println("4 printAll");
            System.out.println("0 - Exit");
            int check = sc.nextInt();
            if (check == 1) {
                cont.singIn();
            } else if (check == 2) {
                cont.singUp();
            } else if (check == 3) {
                cont.printAll();
            } else if (check == 0) {
                break;
            }
        }
    }
}
