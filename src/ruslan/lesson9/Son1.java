package ruslan.lesson9;

import java.util.Scanner;

public class Son1 extends Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Test1 t =new Test1();
        int a =sc.nextInt();
        int b =sc.nextInt();
        System.out.println(t.suma(a,b));
    }
}
