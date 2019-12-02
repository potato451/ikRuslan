package sergey.lesson5;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.Scanner;

public class TaskC {
    //Напишите тут ваш код
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mas = new int[20];
        for (int i = 0; i < 20; i++) {
            mas[i] = sc.nextInt();
        }
        sort(mas);

        for (int x : mas)
            System.out.println(x);


    }


    public static void sort(int[] array) {
        //Напишите тут ваш код
        for (int i = 1; i < array.length; i++) {
            for (int j = array.length - 1; j >= i; j--) {
                if (array[j - 1] < array[j]) {
                    int buf = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = buf;
                }
            }
        }

    }
}


