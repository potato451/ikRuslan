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
        String dogs[] = new String[5];
        double ae[]= new double [5];
        DogHelper d = new DogHelper(1," Шарик");
        DogHelper w = new DogHelper(2," Жучка");
        DogHelper f = new DogHelper(3," Бобик");
        DogHelper s = new DogHelper(4," Барбос");
        DogHelper a = new DogHelper(5," Полкан");
        dogs[0]=d.name;
        dogs[1]=w.name;
        dogs[2]=f.name;
        dogs[3]=s.name;
        dogs[4]=a.name;
        ae[0]=d.age;
        ae[1]=w.age;
        ae[2]=f.age;
        ae[3]=s.age;
        ae[4]=a.age;
       DogHelper.printAllNames(dogs);
        System.out.println();
        System.out.println(DogHelper.averageAge(ae));
    }


}
