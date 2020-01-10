package ruslan.lesson7;

public class Book_Runnner {
    public static void main(String[] args) {
        Book[] book = new Book[3];
        book[0]= new Book(12341,new String[]{"Les","Home","Space"},"Artem","iBook",2020,230,10.5,"Paper");
        book[1]= new Book(12441,new String[]{"Mushrooms","Strawberry","Apple"},"Vasya","Burenok",1999,230,5.2,"Wood");
        book[2]= new Book(12641,new String[]{"Cars,Plane","Train"},"Nicolai","Burenok",1980,230,10.5,"Paper");
        Book.toString(book);
    }
}
