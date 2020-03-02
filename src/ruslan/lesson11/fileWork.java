package ruslan.lesson11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class fileWork{
    public static void main(String[] args) throws FileNotFoundException {
//        String separator = File.separator;
//        String path ="C:"+separator+"Users"+ separator+"Ashraf-Ruslan"+separator +"Desktop"+separator+"file.txt";
//        File file = new File(path);
        String namefile = "fileRuslan";
        File file = new File(namefile);
        Scanner sc = new Scanner(file);
        String strFile = sc.nextLine();
        String[] numstring = strFile.split(" ");
        BigInteger[] numbers = new BigInteger[numstring.length];
        for (int i = 0; i < numstring.length; i++) {
            numbers[i] = new  BigInteger(numstring[i]);
        }
        PrintWriter printWriter = new PrintWriter(file);
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            printWriter.print(numbers[i]);
            printWriter.print(" ");
        }
//        while (sc.hasNextLine()) {
//            System.out.println(sc.nextLine());
//        }
        sc.close();
        printWriter.close();
    }
}