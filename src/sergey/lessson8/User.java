package sergey.lessson8;

import java.util.ArrayList;

public class User {
    String name;
    String password;
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
