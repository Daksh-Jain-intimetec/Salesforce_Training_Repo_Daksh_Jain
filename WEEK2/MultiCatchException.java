package WEEK2;

import java.util.*;

public class MultiCatchException {
    public static void main(String[] args) {
        int[] arr = {23,24,25,26};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Index : ");
        try{
            int k = sc.nextInt();
            System.out.println("Number at Index is : " + arr[k]);
            sc.close();
        }catch(ArrayIndexOutOfBoundsException | NumberFormatException e){
            System.out.println("try again with valid input: "+ e);
}   }   }
