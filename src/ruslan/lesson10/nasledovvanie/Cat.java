package ruslan.lesson10.nasledovvanie;

public class Cat extends Animal {
    public Cat(String food, boolean wings, double speed) {
        super(food, wings, speed);
    }

    public Cat() {
    }

    @Override
    public void say() {
        System.out.println("MAY");
    }
}
