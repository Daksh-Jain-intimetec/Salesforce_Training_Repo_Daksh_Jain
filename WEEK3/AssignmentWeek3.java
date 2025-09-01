package WEEK3;
// Write Java code that : 
// Stores internet plans in a collection
// Searches for a plan based on dynamic attributes(price, speed, validity)
// Sorts plans based on different parameters(price low to high, speed low to high, type 2g,4g,5g)

import java.util.*;

class PriceComparator implements Comparator<Plan>{
    @Override
    public int compare(Plan o1, Plan o2) {
        return Double.compare(o1.getPlanPrice(),o2.getPlanPrice());
    };
}
class SpeedComparator implements Comparator<Plan>{
    @Override
    public int compare(Plan o1, Plan o2){
        return Double.compare(o1.getSpeed(), o2.getSpeed());
    }
}
class ValidityComparator implements Comparator<Plan>{
    @Override
    public int compare(Plan o1, Plan o2){
        return o1.getValidity() - o2.getValidity();
    }
}
class Plan {
    private String planName = null;
    private double planPrice;
    private double speed;
    private int validity;

    public Plan(String planName, double planPrice,double speed ,int validity){
        this.planName = planName;
        this.planPrice = planPrice;
        this.speed = speed;
        this.validity = validity;
    }

    public double getPlanPrice() {
        return planPrice;
    }

    public double getSpeed() {
        return speed;
    }

    public int getValidity() {
        return validity;
    }

    @Override
    public String toString() {
        return "[ " + planName + " : Rs" + planPrice + ", " + speed + "Mbps, " + validity + " days ]";

    }
}
class AssignmentWeek3{
    public static int operations() throws InputMismatchException{
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter operation: \n1. Search Plan \n2. Sort Plan \n3. Plan List");
        int choice = sc.nextInt();
        return choice;
    }
    public void bestPricePlan(List<Plan> planList, double amount){

    }
    public static void searchPlan(List<Plan> planList) throws InputMismatchException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Search Plan According to :");
        System.out.println("1. Price ");
        System.out.println("2. Speed ");
        System.out.println("3. Validity ");
        int input = sc.nextInt();
        switch (input) {
            case 1: System.out.println("Enter amount: ");
                    double amount = sc.nextInt();
                    planList.sort(new PriceComparator());
                    Plan smaller = null, Larger = null;
                    System.out.println("Here is the Best Available Plan for you");
                    for(Plan p : planList){
                        if(p.getPlanPrice() == amount){
                            System.out.println(p);
                            break;
                        }else{
                            if(p.getPlanPrice() < amount){
                                smaller = p;
                            }else{
                                Larger = p;
                                break;
                            }
                        }
                    }
                    if(! (smaller == null)){
                        System.out.println(smaller);
                    }
                    if(!(Larger == null)){
                        System.out.println(Larger);
                    }
                break;
            case 2: System.out.println("Enter Speed(30/40/60/80/100)Mbps : ");
                    double inspeed = sc.nextDouble();
                    int count = 0;
                    for(Plan p : planList){
                        if(p.getSpeed() == inspeed){
                            System.out.println(p);
                            count++;
                        }
                        
                    }
                    if(count == 0){
                        throw new InputMismatchException(" Enter Valid Speed....");
                    }
                    break;
            case 3: System.out.println("Enter Number of Days (28/56/84)");
                    int indays = sc.nextInt();
                    int count2 = 0;
                    for(Plan p : planList){
                        if(p.getValidity() == indays){
                            System.out.println(p);
                            count2++;
                        }
                    }
                    if(count2 == 0){
                        throw new InputMismatchException("Enter valid Number of Days...");
                    }
                    break;
            default: System.out.println("Enter from 1/2/3 only.");
                break;
        }
    }

    public static void sortPlan(List<Plan> planList) throws InputMismatchException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Sort Plan According to :");
        System.out.println("1. Price Low to High ");
        System.out.println("2. Speed Low to High ");
        System.out.println("3. Validity Low to High ");
        int input = sc.nextInt();
        switch (input) {
            case 1: planList.sort(new PriceComparator());
            System.out.println("Showing Plan Price Low to High");
                    for(Plan p : planList){
                        System.out.println(p);
                    }
                break;
            case 2: planList.sort(new SpeedComparator());
                    System.out.println("Showing Plan Speed Low to High");
                    for(Plan p : planList){
                        System.out.println(p);
                    }
                break;
            case 3: planList.sort(new ValidityComparator());
                    System.out.println("Showing Plan Validity Low to High");
                    for(Plan p : planList){
                        System.out.println(p);
                    }
                break;
            default: System.out.println("Enter Input 1/2/3");
                break;
        }
    }
    public static void planList(List<Plan> planList){
        for(Plan p : planList){
            System.out.println(p);
        }
    }
    public static void main(String[] args) {
        List<Plan> planList = new ArrayList();
        planList.add(new Plan("Basic", 99.99, 30, 28));
        planList.add(new Plan("Advance2", 299, 60, 56));
        planList.add(new Plan("UltraMax", 699.99, 100, 84));
        planList.add(new Plan("Prime", 149.99, 40, 28));
        planList.add(new Plan("Advance3", 399, 80, 56));
        planList.add(new Plan("Prime2", 199.99, 60, 28));
        planList.add(new Plan("Advance", 249.99, 40, 56));
        planList.add(new Plan("Ultra1", 549.99, 60, 84));

        int ops =0;
        try{ ops = operations();}
        catch(InputMismatchException e){
            System.out.println(e + " : Enter valid Input");
        }
        switch(ops){
            case 1: try{
                        searchPlan(planList);
                    } catch(IllegalArgumentException e){
                        System.out.println(" : Enter Integer Only(1/2/3)");
                    }
                break;
            case 2: try{ sortPlan(planList);}
                    catch (InputMismatchException e){
                        System.out.println(e + " : Enter valid input");
                    }
                break;
            case 3: planList(planList);
                break;
            default: System.out.println("Select From Operation 1 and 2...");
                break;
        }
        
    }
}