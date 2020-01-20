package ruslan.lesson8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TestList {
    public static void main(String[] args) {

        ArrayList<Integer>mas2=new ArrayList<>(Arrays.asList(1,3,6,2,5));
        mas2.add(2);
        System.out.println(mas2.size());
        System.out.println(mas2);
        System.out.println(mas2.get(3));
        System.out.println(mas2.indexOf(6));
        mas2.clear();
        System.out.println(mas2.isEmpty());

    }

}
