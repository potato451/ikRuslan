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
        Dog dog = new Dog(3,"l",5,10.9);
        Dog otherDog = new Dog(3,"l",5,0.9);
        dog.setWeight(sc.nextInt());
        dog.setPower(sc.nextDouble());
        dog.setAge(sc.nextInt());
        dog.setName(sc.nextLine());
        otherDog.setWeight(sc.nextInt());
        otherDog.setPower(sc.nextDouble());
        otherDog.setAge(sc.nextInt());
        otherDog.setName(sc.nextLine());
        if ( Dog.win(dog,otherDog)==true){
            System.out.println(otherDog.getName());
        }else{
            System.out.println(dog.getName());
        }
    }

}
