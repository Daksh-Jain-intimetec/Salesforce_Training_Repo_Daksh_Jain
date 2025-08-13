package WEEK1.DAY2;

class Banking{
    private String HolderName;
    private double balance;

    // Parameterized Constructure
    public Banking(String Name, double balance){
        this.HolderName = Name;
        this.balance = balance;
    }

    public double GetBalance(){
        return balance;
    }

    public void Deposit(double amount){
        balance += amount;
        System.out.println("Deposited " + amount);
    }

    public void Withdraw(double amount){
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        }
        if(amount > balance){
            System.out.println("Insufficient Balance");
        }
    }
}
public class CodeEncapsulation {
    public static void main(String[] args) {
        Banking Ctmr1 = new Banking("Daksh",10000);
        System.out.println(Ctmr1.GetBalance());
        Ctmr1.Deposit(5000);
        System.out.println(Ctmr1.GetBalance());
        Ctmr1.Withdraw(16000);
        System.out.println(Ctmr1.GetBalance());
    }
}