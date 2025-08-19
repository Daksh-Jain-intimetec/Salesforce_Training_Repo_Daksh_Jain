package WEEK2;

import java.util.Scanner;

public class ThrowException2 {
    public static double parseNumber(String str) throws NumberFormatException{
        return Double.parseDouble(str);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.nextLine();
        try{
            System.out.println("String to integer: "+ parseNumber(s));
        } catch (NumberFormatException n){
            System.out.println("Not a Number ");
        }
        finally{
            sc.close();
        }
    }
}
