package ruslan.lesson7;

public class Runner_Customer {
    public static void main(String[] args) {
        Customer[] cust =new Customer[5];
        cust[0]=new Customer(12341,"Lobanov","Nala","Brighton 17","2467908385471375","By 225",4,5);
        cust[1]=new Customer(13441,"Kobanov","Loka","Lesnaya 1","6267908685471375","By 223",5,2);
        cust[2]=new Customer(12251,"Vobanov","Cola","Brighton 6","1467304385471375","By 226",1,7);
        cust[3]=new Customer(12948,"Gobanov","Moala","Danovich 8","3457908385441315","By 227",2,9);
        cust[4]=new Customer(19544,"Mobanov","Scala","Revolinaya 37","5467934585435375","By 228",3,12);
        Customer.toString(cust);


    }
}
