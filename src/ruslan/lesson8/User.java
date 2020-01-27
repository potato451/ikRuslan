package ruslan.lesson8;

import java.util.Scanner;


public class User {
    Scanner sc = new Scanner(System.in);
    private String name;
    private String password;
    private String true_name;
    private String last_name;
    private String birthday;
    private String claver;
    private boolean f=false;

    public User() {

    }

    public boolean isF() {
        return f;
    }

    public void setF(boolean f) {
        this.f = f;
    }

    public User(String true_name, String last_name, String birthday, String claver, boolean f) {
        this.true_name = true_name;
        this.last_name = last_name;
        this.birthday = birthday;
        this.claver = claver;
        this.f=f;
    }

    public String getTrue_name() {
        return true_name;
    }

    public void setTrue_name(String true_name) {
        this.true_name = true_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getClaver() {
        return claver;
    }

    public void setClaver(String claver) {
        this.claver = claver;
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
