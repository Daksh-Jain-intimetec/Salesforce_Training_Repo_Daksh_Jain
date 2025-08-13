package WEEK1.DAY3;

import java.util.*;

abstract class Shape{
    abstract public double area();
    abstract public double circumference();
}
class Circle extends Shape{
    double radius = 0;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double area(){
        double Area = 3.14*radius*radius;
        return Area;
    }
    @Override
    public double circumference(){
        double cir = 2*3.14*radius;
        return cir;
    }
}
class Rectangle extends Shape{
    double len=0;
    double widt=0;
    public Rectangle(double len, double widt){
        this.len = len;
        this.widt = widt;
    }
    @Override
    public double area(){
        double Area = len*widt;
        return Area;
    }
    @Override
    public double circumference(){
        double cir = 2*(len+widt);
        return cir;
    }
}
public class Day3Code1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your shape(Circle/Rectangle) : ");
        String shape = sc.nextLine().toLowerCase();
        Shape s ;
        if(shape.equals("circle")){
            System.out.println("Enter Radius of Circle: ");
            double radius = sc.nextDouble();
            s = new Circle(radius);
            System.out.println("Area of Circle is : " + s.area()) ;
            System.out.println("Circumference of Circle is : " + s.circumference());
        }else if (shape.equals("rectangle")){
            System.out.println("Enter Length: ");
            double len = sc.nextDouble();
            System.out.println("Enter width: ");
            double widt = sc.nextDouble();
            s = new Rectangle(len, widt);
            System.out.println("Area of Rectangle is : "+ s.area());
            System.out.println("Circumference of Reactangle is : " + s.circumference());
        }
        sc.close();
    }
}
