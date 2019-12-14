package ruslan.lesson6;

public class SRunner {
    public static void main(String[] args) {
        Person ruslan = new Person(190,"nau,chic");
        Person kolya = new Person(142);
        System.out.println(ruslan.rost + " call " + ruslan.call);
        System.out.println(kolya.rost + " call "+ kolya.call);
        kolya.call="BANANA";
        System.out.println(kolya.rost + " call "+ kolya.call);
        ruslan.falcetSay(" Ruslan");
        kolya.basSay(" Kolya");

    }
}
