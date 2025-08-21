package WEEK2;

import java.util.*;

class CustomerNotFoundException extends Exception{
    public CustomerNotFoundException(String message){
        super(message);
    }
}

public class ISPManagementSystem {
    public static final Map<String,String> customers = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        customers.put("CS111","DAKSH");
        customers.put("CS112","HARISH");
        customers.put("CS113","ANURAG");
        System.out.println("CID: CS111 -> NAME: DAKSH");
        System.out.println("CID: CS112 -> NAME: HARISH");
        System.out.println("CID: CS113 -> NAME: ANURAG");

        System.out.print("Enter CID to find customer: ");
        String CSID = sc.nextLine();
        try{
            findCustomer(CSID);
        } catch(CustomerNotFoundException c){
            System.err.println("Custom Error Caught: " + c.getMessage());
        }

        System.out.println("\n-----------------------------------\n");

        System.out.println("Enter PlanName(Not Empty): ");
        String planName = sc.nextLine();
        try{
            assignPlan(planName);
        } catch(IllegalArgumentException e){
            System.out.println("Runtime Error: "+ e.getMessage());
        }
        
        System.out.println("\n-----------------------------------\\n");

        try{
            verify(CSID);
        }catch(CustomerNotFoundException e ) {
            System.out.println(" Billing verification failed. Error Caught in Main() " + e.getMessage());
        }
        finally{
            sc.close();
        }
    }

    public static void findCustomer(String customerId) throws CustomerNotFoundException{
        System.out.println("-> Searching for customer: " + customerId);
        if(!customers.containsKey(customerId)){
            throw new CustomerNotFoundException("Customer With ID '" + customerId + "' does not exist.");            
        }
        else{
            System.out.println("   Success! Found customer: "+ customers.get(customerId));
        }
    }

    public static void assignPlan(String planName){
        System.out.println("-> Attempting to assign plan: '"+ planName + "'");
        if(planName == null || planName.isEmpty()){
            throw new IllegalArgumentException("Plan name cannot be empty or null.");
        }
        System.out.println("   Success! Plan assigned");
    }
     
    public static void verify(String customerId) throws CustomerNotFoundException{
        System.out.println("-> Verifying customer for billing...");
        findCustomer(customerId);
        System.out.println("Customer verified. Ready for billing.");
    }
}
