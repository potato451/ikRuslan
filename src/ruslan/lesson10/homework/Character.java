package ruslan.lesson10.homework;

import java.util.Random;

public class Character {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getLovkost() {
        return lovkost;
    }

    public void setLovkost(double lovkost) {
        this.lovkost = lovkost;
    }

    public double getStrenth() {
        return strenth;
    }

    public void setStrenth(double strenth) {
        this.strenth = strenth;
    }

    public int getiQ() {
        return iQ;
    }

    public void setiQ(int iQ) {
        this.iQ = iQ;
    }

    private String name;
    private int level;
    private double lovkost;
    private double strenth;
    private int iQ;
    int id;
    int index;
    private String[] atack = new String[3];
    private String[] walk = new String[2];
    private int [] ind=new int[3];
    private int [] lind = new int[2];


    public Character(String name, int level, double lovkost, double strenth, int iQ) {
        this.name = name;
        this.level = level;
        this.lovkost = lovkost;
        this.strenth = strenth;
        this.iQ = iQ;
    }

    public String atack(String[] atack) {
        int i = 0;
        this.atack[0] = atack[0];
        this.atack[1] = atack[1];
        this.atack[2] = atack[2];
        Random rand = new Random();
        int mas[] = new int[3];
        mas[0] = rand.nextInt() % 4;
        index=mas[0];
        if (mas[0] == 1) {
            i = 0;
        }
        if (mas[0] == 2) {
            i += 1;
        }
        if (mas[0] == 3) {
            i += 2;
        }
        return atack[i];

    }
    public int lack(int[] ind){
        int v=0;
        if (index==1){
            v=0;
        }
        if (index==2){
            v++;
        }
        if (index==3){
            v=2;
        }
        return ind[v];
    }
    public int tack(int []lind){
        int c=0;
        if (id==1){
            c=0;
        }
        if (id==2){
            c++;
        }
        if (id==3){
            c=2;
        }
        return lind[c];
    }
    public double suma(int[]lind,int[] ind){
      double  suma=(tack(lind)*lack(ind))*getStrenth()*getLovkost()*getLevel()+getiQ();
      return suma;
    }

    public void textAtack(String[] atack,String[] walk) {
        System.out.println("Character atack: " + atack(atack) + " walk: "+ walk(walk) + " level: "+getLevel()+ " strenth: "+getStrenth() +" lovkost: "+getLovkost() +" IQ: "+getiQ());
    }

    public String walk(String[] walk) {
        int i = 0;
        this.walk[0] = walk[0];
        this.walk[1] = walk[1];
        Random rand = new Random();
        int mas = rand.nextInt() % 3;
        id=mas;
        if (mas == 1) {
            i = 0;
        }
        if (mas == 2) {
            i++;
        }
        return walk[i];
    }
}
