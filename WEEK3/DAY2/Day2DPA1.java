package WEEK3.DAY2;
import java.util.*;
public class Day2DPA1 {
    public static void main(String[] args) {
        // Creating an arraylist
        List<Integer> num = new ArrayList<>();
        num.add(24);
        num.add(28);
        num.add(23);
        num.add(21);
        System.out.println("List: " + num);

        //converting arraylist to array
        Integer[] arr = num.toArray(new Integer[0]);
        System.out.print("Array: [");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");

        //converting array to arraylist
        List<Integer> newlist = Arrays.asList(arr);
        System.out.println("Array to List: " + newlist);
    }
}
