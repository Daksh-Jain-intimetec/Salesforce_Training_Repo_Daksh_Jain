package WEEK3.DAY2;

import java.util.*;
class Student implements Comparable<Student>{
    private String name;
    private int roll_no;

    public Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
    public int getRollNo(){return roll_no;}
    public String getName(){return name;}
    @Override
    public String toString(){
        return "[Roll_No.: " + roll_no + ", Name: " + name + "]";
    }
    @Override
    public int compareTo(Student o) {
        return this.roll_no - o.roll_no;
    }
}
public class ExampleComparable {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(2, "Daksh"));
        students.add(new Student(4, "Harish"));
        students.add(new Student(1, "Anurag"));
        students.add(new Student(3, "Gulyawar"));
        System.out.println("Befor Sort order: ");
        for(Student s : students){
            System.out.println(s);
        }
        students.sort(null);

        System.out.println("After Sort order: ");
        for(Student s : students){
            System.out.println(s);
        }
    }
}
