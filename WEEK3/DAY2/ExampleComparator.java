package WEEK3.DAY2;

import java.util.*;
class MyComparator implements Comparator<Students>{
    @Override
    public int compare(Students o1, Students o2) {
        return Double.compare(o1.getGpa(),o2.getGpa());
    }
}
class Students{
    String name;
    double gpa;

    public Students(String name, double gpa){
        this.name = name;
        this.gpa  = gpa;
    }
    public String getName(){
        return name;
    }
    public double getGpa(){
        return gpa;
    }
    @Override
    public String toString(){
        return "[Name: "+ name + ", GPA: " + gpa + "]";
    }   
}
public class ExampleComparator {
    public static void main(String[] args) {
        List<Students> student = new ArrayList<>();
        student.add(new Students("Pratik", 4.3));
        student.add(new Students("Vishal", 2.9));
        student.add(new Students("Ashish", 3.2));
        student.add(new Students("Aman", 2.2));
        
        System.out.println("Students List: ");
        for(Students s : student){
            System.out.println(s);
        }
        student.sort(new MyComparator());

        System.out.println("Sort by Weak Student on Top: ");
        for(Students s : student){
            System.out.println(s);
        }
    }
}
