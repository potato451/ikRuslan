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


    public static void printAllNames(String[] dogs) {
        for (int i = 0; i < dogs.length; i++) {
            System.out.print(dogs[i] + " ");

        }
    }
    public static double averageAge(String[] dogs){
        double aver = (dogs.length + dogs.length - 1 + dogs.length -2 +dogs.length-3+dogs.length-4) /dogs.length;
        return aver;
    }

}

