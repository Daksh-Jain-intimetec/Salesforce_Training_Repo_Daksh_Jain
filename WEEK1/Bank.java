package WEEK1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

enum AccountType{
    SavingsAccount, CurrentAccount;
}
abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    protected double balance;
    protected AccountType acType;

    public BankAccount(int accountNumber, String holderName, double balance){
        this.accountNumber = accountNumber;
        this .holderName = holderName;
        this.balance = balance;
    }

    public int getAccountNumber(){ 
        return accountNumber;
    }
    public String getHolderName(){
        return holderName;
    }
    public double getBalance(){
        return balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    @Override
    public String toString() {
        return "Account Number: " + accountNumber +
               ", Holder Name: " + holderName +
               ", Balance: " + balance +
               ", Account Type: " + acType;
    }
}
class SavingsAccount extends BankAccount{
    public SavingsAccount(int accountNumber, String name, double amount){
        super(accountNumber,name,amount);
        acType = AccountType.valueOf("SavingsAccount");
    }

    @Override
    public void deposit(double amount){
        balance += amount;
    }
    
    @Override
    public void withdraw(double amount){
        if(amount<=balance && amount > 0){
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Balance: " + balance);
        }
        else{
            System.out.println("Insufficient Balance!");
        }
    }
}

class CurrentAccount extends BankAccount{
    private double overdraftLimit = 10000;

    public CurrentAccount(int accountNumber, String name, double bal){
        super(accountNumber, name, bal);
        acType = AccountType.valueOf("CurrentAccount");
    }

    @Override
    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited...., New Balance: "+ balance);
    }

    @Override
    public void withdraw(double amount){
        if(amount <= (balance + overdraftLimit)){
            balance -= amount;
            System.out.println("Withdrawn: "+amount +"| Balance: "+ balance);
        }
        else {
            System.out.println("Excees overdraft limit!");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<BankAccount> accounts = new ArrayList<>();

        int acnum = 1;
        boolean exit = false;
        while (!exit) {
            System.out.println("Banking Menu:");
            System.out.println("1. Show Accounts");
            System.out.println("2. Open SavingsAccount");
            System.out.println("3. Open Current Account");
            System.out.println("4. Deposit");
            System.out.println("5. Withdraw");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: if(!accounts.isEmpty()){
                            accounts.forEach(System.out::println);
                        }else{
                            System.out.println("No account details available..");
                        }
                    
                    break;
                case 2: System.out.println("Enter Name: ");
                        sc.nextLine();
                        String sName = sc.nextLine();
                        System.out.println("Enter Deposit Balance:");
                        double sAmount = sc.nextDouble();
                        BankAccount acc1 = new SavingsAccount(acnum, sName, sAmount);
                        System.out.println("Welcome, Your SavingsAccount is Created...");
                        accounts.add(acc1);
                        acnum++;
                        break;
                case 3: System.out.println("Enter Name: ");
                        sc.nextLine(); 
                        String cName = sc.nextLine();
                        System.out.println("Enter Deposit Balance:");
                        double cAmount = sc.nextDouble();
                        BankAccount acc2 = new CurrentAccount(acnum, cName, cAmount);
                        System.out.println("Welcome, Your CurrentAccount is Create...");
                        accounts.add(acc2);
                        acnum++;
                        break;
                case 4:
                    System.out.print("Enter account number: ");
                    int accNoD = sc.nextInt();
                    System.out.print("Enter deposit amount: ");
                    double amtD = sc.nextDouble();
                    for (BankAccount acc : accounts) {
                        if (acc.getAccountNumber() == accNoD) {
                            acc.deposit(amtD); 
                        }
                    }
                    break;
                case 5:
                    System.out.print("Enter account number: ");
                    int accNoW = sc.nextInt();
                    System.out.print("Enter withdraw amount: ");
                    double amtW = sc.nextDouble();
                    for (BankAccount acc : accounts) {
                        if (acc.getAccountNumber() == accNoW) {
                            acc.withdraw(amtW);  
                        }
                    }
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting Banking System...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }
}
