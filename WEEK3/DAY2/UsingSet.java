package WEEK3.DAY2;
import java.util.*;
public class UsingSet {
    public static void main(String[] args) {
        Set<Integer> num = new LinkedHashSet<>();
        num.add(1);
        num.add(3);
        num.add(2);
        num.add(6);
        num.add(7);
        num.add(2);
        num.add(4);
        System.out.println("LinkedHashSet: " + num);
        Set<Integer> num2 = new TreeSet<>(num);
        System.out.println("TreeSet: "+ num2);
        Set<Integer> num3= new HashSet<>(num);
        System.out.println("HashSet: "+ num3);
    }
}
