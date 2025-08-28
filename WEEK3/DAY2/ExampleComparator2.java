package WEEK3.DAY2;

import java.util.*;
public class ExampleComparator2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,4,3,7,5,2);
        System.out.println(numbers);
        numbers.sort((a,b) -> a - b); // using lamda expression;
        System.out.println(numbers);
    }
}
