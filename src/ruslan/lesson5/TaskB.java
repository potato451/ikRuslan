package ruslan.lesson5;

/*
Один большой массив и два маленьких
1. Создать массив m на 20 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива a и b на 10 целых чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький,
    вторую половину во второй маленький.
5. Вывести массивы a и b на экран командами:
        System.out.println("a="+Arrays.toString(a));
        System.out.println("b="+Arrays.toString(b));

Например, для такого ввода
1 2 3 4 5 6 7 8 9 10 11 22 33 44 55 66 77 88 99 0

ожидается такой вывод:
a=[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
b=[11, 22, 33, 44, 55, 66, 77, 88, 99, 0]

*/

import java.util.Arrays;

public class TaskB {
    public static void main(String[] args) {
        int[] c= new int[20];
        c = Example.readArray(20);
//        Example.printArrayFor(c);
        int[] a = new int[10];
        int[] b = new int[10];
        for (int i = 0; i < b.length; i++) {
            a[i] = c[i];
            b[i] = c[i + 10];

        }
        System.out.println("\na="+ Arrays.toString(a));
        System.out.println("b="+ Arrays.toString(b));


    }


}
