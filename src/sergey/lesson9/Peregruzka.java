package sergey.lesson9;

import java.util.Scanner;

public class  Peregruzka  {


    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public float sum(float a, float b) {
        return a + b;
    }

    public float sum(float a, float b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        float f = scanner.nextFloat();
        final float g = 5.4f;

        Peregruzka peregruzka = new Peregruzka();
//        peregruzka.
//        System.out.println(peregruzka.sum(a,b));


    }

    @Override
    public String toString() {
        return super.toString();
    }
}
