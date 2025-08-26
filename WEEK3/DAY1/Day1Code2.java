package WEEK3.DAY1;

import java.net.URLStreamHandler;
import java.util.*;

class Plan{
    private int id;
    private String name;
    private double price;

    public Plan(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId(){return id;}
    public String getName(){return name;}
    public double getPrice(){return price;}


    // Override equals() and hashCode() so Set can check for duplicates
    @Override
    public boolean equals(Object obj){
        if(this == obj ) return true;
        if(!(obj instanceof Plan)) return false;
        Plan plan = (Plan) obj;
        return id == plan.id;
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(id);
    }

    @Override
    public String toString(){
        return "Plan{"+"id: "+id+", Name: "+name+", price: "+price+"}";
    }
}

public class Day1Code2 {
    public static void main(String[] args) {
        Set<Plan> planSet = new HashSet<>();

        planSet.add(new Plan(1,"Basic",199.0));
        planSet.add(new Plan(2, "Prime", 299.0));
        planSet.add(new Plan(3,"Ultra",599.0));
        planSet.add(new Plan(1,"duplicate basic",199.0));

        System.out.println("Is Set Empty: "+ planSet.isEmpty());

        System.out.println("Available Plan in Set");
        for(Plan p : planSet){
            System.out.println(p);
        }

        System.out.println("Total Plan: "+ planSet.size());

        System.out.println("Contain Basic Plan ??: "+ planSet.contains(new Plan(1,"Basic",199.0)));

        planSet.remove(new Plan(1,"Basic",199.0));
        System.out.println("After Removing basic Plan: "+ planSet);

        System.out.println("Iterating Plan: ");
        for(Plan p : planSet){
            System.out.println(p);
        }

        Iterator<Plan> itr = planSet.iterator();
        System.out.println("Iterating using Iterator: ");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // union with another set
        Set<Plan> newplan = new HashSet<>();
        newplan.add(new Plan(4,"Premium",249.99));
        newplan.add(new Plan(5,"Student",99.99));
        planSet.addAll(newplan);

        //retainAll func( intersection operation)
        Set<Plan> retainSet = new HashSet<>();
        retainSet.add(new Plan(3, "Ultra", 599.0));
        retainSet.add(new Plan(4, "Premium", 249.99));
        retainSet.add(new Plan(5, "Student", 99.99));
        planSet.retainAll(retainSet);
        System.out.println("After retaining Set: "+ planSet);

        planSet.clear();
        System.out.println("After Clear: "+ planSet);
        System.out.println("Is Set Empty now: "+planSet.isEmpty());


    }
}
