package ruslan.lesson6;

public class DogHelper {
    public double age = 3;
    public String name = "No";

    public DogHelper(int _age, String _name) {
        name = _name;
        age = _age;
    }

    public static void printAllNames(String[] dogs) {
        for (int i = 0; i < dogs.length; i++) {
            System.out.print(dogs[i] + " ");
        }
    }

    public static double averageAge(double[] ae) {
        double medium = (ae[0] + ae[1] + ae[2] + ae[3] + ae[4]) / ae.length;
        return medium;
    }
}