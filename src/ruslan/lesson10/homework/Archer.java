package ruslan.lesson10.homework;

public class Archer extends Character{
    public String atack(String[] atack) {
        atack[0]="short";
        atack[1]="double short";
        atack[2]="fire arrows";
        return super.atack(atack);
    }

    public Archer(String name, int level, double lovkost, double strenth, int iQ) {
        super(name, level, lovkost, strenth, iQ);
    }
    public void textAtack(String[] atack,String[] walk) {
        System.out.println("Archer atack: " + atack(atack) + " walk: " + walk(walk) + " level: "+getLevel()+ " strenth: "+getStrenth() +" lovkost: "+getLovkost() +" IQ: "+getiQ());
    }

    public String walk(String[] walk) {
        walk[0]="legs";
        walk[1]="by wolf";
        return super.walk(walk);
    }
    public int lack(int[] ind) {
        ind[0]=2;
        ind[1]=4;
        ind[2]=6;
        return super.lack(ind);
    }
    public int tack(int[] lind) {
        lind[0]=2;
        lind[1]=4;
        return super.tack(lind);
    }
}
