package WEEK2;

import java.util.Scanner;

class BankAccount{
    protected double ProvidentFund = 0;
    protected String Name = null;
    protected double balance = 0;

    public BankAccount(String Name, double balance){
        this.Name = Name;
        this.balance = balance;
    }
    public void creditTransaction(double amount){
        if(amount>0){
            this.balance += amount;
        }
    }
    public void debitTransaction(double amount)throws IllegalArgumentException{
        if(amount>this.balance){
            throw new IllegalArgumentException("Unavailable Balance..");
        }
        else if(amount>0 && amount<this.balance){
            this.balance -= amount;
        }
    }
    public void providentFund(double amount){
        double sum = this.ProvidentFund;
        sum += sum*0.08 + amount;
        this.ProvidentFund = sum;
        System.out.println("PF completed..");
    }
    public void getBankInfo(){
        System.out.println("HOLDER NAME: "+ this.Name);
        System.out.println("BANKBALANCE: "+ this.balance);
    }
    public void getPfinfo() throws UnsupportedOperationException{
        throw new UnsupportedOperationException("Choice unavailable at the moment.");
    }
}
class BankCreditCard extends BankAccount{
    private double cardBalance = 200000;
    protected String Name = null;
    public BankCreditCard(String Name, double balance) {
        super(Name, balance);
        this.Name = Name;
    }
    public void getCardInfo(){
        System.out.println("CARD HOLDER NAME: "+ super.Name);
        System.out.println("CARD BALANCE: "+ cardBalance);
    }
    public void transaction(double amount) throws UnsupportedOperationException{
        if(amount>this.cardBalance){
            throw new UnsupportedOperationException("Amount not available");
        }
        else if(amount<this.cardBalance){
            this.cardBalance +=amount;
        }
    }
}
public class UnsupportedOperationException1{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name: ");
        String Name = sc.nextLine();

        System.out.println("Enter amount to deposit");;
        double amount = sc.nextDouble();

        BankAccount account1 = new BankCreditCard(Name, amount);

        System.out.println("HELLO "+ Name+",");
        System.out.println("Your Balance is "+ amount);
        System.out.println("Choose your action: ");
        System.out.println("1. GET ACCOUNT INFO ");
        System.out.println("2. MAKE PF ");
        System.out.println("3. GET CREDIT CARD ");
        System.out.println("4. CREDIT AMOUNT INTO BANK ");
        System.out.println("5. DEBIT AMOUNT FROM BANK ");
        System.out.println("6. GET PF Info ");
        System.out.println("7. Close System ");
        int choice;
        Boolean a = true;
        while(a){
            choice = sc.nextInt();
            switch (choice) {
                case 1: account1.getBankInfo();
                    break;
                case 2: System.out.println("Enter amount to invest in PF: ");
                        double pfamount = sc.nextDouble();
                        account1.providentFund(pfamount);
                        System.out.println("PF balance: "+ account1.ProvidentFund);
                        break;
                case 3: BankCreditCard card = (BankCreditCard) account1; card.getCardInfo();
                        break;
                case 4: System.out.println("Enter amount to Credit: ");
                        double num = sc.nextDouble();
                        account1.creditTransaction(num);
                        System.out.println("Current Balance: "+ account1.balance);
                        break;
                case 5: System.out.println("Enter amount to debit: ");
                        double num2 = sc.nextDouble();
                        try{account1.debitTransaction(num2);}
                        catch(IllegalArgumentException i){
                            System.out.println(i);
                        }
                        finally{
                            System.out.println("Current Balance: "+ account1.balance);
                        }
                        break;
                case 6: try{account1.getPfinfo();}
                        catch(UnsupportedOperationException u){
                            System.out.println(u);
                        }
                        break;
                case 7: System.out.println("Closing System...");
                        a = false;
                        break;
                default:
                System.out.println("enter valid choice!!");
                    break;
                
                }
        }
        sc.close();
    }
}
