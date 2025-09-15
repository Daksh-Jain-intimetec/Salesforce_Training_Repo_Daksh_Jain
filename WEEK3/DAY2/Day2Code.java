package WEEK3.DAY2;

import java.util.*;

public class Day2Code {
    public static void main(String[] args) {
        // Original list
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original List: " + numbers);

        
        int left = 0;
        int right = numbers.size() - 1;

        while (left < right) {
            
            Integer temp = numbers.get(left);
            numbers.set(left, numbers.get(right));
            numbers.set(right, temp);

            left++;
            right--;
        }

        System.out.println("Reversed List: " + numbers);
    }
}
