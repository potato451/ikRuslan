package ruslan.lesson10.nasledovanie1;

public class Runner {
    public static void main(String[] args) {
        Student st = new Student("Ruslan","Maktabi", (byte) 13,"Man","puple","8","v");
        Teacher te =new Teacher("Snezhana","Denisovna",(byte)60,"Woman","teacher","Russian");
        System.out.println(st.getAge() + st.getPol());
        st.say();
        st.walk();
        st.stady();
        te.say();
        te.walk();
        te.shout();
    }
}
