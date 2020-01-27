package sergey.lessson8;

import java.util.ArrayList;

public class User {
    String name;
    String password;
    String trueName;
    String lastName;
    String sureName;
    String birthday;


    ArrayList<String> users = new ArrayList<>();

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

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }


    public void add() {
        users.add(this.name);
        users.add(this.password);
    }


}
