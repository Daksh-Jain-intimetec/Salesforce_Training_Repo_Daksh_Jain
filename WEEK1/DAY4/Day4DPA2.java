package WEEK1.DAY4;

class A {
    //First constructor
    public A(){
        this("I am called by first const.");
        System.out.println("I am first, second is called successfully");
    }
    //second const.
    public A(String msg){
        System.out.println("hello i am second const." + msg);
    }
   public void end(){
        System.out.println("Compile successfully");
    }
}

public class Day4DPA2 {
    public static void main(String[] args) {
        A a = new A();
        a.end();
    }
}
