package ruslan.lesson10.nasledovvanie;

public class Puple extends Persin {
    public Puple(String name, String surname) {
        super(name, surname);
    }
    public void info() {
        System.out.println("puple- " + getName() +" " + getSurname() );;
    }
}
