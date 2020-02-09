package ruslan.lesson10.nasledovvanie;

public class Dog extends Animal {
    public Dog(String food, boolean wings, double speed) {
        super(food, wings, speed);
    }

    public Dog() {
    }

    public void say() {
        System.out.println("HAU");
    }
}