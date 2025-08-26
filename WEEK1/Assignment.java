package WEEK1;

import java.util.*;


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
        System.out.println("\nUsers in System:");
        for (User u : users) System.out.println(u);
    }

    public void showPlans() {
        System.out.println("\nAvailable Plans:");
        plans.forEach(System.out::println);
    }

    public void showEmployees() {
        System.out.println("\nEmployees in System:");
        employees.forEach(System.out::println);
    }
}

public class Assignment {
    public static void main(String[] args) {
        ManagementSystem system = new ManagementSystem();


        system.addUser(new User(1, "Daksh", "daksh@example.com"));
        system.addUser(new User(2, "Riya", "riya@example.com"));


        system.addPlan(new Plan(101, "Basic", 99.99));
        system.addPlan(new Plan(102, "Premium", 199.99));


        system.addEmployee(new Employee(201, "Arjun", EmployeeCategory.MANAGER));
        system.addEmployee(new Employee(202, "Meena", EmployeeCategory.STAFF));
        system.addEmployee(new Employee(203, "Karan", EmployeeCategory.INTERN));


        system.showUsers();
        system.showPlans();
        system.showEmployees();
    }
}

