package sergey.lesson2;

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

import java.util.Scanner;

public class TaskC3 {

    private static String perevod(int a){
        switch (a) {
            case 0:return"ноль";
            case 1:return"один";
            case 2:return"два";
            case 3:return"три";
            case 4:return"четыре";
            case 5:return"пять";
            case 6:return"шесть";
            case 7:return"семь";
            case 8:return"восемь";
            case 9:return"девять";
            case 10:return"десять";
            case 12:return"двенадцать";
            case 14:return"четырнадцать";
            case 15:return"пятнадцать";
            case 16:return"шестнадцать";
            case 18:return"восемнадцать";
            case 20:return"двадцать";
            case 21:return"двадцать один";
            case 24:return"двадцать четыре";
            case 25:return"двадцать пять";
            case 27:return"двадцать семь";
            case 28:return"двадцать восемь";
            case 30:return"тридцать";
            case 32:return"тридцать два";
            case 35:return"тридцать пять";
            case 36:return"тридцать шесть";
            case 40:return"сорок";
            case 42:return"сорок два";
            case 45:return"сорок пять";
            case 48:return"сорок восемь";
            case 49:return"сорок девять";
            case 50:return"пятьдесят";
            case 54:return"пятьдесят четыре";
            case 56:return"пятьдесят шесть";
            case 60:return"шестьдесят";
            case 63:return"шестьдесят три";
            case 64:return"шестьдесят четыре";
            case 70:return"семьдесят";
            case 72:return"семьдесят два";
            case 80:return"восемьдесят";
            case 81:return"восемьдесят один";
            case 90:return"девяносто";
            case 100:return"сто";
        }
        return "";
    }

    public static void main(String[] args) {
        for (int i = 0; i <=10; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.printf("%s умножить на %s равно %s%n",perevod(i),perevod(j),perevod(i*j));
            }
        }
    }

}
