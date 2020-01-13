package ruslan.lesson6;

public class DogHelper {

    private int age = 5;
    private String name = "NO";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 15 || age < 0) {
            System.out.println("Error");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void printAllNames(Dog[] dogs) {
        for (int i = 0; i < dogs.length; i++) {
            System.out.print(dogs[i].getName() + " ");
        }
    }

    public DogHelper() {
        setAge(age);
        setName(name);
    }

    public static double averageAge(Dog[] dogs) {
        int som = 0;
        for (int i = 0; i < dogs.length; i++) {
            som += dogs[i].getAge();
        }
        return (double) som / dogs.length;
    }
}


