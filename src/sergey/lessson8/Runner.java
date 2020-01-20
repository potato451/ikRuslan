package sergey.lessson8;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();
        while (true) {
            System.out.println("--------------------------");
            System.out.println("Выберите действия");
            System.out.println("1 - войти");
            System.out.println("2 - зарегистрироваться");
            System.out.println("3 - вывести всех");
            System.out.println("4 - выйти");
            System.out.println("0 - завершить");
            int answer = scanner.nextInt();
            if (answer == 1)
                controller.SignIn();
            else if (answer == 2)
                controller.signUp();
            else if (answer == 3)
                controller.printAllUsers();
            else if (answer == 4)
                controller.exit();
            else if (answer == 0)
                break;
            else
                controller.error();
        }
    }
}

