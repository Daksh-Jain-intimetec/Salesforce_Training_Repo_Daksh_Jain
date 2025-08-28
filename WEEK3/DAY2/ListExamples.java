package WEEK3.DAY2;

import java.util.*;

public class ListExamples {
    public static void main(String[] args) {
        List<String> name = new ArrayList();
        name.add("Alice");
        name.add("Bob");
        name.add("carter");
        name.add("Alice");

        for(int i=name.size()-1;i>=0;i--){
            System.out.println(name.get(i));
        }
    }
}
