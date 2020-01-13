package ruslan.lesson6;

public class DogHelper {

 
    public static void printAllNames(Dog[] dogs) {
        for (int i = 0; i < dogs.length; i++) {
            System.out.print(dogs[i].getName() + " ");
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
        System.out.println();
    }


    public static double averageAge(Dog[] dogs) {
        int som=0;
        for (int i = 0; i <dogs.length ; i++) {
            som+=dogs[i].getAge();
        }
        return (double) som/dogs.length;
    }
}

