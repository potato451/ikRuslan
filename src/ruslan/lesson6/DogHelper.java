package ruslan.lesson6;

public class DogHelper {
    //    private int age = 5;
//    private String name = "NO";
//
//    public DogHelper() {
//        setAge(age);
//        setName(name);
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setAge(int age) {
//        if (age > 15 || age < 0) {
//            System.out.println("Error");
//        }
//        this.age = age;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//
//    public static void printAllNames(String[] dogs) {
//        for (int i = 0; i < dogs.length; i++) {
//            System.out.print(dogs[i] + " ");
//
//        }
//    }
//    public static double averageAge(String[] dogs){
//        double aver =
//        return aver;
//    }
    public static void printAllNames(Dog[] dogs) {
        for (int i = 0; i < dogs.length; i++) {
            System.out.print(dogs[i].getName() + " ");
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

