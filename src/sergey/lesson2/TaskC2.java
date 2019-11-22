package sergey.lesson2;

import java.util.Scanner;

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
public class TaskC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int mounth = scanner.nextInt();
        int day = 0;
        for (int i = 0; i < mounth; i++) {
            switch (i){
                case 1:day+=31;break;
                case 2:day+=28;break;
                case 3:day+=31;break;
                case 4:day+=30;break;
                case 5:day+=31;break;
                case 6:day+=30;break;
                case 7:day+=31;break;
                case 8:day+=31;break;
                case 9:day+=30;break;
                case 10:day+=31;break;
                case 11:day+=30;break;
                case 12:day+=31;break;
            }
        }
        day+=number;
        System.out.println(day);
    }
}
