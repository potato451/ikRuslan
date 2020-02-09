package ruslan.lesson10.homework;

public class Wizard extends Character {
    @Override
    public String atack(String[] atack) {
        atack[0]="wind";
        atack[1]="ice ball";
        atack[2]="fire ball";
        return super.atack(atack);
    }

    @Override
    public String walk(String[] walk) {
        walk[0]="legs";
        walk[1]="fly";
        return super.walk(walk);
    }

    @Override
    public void textAtack(String[] atack,String[] walk) {
        System.out.println("Wizard atack: " + atack(atack) + " walk: "+ walk(walk) + " level: "+getLevel()+ " strenth: "+getStrenth() +" lovkost: "+getLovkost() +" IQ: "+getiQ() );

    }

    public Wizard(String name, int level, double lovkost, double strenth, int iQ) {
        super(name, level, lovkost, strenth, iQ);
    }

    @Override
    public int lack(int[] ind) {
        ind[0]=2;
        ind[1]=4;
        ind[2]=6;
        return super.lack(ind);
    }

    @Override
    public int tack(int[] lind) {
        lind[0]=2;
        lind[1]=4;
        return super.tack(lind);
    }
}
