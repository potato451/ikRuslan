package ruslan.lesson7;

//import ruslan.lesson6.Dog;

public class Student {
    private String name="NO";
    private String lastname = "No";
    private String surname = "No";
    private int group=4;
    private int[] marks =new int[5];

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }



//    public void setMarks(int marks) {
//        if (marks>10 || marks<0){
//            System.out.println("Error");
//        }
//        this.marks = marks;
//    }

    public Student(String surname, String name, String lastname, int group, int[] marks){
        setName(name);
        setGroup(group);
        setLastname(lastname);
        setMarks(marks);
        setSurname(surname);
    }
    public static void  printAllMarks(Student[] students){
        for (int i = 0; i <students.length ;i++) {
            if (students[i].AvgMarks()>8){
                System.out.println("Student: " + students[i].getSurname() + "Group:" +students[i].getGroup());
            }
        }
    }

    private double AvgMarks() {
        double sum=0;

        for (int i = 0; i < marks.length; i++) {
            sum+=marks[i];

        }
        return sum /marks.length;

    }


    public static void main(String[] args) {
        Student [] students = new Student[10];
        students[0]= new Student("Lobanov","Alex","Ilich",4, new int[]{-5, 1, 1, 2, 3});
        students[1]= new Student("Kabanov","Roman","Romanovich",9,new int[]{10, 1, 1, 2, 3});
        students[2]= new Student("Titovich","Nikita","Ilich",6,new int[]{7, 6, 9, 8, 7});
        students[3]= new Student("Boxan","Alex","Petrovich",1,new int[]{9, 9, 9, 9, 9});
        students[4]= new Student("Ganush","Gleb","Ilich",4,new int[]{7, 6, 1, 8, 6});
        students[5]= new Student("Novitskaya","Alesya","olegovna",2,new int[]{5, 1, 5, 2, 3});
        students[6]= new Student("Varankevich","Lera","Nacibovna",7,new int[]{1, 1, 1, 2, 3});
        students[7]= new Student("Latvinko","Polina","Olegovna",5,new int[]{8, 2, 9, 9, 9});
        students[8]= new Student("Sobolevscki","Alex","Ilich",8,new int[]{10, 9, 8, 7, 9});
        students[9]= new Student("Kabkov","Artem","Alexandrovich",9,new int[]{9, 9, 3, 9, 9});
        printAllMarks(students);
    }
}
