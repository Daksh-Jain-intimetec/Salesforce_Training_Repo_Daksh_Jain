package WEEK3.DAY2;
import java.util.*;
public class ListExample2 {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Arman");
        students.add("Vijay");
        students.add("Gurav");
        students.add("Gurav");
        students.add("Vijay");

        System.out.println("List with duplicates: "+students);
        Set<String> finalstudents = new LinkedHashSet<>(students);
        System.out.println("List After removing duplicates: "+ finalstudents);
    }
}
