package WEEK3.DAY3;

import java.util.*;

public class HashMapExample {
    public static void printMap(Map<Character,Integer> m){
        Set<Character> keys = m.keySet();
        for(Character i : keys){
            System.out.println(i + " = " + m.get(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character,Integer> CountFrequencyMap = new HashMap<>();
        System.out.println("Enter Your Word: ");
        String word = sc.next().toUpperCase();
        char[] letter = word.toCharArray();
        for(int i=0;i<letter.length;i++){
            Character lett = Character.valueOf(letter[i]);
            if(CountFrequencyMap.containsKey(lett)){
                Integer value = CountFrequencyMap.get(lett);
                value++;
                CountFrequencyMap.put(lett,value); 
            }
            else{
                CountFrequencyMap.put(lett,1); // m.put(a, (freq == null) ? 1 : freq + 1);
            }
        }
        printMap(CountFrequencyMap);
        sc.close();
    }
}
