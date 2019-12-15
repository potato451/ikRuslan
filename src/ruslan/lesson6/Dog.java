package ruslan.lesson6;

public class Dog {
    private static Object Dog;
    public int age = 3;
    public String name = "No";
    private int weight = 3;
    private double power = 10.5;
    public Dog(int _age,String _name,double _power,int _weight){
        age = _age;
        name=_name;
        power = _power;
        weight = _weight;
    }

    public static boolean win(Dog otherDog){
        boolean other_dog = otherDog.age* 0.2  + 0.3 * otherDog.weight + 0.5 * otherDog.power;
        return other_dog;
        double this_Dog = dog.age* 0.2  + 0.3 * dog.weight + 0.5 * dog.power;
        return this_Dog;
    }
}
