package WEEK2;

class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
class Bank {
    private double balance = 1000;

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new InsufficientBalanceException("Not enough balance!");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + ", Remaining: " + balance);
    }
}

public class TestCustomException2 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.withdraw(1200); // will throw exception
    }
}
