package ruslan.lesson10.nasledovanie1;

public class Person {
    private String name;
    private String surname;
    private byte age;
    private String pol;
    private String education;

    public Person(String name, String surname, byte age, String pol, String education) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.pol = pol;
        this.education = education;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
    public void walk(){
        System.out.println("person go");
    }
    public void say(){
        System.out.println("person say");
    }


}
