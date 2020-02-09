package ruslan.lesson10.homework;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] atack = new String[3];
        String[] walk = new String[2];
        int ind[] = new int[3];
        int lind[] = new int[2];
        int chosen = 0;
        int i = 0;
        int tries = 3;
        while (tries != 0) {
            Wizard wiz = new Wizard("Ashot", 1, 2.0, 3.5, 130);
            Archer arch = new Archer("Mark", 1, 2.5, 3, 100);
            Voin voin = new Voin("Ilya", 1, 3.5, 2, 90);
            System.out.println("Choose your fighter:WIZARD(w),ARCHER(a),VOIN(v)");
            String a = sc.next();
            if (a.equals("w")) {
                chosen = 0;
            } else if (a.equals("a")) {
                chosen = 1;
            } else if (a.equals("v")) {
                chosen = 2;
            }
            wiz.textAtack(atack, walk);
            arch.textAtack(atack, walk);
            voin.textAtack(atack, walk);
            System.out.println(wiz.suma(lind, ind));
            System.out.println(arch.suma(lind, ind));
            System.out.println(voin.suma(lind, ind));
            if (wiz.suma(lind, ind) > arch.suma(lind, ind) && wiz.suma(lind, ind) > voin.suma(lind, ind)) {
                System.out.println("WIZARD");
                i = 0;
            } else if (wiz.suma(lind, ind) < arch.suma(lind, ind) && arch.suma(lind, ind) > voin.suma(lind, ind)) {
                System.out.println("ARCHER");
                i = 1;
            } else if (wiz.suma(lind, ind) < voin.suma(lind, ind) && arch.suma(lind, ind) < voin.suma(lind, ind)) {
                System.out.println("VOIN");
                i = 2;
            } else {
                System.out.println("DRAW");
            }
            if (chosen == i) {
                System.out.println("YOU WON!!!");
                System.out.println("Your got one mare time!");
                tries++;
            } else {
                System.out.println("YOU  LOST.HAHAHAHAHA!!!");
                tries--;
            }
        }
    }
}