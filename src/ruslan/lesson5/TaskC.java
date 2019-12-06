package ruslan.lesson5;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.Scanner;

public class TaskC {


    //Напишите тут ваш код
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mas = new int[20];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = sc.nextInt();
        }


//        for (int i = 0; i < mas.length; i++) {
//            int s  = mas[i];
//            for (int j = i-1 ; j >=0 ; j--) {
//                int num = mas[j];
//                if (s <  num){
//                    mas[i] = num;
//                    mas[j] = s;
//                }else{
//                    break;
//                }
//
//
//
//            }
//            System.out.println(mas );
//        }
        int col=0;
        for (int i = 0; i < mas.length; i++) {
            boolean b = false;
            for (int j = mas.length-1; j>i ; j--) {
                if (mas[j]>mas[j-1]) {
                    int buf = mas[j];
                    mas[j] = mas[j - 1];
                    mas[j - 1] = buf;
                    b = true;
                }

            }
            if (b==false)
                break;
        }
        for (int el : mas) {
            System.out.println(el);

        }
    }
}


