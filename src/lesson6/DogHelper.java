package lesson6;

public class DogHelper {
    static void printAllNames(Dog[] dogs) {
        for (Dog x : dogs) {
            System.out.print(x.getName() + " ");
        }
        System.out.println();


    } //должен печатать в консоль через пробел имена всех собак

    static double averageAge(Dog[] dogs) {
        //double srAge=1;
        int sum = 0;
        for (Dog dog : dogs) {
            sum+=dog.getAge();

        }
        return (double) sum / dogs.length;

    }
    //должен вычислять средний возраст переданных ему собак

}
