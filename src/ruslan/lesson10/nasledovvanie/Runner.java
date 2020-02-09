package ruslan.lesson10.nasledovvanie;

public class Runner {
    public static void main(String[] args) {
        Puple p =new Puple("Ruslan","Maktabi");
        Teacher t = new Teacher("R2","D2");
        State s =new State(400,600);
        Hotel h =new Hotel(400,1000);
        p.info();
        p.say();
        t.info();
    }
}
