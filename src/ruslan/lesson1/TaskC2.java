package ruslan.lesson1;


import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        String bina = Integer.toBinaryString(a);
        String binb = Integer.toBinaryString(b);
        String binc = Integer.toBinaryString(c);
        String hexa = Integer.toHexString(a);
        String hexb = Integer.toHexString(b);
        String hexc = Integer.toHexString(c);
        String octa = Integer.toOctalString(a);
        String octb = Integer.toOctalString(b);
        String octc = Integer.toOctalString(c);
        System.out.println("DEC:" + a + "+" + b + "=" + c);
        System.out.println("BIN:" + bina + "+" + binb + "=" + binc);
        System.out.println("HEX:" + hexa + "+" + hexb + "=" + hexc);
        System.out.println("OCT:" + octa + "+" + octb + "=" + octc);

    }
}
