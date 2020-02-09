package ruslan.lesson10.nasledovanie1;

public class Teacher extends Person {
    private String teach;

    public Teacher(String name, String surname, byte age, String pol, String education, String teach) {
        super(name, surname, age, pol, education);
        this.teach = teach;
    }

    public Teacher() {
    }

    @Override
    public void walk() {
        System.out.println("techer go");
    }

    @Override
    public void say() {
        System.out.println("tacher say");
    }
    public void shout(){
        System.out.println("You missed lesson.2!");
    }
}
