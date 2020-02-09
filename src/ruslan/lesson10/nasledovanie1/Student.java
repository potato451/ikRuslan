package ruslan.lesson10.nasledovanie1;

public class Student extends Person {
    String group ;
    String kyrs;

    public Student(String name, String surname, byte age, String pol, String education, String group, String kyrs) {
       super(name, surname, age, pol, education);
        this.group = group;
        this.kyrs = kyrs;
    }



    @Override
    public void say() {
        System.out.println("student say");
    }

    @Override
    public void walk() {
        System.out.println("st go");
    }

    public void stady(){
        System.out.println("student study");
    }

}
