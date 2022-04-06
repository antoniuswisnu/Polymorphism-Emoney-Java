package PBOteori.Polymorphism;

public class BOG extends Emoney{

    public BOG(String id, int balance, String edition){
        super(id, balance, edition);
    }

    // Overloading Method
    public int topUp(int amount, boolean promo){
        if(promo){
            balance += (amount * 0.2) + amount;
        }else {
            balance += (amount * 0.05) + amount;
        }
        return balance;
    }

    public double topUp(double amount, boolean promo){
        if(promo){
            balance += (amount * 0.2) + amount;
        }else{
            balance += (amount * 0.05) + amount;
        }
        return balance;
    }

    public int pay(int amount){
        balance -= amount - (amount * 0.1);
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
