package ruslan.lesson6;

public class Person {
    public int rost = 165;
    public String call = "NO";

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
