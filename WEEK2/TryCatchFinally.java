package WEEK2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator Turn 'ON' ");
        System.out.println("Enter two num to divide: ");
        try {
            int n = sc.nextInt();
            int d = sc.nextInt();
            int div = n/d;
            System.out.println("Division: " + div);
        } catch(ArithmeticException e){
            System.out.println("Cannot divide by Zero");
        } catch(InputMismatchException e){
            System.out.println("Only Integer is Allowed");
        }finally{
            System.out.println("Calculator Turn 'OFF' ");
            sc.close();
        }
    }
}
