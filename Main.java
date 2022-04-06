package PBOteori.Polymorphism;

public class Main {
    public static void main(String[] args) throws Exception{
        BOC person1 = new BOC("123xxx",0,"Flazzy");
        BOG person2 = new BOG("124xxx",0,"Opalo");

        System.out.println(person1.toString());
        System.out.println("Jumlah uang person1 setelah top-up : " + person1.topUp(100));
        System.out.println("Jumlah uang person1 setelah top-up 2 : " + person1.topUp(100.10));
        System.out.println("Jumlah uang person1 setelah membayar : " + person1.pay(10));
        System.out.println("Jumlah uang person1 saat ini : " + person1.balance);

        System.out.println("--------------");

        // Overloaing Methods
        System.out.println(person2.toString());
        //System.out.println("Jumlah uang person2 setelah top-up : " + person2.topUp(200, true));
        System.out.println("Jumlah uang person2 setelah top-up 2 : " + person2.topUp(10000, false));
        System.out.println("Jumlah uang person2 setelah membayar: " + person2.pay(1000));
        System.out.println("Jumlah uang person2 saat ini : " + person2.balance);
    }
}
