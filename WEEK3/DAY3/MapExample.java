package WEEK3.DAY3;

import java.util.*;
public class MapExample {
    private static void printMap(Map<Integer, String> m){
        Set<Integer> keys = m.keySet();
        for(Integer i : keys){
            System.out.println(i + " = " + m.get(i));
        }
    }
    public static void main(String[] args) {
        Map<Integer, String> httpError = new LinkedHashMap<>();
        httpError.put(100,"Network Error");
        httpError.put(400, "Site not Found Error");
        httpError.put(900, "Server Down");
        httpError.put(300, "Unauthorized Access!!");
        System.out.println("LinkedMap");
        printMap(httpError);

        Map<Integer,String> hashmap = new HashMap<>(httpError);
        System.out.println("HashMap");
        printMap(hashmap);

        Map<Integer,String> treeMap = new TreeMap<>(httpError);
        System.out.println("TreeMap");
        printMap(treeMap);

    }
}
