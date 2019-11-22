package ruslan.lesson2;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("введите число и месяц 2018 года:");
            int a = sc.nextInt();
            System.out.println("месяц");
            int b = sc.nextInt();
            int a1 = 31;
            int a2 = 28;
            int a3 = 31;
            int a4 = 30;
            int a5 = 31;
            int a6 = 30;
            int a7 = 31;
            int a8 = 31;
            int a9 = 30;
            int a10 = 31;
            int a11 = 30;
            int a12 = 31;
            switch (b) {
                case 1:
                    System.out.println(a + 31 - a1);
                    break;
                case 2:
                    System.out.println(a + 28 - a2 + a1);
                    break;
                case 3:
                    System.out.println(a + 31 - a3 + a1 + a2);
                    break;
                case 4:
                    System.out.println(a + 30 - a4 + a1 + a2 + a3 );
                    break;
                case 5:
                    System.out.println(a + 31 - a5 + a4 + a1 + a2 + a3);
                    break;
                case 6:
                    System.out.println(a + 30 - a6 + a5 + a4 + a1 + a2 + a3);
                    break;
                case 7:
                    System.out.println(a + 31 - a7 + a6 + a5 + a4 + a1 + a2 + a3);
                    break;
                case 8:
                    System.out.println(a + 31 - a8 + a7 + a6 + a5 + a4 + a1 + a2 + a3);
                    break;
                case 9:
                    System.out.println(a + 30 - a9 +  a8 + a7 + a6 + a5 + a4 + a1 + a2 + a3);
                    break;
                case 10:
                    System.out.println(a + 31 - a10+a9 +  a8 + a7 + a6 + a5 + a4 + a1 + a2 + a3);
                    break;
                case 11:
                    System.out.println(a + 30 - a11+a10+a9 +  a8 + a7 + a6 + a5 + a4 + a1 + a2 + a3);
                    break;
                case 12:
                    System.out.println(a + 31 - a12 + a11+a10+a9 +  a8 + a7 + a6 + a5 + a4 + a1 + a2 + a3);
                    break;
                default:
                    System.out.println("error");
            }

        }

    }
}
