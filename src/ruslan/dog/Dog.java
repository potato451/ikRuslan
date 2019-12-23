package ruslan.dog;

public class Dog {
    private double power = 3.4;
    private int weight = 4;

    public Dog() {
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private int age = 5;
    private String name = "NO";

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Dog(int age, String name, int weight, double power) {
        setAge(age);
        setName(name);
        setPower(power);
        setWeight(weight);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 15 || age < 0) {
            System.out.println("Error");
        }
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void toString(Dog d1, Dog d2) {
        System.out.println("Кличка: " + d1.name + ". Возраст: " + d1.age);
        System.out.println("Кличка: " + d2.name + ". Возраст: " + d2.age);
    }

    public static boolean win(Dog dog, Dog otherDog) {
        boolean win;
        double averdog = dog.getAge() * 0.2 + 0.3 * dog.getWeight() + 0.5 * dog.getPower();
        double aveerotherDog = otherDog.getAge() * 0.2 + 0.3 * otherDog.getWeight() + 0.5 * otherDog.getPower();
        if (aveerotherDog>averdog){
            win = true;
        }else
            win = false;
        return win;
    }
}
