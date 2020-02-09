package ruslan.lesson10.nasledovvanie;


public class Animal implements Say{
    private String food;
    private boolean wings;
    private double speed;

    public void say(){
        System.out.println("asdf");
    }

    public Animal(String food, boolean wings, double speed) {
        this.food = food;
        this.wings = wings;
        this.speed = speed;
    }

    public Animal() {
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public boolean isWings() {
        return wings;
    }

    public void setWings(boolean wings) {
        this.wings = wings;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
