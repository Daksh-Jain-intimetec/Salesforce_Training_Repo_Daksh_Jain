package WEEK3.DAY1;

import java.util.*;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<Integer> orderset = new LinkedHashSet<>();
        orderset.add(12);
        orderset.add(34);
        orderset.add(56);
        orderset.add(34);
        orderset.add(23);
        orderset.add(65);
        orderset.add(34);
        orderset.add(56);
        orderset.add(45);
        orderset.add(65);
        System.out.print("Sorted element: "+ orderset);
        
    }
}
