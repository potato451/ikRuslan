package ruslan.lesson10.nasledovvanie;

public class Home implements House{
    private int persons;
    private double price;
    public Home(int persons, double price) {
        this.persons = persons;
        this.price = price;
    }

    public Home() {
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void info(){

    }
}
