package lesson6;

public class Dog {

    public Dog() {
    }

    private String name;
    private int age;
    private int weight; //вес собаки
    private double power; //сила укуса собаки

    public Dog(String name, int age, int weight, double power) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.power = power;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {

        return "Кличка: " + this.name + ". Возраст: " + this.age;
    }

    boolean win(Dog otherDog) {
        double myChans = 0.2 * this.age + 0.3 * this.weight + 0.5 * this.power;
        double otherChans = 0.2 * otherDog.age + 0.3 * otherDog.weight + 0.5 * otherDog.power;
        return myChans > otherChans;
    }

}

