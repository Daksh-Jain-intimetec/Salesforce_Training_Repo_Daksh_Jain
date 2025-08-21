package WEEK3.DAY1;

import java.util.*;

public class SetExample2 {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        
        if(fruits.contains("Apple"))
        System.out.println("Set Contain Apple");
        else{System.out.println("No Apple in Set.");}
        

        if(fruits.contains("Mango"))
        System.out.println("Contain Mango");
        else{System.out.println("No Mango in Set.");}
    }
}
