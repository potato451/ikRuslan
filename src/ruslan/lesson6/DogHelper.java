package ruslan.lesson6;

public class DogHelper {
    private int age = 5;
    private String name = "NO";

    public DogHelper() {
        setAge(age);
        setName(name);
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


    public static void printAllNames(Dog [] dogs) {
        for (int i = 0; i < dogs.length; i++) {
            System.out.print(dogs[i].getName() + " ");

        }
    }
    public static double averageAge(Dog[] dogs){
        double aver =0;
        for (int i = 0; i <dogs.length; i++) {
           aver =aver + dogs[i].getAge();
        }
        return aver;
    }

}

