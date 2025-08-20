package WEEK2;

import java.util.Scanner;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
public class TestCustomException {
    public static void Validate(int age) throws InvalidAgeException{
        if(age<18 || age>110){
            throw new InvalidAgeException("Invalid Age Restriction");
        }else{
            System.out.println("Valid Age...");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();
        try{
            Validate(age);
        }catch(InvalidAgeException i){
            System.out.println("Custom Exception Caught: "+ i.getMessage());
        }
        finally{
            sc.close();
        }
    }    
}
