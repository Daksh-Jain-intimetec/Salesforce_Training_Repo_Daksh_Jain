package WEEK2;

class Parent {
        void display() {
            System.out.println("Inside Parent's display method");
        }
    }

class Child extends Parent {
        @Override
        void display() {
            System.out.println("Inside Child's display method");
        }
    }

public class Example {
        public static void main(String[] args) {
            Parent obj = new Child(); // Parent reference, Child object
            obj.display(); // Calls Child's overridden display method
        }
    }
