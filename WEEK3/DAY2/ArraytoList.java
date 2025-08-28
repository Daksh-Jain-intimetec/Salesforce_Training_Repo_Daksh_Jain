package WEEK3.DAY2;

import java.util.*;

public class ArraytoList {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> al = Arrays.asList(arr); // List to Array
        for(int i=0;i<arr.length;i++){
            if(i%2 != 0){ // Print even numbers
                System.out.println(al.get(i));
                continue;
            }
        }
    }
}
