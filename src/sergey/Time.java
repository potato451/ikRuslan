package sergey;

import java.util.Scanner;

public class Time {

    int sec;
    int min;
    int hours;

    public Time(int sec, int min, int hours) {
        this.sec = sec;
        this.min = min;
        this.hours = hours;
    }

    public String info() {
        if (this.sec >= 60) {
            this.min += this.sec / 60;
            this.sec %= 60;
        }
        if (this.min >= 60) {
            this.hours += this.min / 60;
            this.min %= 60;
        }
        return "sec:" + this.sec + " min:" + this.min +" hours:"+this.hours;
    }
}

class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Time time = new Time(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println(time.info());
    }
}
