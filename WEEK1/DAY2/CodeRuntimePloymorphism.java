package WEEK1.DAY2;

class Animals {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dogs extends Animals {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class CodeRuntimePloymorphism {
    public static void main(String[] args) {
        Animals myAnimal = new Dogs(); // Upcasting
        myAnimal.sound(); // Dog's method is called
    }
}
