package ruslan.lesson7;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Time time = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("Your time is: " + time.getSec() + " seconds, " + time.getMin() + " minutes, " + time.getHour() + " hours.");
        System.out.println("Change?,yes,no");
        String chan =sc.next();
        if (chan.equals("no")){
            System.out.println("ok");
        }else if(chan.equals("yes")){
            Time tme = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
            System.out.println("Your time is: " + tme.getSec() + " seconds, " + tme.getMin() + " minutes, " + tme.getHour() + " hours.");
        }else
            System.out.println("Error");
    }
}
