package WEEK3.DAY3;
import java.util.*;
public class Code1DPA1 {
    public static String getPlan(Integer i, TreeMap<Integer, String> planList){
        if(planList.containsKey(i)){
            return i + " = "+ planList.get(i);
        }else{
            Integer small = planList.lowerKey(i);
            Integer large = planList.higherKey(i);
            if(planList.containsKey(small) && planList.containsKey(large)){
                return small + " = " + planList.get(small) + "\n" + large + " = " + planList.get(large) ;
            }
            else if(planList.containsKey(small) && large == null){
                return small + " = " + planList.get(small);
            }
            else{
                return large + " = " + planList.get(large);
            }
        }
    }
    public static void main(String[] args) {
        TreeMap<Integer, String> planList = new TreeMap<>();
        planList.put(600, "validity 54days, 2GB/day, 60Mbps, Unlimited Call/SMS");
        planList.put(800, "validity 84days, 2GB/day, 100Mbps, Unlimited Call/SMS");
        planList.put(3000, "validity 355days, 2GB/day, 120Mbps, Unlimited Call/SMS, Free JIOHOTSTAR");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the plan price: ");
        Integer price = sc.nextInt();

        System.out.println("Best Plan");
        System.out.println(getPlan(price, planList));
        
        sc.close();
    }
     
}
