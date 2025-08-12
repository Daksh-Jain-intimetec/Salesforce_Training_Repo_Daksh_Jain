import java.util.*;
public class CodeDPA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter Your Plan Type(premium/normal) : ");
         String plan = sc.nextLine().toLowerCase();
         System.out.println("Enter Amount : ");
         double amount = sc.nextDouble();
         double discount=0;
         if(plan.equals("premium")){
            discount = amount * 0.20;
         } else if (plan.equals("normal")){
            discount = amount * 0.05;
         }

         System.out.println("Final amount for "+ plan + " member is " + (amount-discount));
         sc.close();
    }
}
