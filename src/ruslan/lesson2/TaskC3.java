package ruslan.lesson2;

/*
Вывести таблицу умножения 10 x 10 (двоныйм циклом),
но вывод должен быть словами:

Ожидаемый вывод:
два умножить на два равно четыре
два умножить на три равно шесть
два умножить на четыре равно восемь
два умножить на пять равно десять
два умножить на шесть равно двенадцать
два умножить на семь равно четырнадцать
два умножить на восемь равно шестнадцать
два умножить на девять равно восемнадцать
два умножить на десять равно двадцать
три умножить на два равно шесть
три умножить на три равно девять
три умножить на четыре равно двенадцать
...
и т.д. до фразы
...
десять умножить на десять равно сто
*/

public class TaskC3 {
    public static void main(String[] args) {
        int a = 0;
        while (a < 10) {
            a++;
            switch (a) {
                case 1:
                    System.out.println("два умножить на два равно четыре");
                    break;
                case 2:
                    System.out.println("два умножить на три равно шесть");
                    break;
                case 3:
                    System.out.println("два умножить на четыре равно восемь");
                    break;
                case 4:
                    System.out.println("два умножить на пять равно десять");
                    break;
                case 5:
                    System.out.println("два умножить на шесть равно двенадцать");
                    break;
                case 6:
                    System.out.println("два умножить на семь равно четырнадцать");
                    break;
                case 7:
                    System.out.println("два умножить на восемь равно шестнадцать");
                    break;
                case 8:
                    System.out.println("два умножить на девять равно восемнадцать");
                    break;
                case 9:
                    System.out.println("два умножить на десять равно двадцать");
                    break;
            }
        }
    }

}
