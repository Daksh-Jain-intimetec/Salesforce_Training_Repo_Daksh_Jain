package WEEK3.DAY1;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> num = new HashSet<>();
        num.add(100);
        num.add(200);
        num.add(50);
        num.add(23);
        num.add(100);
        num.add(23);
        System.out.println(num);
    }
}
