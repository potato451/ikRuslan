package ruslan.lesson6;

/*

B. (продолжение задач уровня А).

Создайте новый класс DogHelper и в нем два статических метода
void printAllNames(Dog[] dogs){.....}; //должен печатать в консоль через пробел имена всех собак
double averageAge(Dog[] dogs){.....}; //должен вычислять средний возраст переданных ему собак

В классе TaskB1 и его методе main
    Создайте массив из 5 разных собак. Дайте всем клички и укажите возраст.
    Шарик 1 год, Жучка 2 года, Бобик 3 года, Барбос 4 года, Полкан 5 лет

    Напечатайте их имена с помощью метода printAllNames, ожидается
    Шарик Жучка Бобик Барбос Полкан

    Напечатайте с новой строки их средний возраст,
    рассчитанный через метод averageAge, ожидается:
    3.0

Итого, правильный вывод такой:
Шарик Жучка Бобик Барбос Полкан
3.0

*/

public class TaskB1 {
    public static void main(String[] args) {
        DogHelper dog1 = new DogHelper();
        DogHelper dog2 = new DogHelper();
        DogHelper dog3 = new DogHelper();
        DogHelper dog4 = new DogHelper();
        DogHelper dog5 = new DogHelper();
        dog1.setName("Шарик");
        dog2.setName("Жучка");
        dog3.setName("Бобик");
        dog4.setName("Барбос");
        dog5.setName("Полкан");
        dog1.setAge(1);
        dog2.setAge(2);
        dog3.setAge(3);
        dog4.setAge(4);
        dog5.setAge(5);
        String[] dogs ={dog1.getName(),dog2.getName(),dog3.getName(),dog4.getName(),dog5.getName()};
        DogHelper.printAllNames(dogs);
        DogHelper.averageAge(dogs);
    }

}
