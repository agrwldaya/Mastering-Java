
// Encapsulation = hiding data + data biniding + Protect data + provide methods to access control 
// use private variable and getter/setter

class Bankacount{
    private double balance;

    Bankacount(){
        balance=0;
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }

        System.out.println("Amount deposited successfully!");
    }
    public void withdrow(double amount){
        if(balance<amount){
            System.out.println("Insufficient Balance!");
            return;
        }
        balance-=amount;
        System.out.println("Amount withdrowed successfully!");
    }

    public double getBalance(){
        return balance;
    }
}


class encapsulation{
    public static void main(String s[]){
        Bankacount acc1 = new Bankacount();

        acc1.deposit(3000);
        double mybalance = acc1.getBalance();
        System.out.println(mybalance);

        acc1.withdrow(500);
        mybalance = acc1.getBalance();
        System.out.println(mybalance);
    }
}