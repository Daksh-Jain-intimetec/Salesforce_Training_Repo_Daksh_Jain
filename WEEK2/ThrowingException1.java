package WEEK2;
import java.util.Scanner;
public class ThrowingException1{
    public static double sqRoot(double num){
        if(num < 0){
            throw new IllegalArgumentException ("Negative number is not allowed");
        }
        return Math.sqrt(num);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        double n = sc.nextInt();
        try{
            double sqrt = sqRoot(n);
            System.out.println("SquareRoot of "+ n + " is: " + sqrt);
        } catch ( IllegalArgumentException e){
            System.out.println(e);
        }
        finally{
            sc.close();
        }

    }
}