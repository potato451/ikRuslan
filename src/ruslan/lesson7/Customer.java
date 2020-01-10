package ruslan.lesson7;

public class Customer {
    private int id;
    private String name;
    private String surname;
    private String adrec;
    private String card;
    private String bank;
    private int ind;
    private int interval;

    public Customer(int id, String name, String surname, String adrec, String card, String bank, int ind, int interval) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.adrec = adrec;
        this.card = card;
        this.bank = bank;
        this.ind = ind;
        this.interval = interval;
    }

    public int getId() {
        return id;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAdrec() {
        return adrec;
    }

    public void setAdrec(String adrec) {
        this.adrec = adrec;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public int getInd() {
        return ind;
    }

    public void setInd(int ind) {
        this.ind = ind;
    }

    public static void toString(Customer[] cust) {
        for (int i = 0; i < cust.length; i++) {
            for (int j = cust.length - 1; j > i; j--) {
                if (cust[i].getInd() > cust[j].getInd()) {
                    Customer buf = cust[j];
                    cust[j] = cust[i];
                    cust[i] = buf;

                }
            }

            System.out.println(cust[i].getInd());
            System.out.println("id - " + cust[i].getId() + " surname - " + cust[i].getSurname() + " name- " + cust[i].getName() + " adrec- " + cust[i].getAdrec() + " card - " + cust[i].getCard() + " bank- " + cust[i].getBank());
        }
        for (int i = 0; i < cust.length; i++) {
            for (int j = cust.length - 1; j > i; j--) {
                if (cust[i].getInterval() > cust[j].getInterval()) {
                    Customer buf = cust[j];
                    cust[j] = cust[i];
                    cust[i] = buf;

                }
            }

            System.out.println(cust[i].getInterval());
            System.out.println("id - " + cust[i].getId() + " surname - " + cust[i].getSurname() + " name- " + cust[i].getName() + " adrec- " + cust[i].getAdrec() + " card - " + cust[i].getCard() + " bank- " + cust[i].getBank());
        }


    }
}