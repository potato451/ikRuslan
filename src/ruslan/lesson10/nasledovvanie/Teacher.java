package ruslan.lesson10.nasledovvanie;

public class Teacher extends Persin {
    public Teacher(String name,String surname){
        super(name,surname);
    }
    public void info() {
        System.out.println("teacher- " + getName() +" " + getSurname() );;
    }
}
