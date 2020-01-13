package ruslan.lesson7;

public class Time {
    private int sec;
    private int min;
    private int hour;

    public int toMinutes(int sec) {
        int a = sec % 60;
        int min2 = (sec - a) / 60;
        return min2;
    }
    public int toHours(int min,int sec){
        int a = (min+toMinutes(sec)) % 60;
        int hour2 = (min+toMinutes(sec)-a)/60;
        return hour2;
    }

    public Time(int sec, int min, int hour) {
        setSec(sec);
        setMin(min, sec);
        setHour(hour,min,sec);
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        if (sec < 0) {
            this.sec = 0;
        } else if (sec >= 60) {
            this.sec = sec % 60;
        } else
            this.sec = sec;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min, int sec) {
        if (min < 0) {
            this.min = 0;
        }
        if (sec >= 60) {
            this.min = min + toMinutes(sec);
        } else
            this.min = min;
        if (min+toMinutes(sec)>=60){
            this.min%=60;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour, int min, int sec) {
        if (hour > 24 || hour < 0) {
            this.hour = 0;
        } else if (min + toMinutes(sec) >= 60) {
            this.hour = hour + toHours(min,sec);
        } else
            this.hour = hour;
    }
}
