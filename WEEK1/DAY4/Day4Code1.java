package WEEK1.DAY4;

class Animal { 
    public Animal(){
        System.out.println("Animal Constructor Called");
    }
    void onlyAnimal(){
        System.out.println("Your are in animal");
    }
    void sound() { 
        System.out.println("Animal sound"); 
    } 
}
class Dog extends Animal { 
    public Dog(){
        System.out.println("Dog Constructor called");
    }
    void sound(){
        System.out.println("dog sound");
    }
    void bark() { 
        System.out.println("Dog bark"); 
    } 
}

public class Day4Code1 {
    public static void main(String[] args) {
        Animal a = new Dog(); // Upcasting
        a.sound();
        Dog d = (Dog) a; // Downcasting
        d.sound();
        d.bark();
        Dog dog = new Dog();
        Animal an = new Animal();
        dog.sound();
        an.sound();
        Animal updog = dog;
        updog.onlyAnimal();

    }
}
