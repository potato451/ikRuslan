package ruslan.lesson6;

/*
Доработайте класс Dog.

1) Добавьте два новых поля с геттерами и сеттерми (!!!!)
private int weight; //вес собаки
private double power; //сила укуса собаки

2) Напишите экземплярный метод в классе Dog
boolean win(Dog otherDog)
    {... тело метода...}
который рассчитывает, кто из двух собак победит эта (this) или та (otherDog).

Расчет должен быть таким.
    Шансы на победу = 0.2 * возраст + 0.3 * вес + 0.5 * силу укуса.

Побеждает та собака, у которой больше шансов на победу.
Если победила эта (this), то метод win возвращает true, иначе false

3) Проверка.
В классе TaskC1 с клавиатуры через Scanner вводятся две собаки в формате
кличка возраст вес сила
кличка возраст вес сила
(всего получается 8 чтений разных данных)
]
Создайте этих собак, определите победителя с помощью созданного
в классе Dog метода boolean win(Dog dog).
Напечатайте кличку победителя.
*/


import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1:Age,2:Name,3:Weight,4:Power");
        Dog dog = new Dog(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextDouble());
        System.out.println("1:Age,2:Name,3:Weight,4:Power");
        Dog otherDog = new Dog(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextDouble());
//        dog.setWeight(sc.nextInt());
//        dog.setPower(sc.nextDouble());
//        dog.setAge(sc.nextInt());
//        dog.setName(sc.next());
//        otherDog.setWeight(sc.nextInt());
//        otherDog.setPower(sc.nextDouble());
//        otherDog.setAge(sc.nextInt());
//        otherDog.setName(sc.next());
//        dog.win(otherDog);
//        otherDog.win(dog);
        if (dog.win(dog, otherDog) == true) {
            System.out.println(dog.getName());
        } else {
            System.out.println(otherDog.getName());
        }
    }

}
