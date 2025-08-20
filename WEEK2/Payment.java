package WEEK2;

import java.util.Scanner;

class PaymentSystem{
    protected float Balance = 10000;
    protected String Name = null;
    public PaymentSystem(String Name){
        this.Name = Name;
    }
    public float getbal(){
        return Balance;
    }
    public void pay(float amount){
        Balance -= amount;
        System.out.println("Amount "+ amount +" is Paid....");
        System.out.println("Your Current Balance: "+ Balance);
    }
    public void refundStatus(){
        throw new UnsupportedOperationException("Unavialable Option.");
    }

}

public class Payment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = sc.nextLine();
        PaymentSystem p = new PaymentSystem(name);
        boolean a = true;
        while(a){
            System.out.println("Option ");
            System.out.println("1. PAY");
            System.out.println("2. REFUND STATUS");
            System.out.println("3. Get balance");
            System.out.println("4. Close System...");
            int choice = sc.nextInt();
                switch(choice) {
                case 1: System.out.println("Enter amount you want to pay.");
                        float amount = sc.nextFloat();
                        p.pay(amount);
                        break;
                case 2: try{p.refundStatus();}
                        catch(UnsupportedOperationException u){ System.out.println(u);}
                        break;
                case 3: System.out.println("current Balance: "+ p.getbal());
                        break;
                case 4: System.out.println("Closing System Down.....");
                        a = false;
                        break;
                default : break;
            }
        }
        sc.close();
    }
}
