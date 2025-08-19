package WEEK2;

import java.util.Scanner;

public class ThrowingException2 {
    public static String eligibility(int age){
        if(age < 18){
            throw new RuntimeException("Not Eligible for Voting");
        }
        return "Eligible for Voting";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();
        try{
            System.out.println("You are " + eligibility(age));
        } catch (RuntimeException r){ System.out.println(r);}
        finally{
            sc.close();
        }
    }
}
