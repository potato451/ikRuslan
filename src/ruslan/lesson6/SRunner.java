package ruslan.lesson6;

public class SRunner {
    public static void main(String[] args) {
        Person ruslan = new Person(424,"nau,chic");
        Person kolya = new Person(142);
        ruslan.setRost(-100);
        System.out.println(ruslan.getRost()/*+ " call " + ruslan.call*/);
        System.out.println(kolya.getRost()/* + " call "+ kolya.call*/);
//       // kolya.call="BANANA";
//        System.out.println(kolya.getRost() + " call "+ kolya.call);
//        ruslan.falcetSay(" Ruslan");
//        kolya.basSay(" Kolya");

    }
}
