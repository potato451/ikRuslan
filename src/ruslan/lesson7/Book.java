package ruslan.lesson7;

import java.util.Arrays;

public class Book {
    private int id;
    private String[] title;
    private String autors;
    private String isd;
    private int year;
    private int pages;
    private double price;
    private String type;

    public Book(int id, String[] title, String autors, String isd, int year, int pages, double price, String type) {
        setId(id);
        setTitle(title);
        setAutors(autors);
        setIsd(isd);
        setYear(year);
        setPages(pages);
        setPrice(price);
        setType(type);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getTitle() {
        return title;
    }

    public void setTitle(String[] title) {
        this.title = title;
    }

    public String getAutors() {
        return autors;
    }

    public void setAutors(String autors) {
        this.autors = autors;
    }

    public String getIsd() {
        return isd;
    }

    public void setIsd(String isd) {
        this.isd = isd;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (this.year > 2020 || this.year < 1000)
            System.out.println("Error");
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static void toString(Book[] book) {
        for (int i = 0; i < book.length; i++) {
            System.out.println(book[i].getAutors());
            System.out.println(Arrays.toString(book[i].getTitle()));
        }
        int i = 0;
        if (book[0].getIsd() == book[1].getIsd() && book[2].getIsd() == book[1].getIsd()) {
            book[0].isd+= book[0].getIsd()+book[1].getIsd();
        } else if (book[0].getIsd() == book[1].getIsd()) {
            book[0].isd += book[1].getIsd();
        } else if (book[0].getIsd() == book[2].getIsd()) {
            book[0].isd += book[2].getIsd();
        } else if (book[1].getIsd() == book[2].getIsd()) {
            book[1].isd += book[2].getIsd();
            i++;
        } else
            System.out.println("Nothing");
        if (book[0].isd != book[0].getIsd() || book[1].isd != book[1].getIsd())
            System.out.println(book[i].getIsd());
    }
}
