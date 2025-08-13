package WEEK1.DAY2;

import java.util.*;
class Member {
    public int ticketPrice = 1000;
    public String Greetings = "Hii ";
    public void ticket(String name){
        System.out.println(Greetings + name);
        System.out.println("Your Plan type is Normal");
        System.out.println("Your Ticket Price is " + ticketPrice);
    }
}
class PrimeMember extends Member {
    public void ticket(String name){
        System.out.println(Greetings + name);
        System.out.println("Your are our Prime Member, We are feeling glad to Welcome you");
        System.out.println("Your Ticket Price is inlcuded in your subscription" );
    }
}
public class CodeDPA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Member type (Prime/Normal): ");
        String plan = sc.nextLine().toLowerCase();
        System.out.println("Enter your Name : ");
        String Name = sc.nextLine();

        if(plan.equals("prime")){
            Member personMember = new PrimeMember();
            personMember.ticket(Name);
        } else if(plan.equals("normal")){
            Member persoMember = new Member();
            persoMember.ticket(Name);
        }
        sc.close();
    }
}
