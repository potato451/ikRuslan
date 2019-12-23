package ruslan.lesson6;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Dog {
    private double power = 3.4;
    private int weight = 4;

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

    public Dog() {
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

    @Override
    public String toString() {
        return "Кличка: " + this.name + ". Возраст: " + this.age;
    }

    public static void toString(Dog d1, Dog d2) {
        System.out.println("Кличка: " + d1.name + ". Возраст: " + d1.age);
        System.out.println("Кличка: " + d2.name + ". Возраст: " + d2.age);
    }

    public boolean win(Dog otherDog) {
//        boolean win¿;
        double averdog = this.age * 0.2 + 0.3 * this.weight + 0.5 * this.power;
        double aveerotherDog = otherDog.age * 0.2 + 0.3 * otherDog.weight + 0.5 * otherDog.power;
//        if (aveerotherDog>averdog){
//            return  false;
//        }else
//            return true;
        return averdog > aveerotherDog;
    }
}
