package ruslan.lesson7;

import java.util.Scanner;

public class Book_Runnner {



    public static void main(String[] args) {
        Book[] book = new Book[3];
        Scanner sc  = new Scanner(System.in);
        book[0]= new Book(12341,new String[]{"Les","Home","Space"},"Artem","iBook",2020,230,10.5,"Paper");
        book[1]= new Book(12441,new String[]{"Mushrooms","Strawberry","Apple"},"Vasya","Burenok",1999,230,5.2,"Wood");
        book[2]= new Book(12641,new String[]{"Cars,Plane","Train"},"Nicolai","Burenok",1980,230,10.5,"Paper");
//        System.out.println("Autor");
//        String b = sc.next();
//        Book.bookAutor(b,book);
//        System.out.println("Isd");
//        String v = sc.next();
//        Book.bookIsd(book,v);
//        System.out.println("Year");
//        int m = sc.nextInt();
//        Book.bookYeaer(book,m);
        System.out.println(book[0]);

    }
}
