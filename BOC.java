package PBOteori.Polymorphism;

public class BOC extends Emoney {

    public BOC(String id, int balance, String edition){
        super(id, balance, edition);
    }

    // Overloading Methods
    public int topUp(int amount){
        balance += (amount * 0.1) + amount;
        return balance;
    }

    public double topUp(double amount){
        balance += (amount * 0.1) + amount;
        return balance;
    }

    public int pay(int amount){
        balance -= amount;
        return balance;
    }

    // Overriding Methods
    @Override
    public String toString(){
        return "id: " + this.id + "\n" +
                "balance: " + balance + "\n" +
                "edition: " + this.edition;
    }
}
