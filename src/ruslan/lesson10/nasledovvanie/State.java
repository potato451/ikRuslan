package ruslan.lesson10.nasledovvanie;

public class State extends Home{
    public State(int persons, double price) {
        super(persons, price);
    }

    public State() {
    }

    @Override
    public void info() {
        System.out.println();
    }
}
