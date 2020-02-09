package ruslan.lesson9;

import com.sun.prism.shader.AlphaOne_LinearGradient_Loader;

import java.util.Scanner;

public class Peregruzka {
    public int sum(int a,int b){
        return a+b;
    }
    public double sum(double a,int b){
        return a+b;
    }
    public double sum(double a,double b){
        return a+b;
    }
    public float sum(float a,float b){
        return a+b;
    }
    public float sum(float a, float b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Peregruzka per = new Peregruzka();
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        double c=sc.nextInt();
        double d=sc.nextInt();
        float f=sc.nextFloat();
        System.out.println(per.sum(a,b));
    }
}