package WEEK3.DAY2;

import java.util.*;

class ListToArray{
    public static void main(String[] args) {
        List<String> fruitsList = Arrays.asList("Mango","Banana","Apple"); // list created;
        String[] fruits = fruitsList.toArray(new String[0]);

        Arrays.sort(fruits);// sort array in acending order

        for(String e : fruits){
            System.out.println(e);
        }
    }
}