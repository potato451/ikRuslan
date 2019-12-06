package ruslan.lesson5;

import java.util.Random;
        import java.util.Scanner;

public class Example {
    public static void printArrayFor(int i) {
    }

    //конвертируем строку чисел в масси
    int[] lineToIntArray(String line) {
        line = line.trim();//удаляем пробелы
        String[] elString = line.split(" ");//сплит по пробелу
        int count = elString.length; //узнаем сколько элементов в строчке
        int[] mas = new int[count];//создаем массив целых чисел
        for (int i = 0; i < count; i++) {
            mas[i] = Integer.parseInt(elString[i]);//заполняем его
        }
        return mas;
    }

    //записываем массив вручную числами
    public static int[] readArray(int count) {
        Scanner scanner = new Scanner(System.in);
        int mas[] = new int[count];
        for (int i = 0; i < count; i++) {
            mas[i] = scanner.nextInt();
        }
        return mas;
    }

    //записываем массив рандомными числами
    public static int[] readArrayRandom(int count) {
        Random random = new Random();
        int mas[] = new int[count];
        for (int i = 0; i < count; i++) {
            mas[i] = random.nextInt() % 10;//рандом [0,10)
        }
        return mas;
    }

    void printArrayForI(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static  void printArrayFor(int[] array) {
        for (int el : array) {
            System.out.println(el + " ");
        }
    }

    void printArrayFormat(int[] array, String name) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s[%d]=%d%n", name, i, array[i]);
        }
    }

    void ArrayPrint(int[] array, String name, int count) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s[%d]=%d", name, i, array[i]);
            if (i % count == 0) {
                System.out.println();
            }
        }
    }

    //поиск максимума
    int maxInArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    //поиск минимума
    int minInArray(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

    int[] bubleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int buf = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = buf;
                }
            }
        }
        return array;
    }

    int[] bubleSortBest(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean swap = false;
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int buf = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = buf;
                    swap = true;
                }
            }
            if (!swap)
                break;
        }
        return array;
    }


    int[] sortVibor(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (i != index)
                swap(array, i, index);
        }
        return array;
    }

    private void swap(int[] array, int i, int index) {
        int buf = array[i];
        array[i] = array[index];
        array[index] = buf;
    }

}
