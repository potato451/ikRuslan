package ruslan.lesson8;

import java.util.ArrayList;

public class AllUsers {
    static ArrayList<String> users=new ArrayList<>();
    static ArrayList<String> passwords =new ArrayList<>();
    private AllUsers(){

    }
    public  static void addUsers(User user){
        users.add(user.getName());
        passwords.add(user.getPassword());
        System.out.println(user.getName() + " Create!");
    }
    public static boolean checkUser(String name){
        for (int i = 0; i <users.size() ; i++) {
            if (users.get(i).equals(name)){
                return  false;
            }
        }
        return true;
    }
}
