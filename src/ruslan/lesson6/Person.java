package ruslan.lesson6;

public class Person {
    private int rost = 165;
    private String call = "NO";

    public int getRost() {
        return rost;
    }

    public void setRost(int vallue) {
        if (vallue < 40) {
            System.out.println("Error");
        } else
            rost = vallue;
    }

    public Person(int tall) {
        rost = tall;
    }

    public Person() {

    }

    public void basSay(String name) {
        System.out.println(name + " bas");
    }

    public void falcetSay(String name) {
        System.out.println(name + " falcet");
    }

    public Person(int tall, String _call) {
        rost = tall;
        call = _call;
    }
}
