package WEEK1;

import java.util.*;
import java.util.Locale.Category;


enum EmployeeCategory {
    MANAGER, STAFF, INTERN;
}
class User {
    private int id;
    private String name;
    private String email;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", name='" + name + "', email='" + email + "'}";
    }
}

class Plan {
    private int id;
    private String planName;
    private double price;

    public Plan(int id, String planName, double price) {
        this.id = id;
        this.planName = planName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Plan{id=" + id + ", planName='" + planName + "', price=" + price + "}";
    }
}

class Employee {
    private int id;
    private String name;
    private EmployeeCategory category;

    public Employee(int id, String name, EmployeeCategory category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', category=" + category + "}";
    }
}

class ManagementSystem {
    private List<User> users = new ArrayList<>();
    private List<Plan> plans = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void addPlan(Plan plan) {
        plans.add(plan);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }


    public void showUsers() {
        if(users.isEmpty()){
            System.out.println("No user data available....");
        } else{
            System.out.println("\nUsers in System:");
            for (User u : users) System.out.println(u);
        }
    }

    public void showPlans() {
        if(plans.isEmpty()){
            System.out.println("No Plan data available....");
        } else {
            System.out.println("\nAvailable Plans:");
            plans.forEach(System.out::println);
        }
    }

    public void showEmployees() {
        if(employees.isEmpty()){
            System.out.println("No employee data available...");
        } else {
            System.out.println("\nEmployees in System:");
            employees.forEach(System.out::println);
        }
    }
}

public class Assignment {
    public static void main(String[] args) {
        ManagementSystem system = new ManagementSystem();

        boolean exit = false;
        int user_id = 0;
        int emp_id = 0;
        int plan_id = 0;
        Scanner sc = new Scanner(System.in);
        while(exit == false){
            System.out.println("Select From option");
            System.out.println("1. Add New User");
            System.out.println("2. Add New Emplyoee");
            System.out.println("3. Add New Plan");
            System.out.println("4. Show Users");
            System.out.println("5. Show Plan list");
            System.out.println("6. Show Employees");
            System.out.println("7. Exit");
            int choice = 0;
            try{
                choice = sc.nextInt();
            } catch(InputMismatchException e){
                System.out.println(e + " : only Integer value is allowed....");
                sc.nextLine(); // Clear the invalid input from scanner buffer
            }
            switch (choice) {
                case 1: System.out.println("Enter User Name: ");
                        String usrName = sc.next();
                        System.out.println("Enter User mail: ");
                        String mail = sc.next();
                        user_id++;
                        system.addUser(new User(user_id,usrName,mail));
                        System.out.println("----------------------------------------------");
                    break;
                case 2: System.out.println("Enter Employee Name: ");
                        String empName = sc.next();
                        System.out.println("Enter Employee Category: ");
                        String empCategory = sc.next().toUpperCase();
                        emp_id++;
                        try{
                            EmployeeCategory category = EmployeeCategory.valueOf(empCategory);
                            system.addEmployee(new Employee(emp_id,empName,category));
                            System.out.println("----------------------------------------------");
                        } catch(IllegalArgumentException e){
                            System.out.println(e + ": Employee Category not Found!!!");
                            System.out.println("----------------------------------------------");
                        }
                        
                        break;
                case 3: System.out.println("Enter Plan Name:");
                        String planName = sc.next();
                        System.out.println("Enter Plan Price: ");
                        double price = sc.nextDouble();
                        plan_id++;
                        system.addPlan(new Plan(plan_id, planName, price));
                        System.out.println("----------------------------------------------");
                        break;
                case 4: system.showUsers();
                        System.out.println("----------------------------------------------");
                        break;
                case 5: system.showPlans();
                        System.out.println("----------------------------------------------");        
                        break;
                case 6: system.showEmployees(); 
                        System.out.println("----------------------------------------------");
                        break;
                case 7: exit = true;
                        System.out.println("Closing System........................");
                        break;
                default:System.out.println("Enter valid choice from below options....");
                        System.out.println("----------------------------------------------");
                    break;
            }
        }     
        sc.close(); 
    }
}

