# DAY 4

## Upcasting Vs Downcasting in Java

Typecasting is one of the most important concepts which basically deals with the conversion of one data type to another datatype implicitly or explicitly.
Just like the data types, the objects can also be typecasted. However, in objects, there are only two types of objects, i.e. parent object and child object. Therefore, typecasting of objects basically means that one type of object (i.e.) child or parent to another. There are two types of typecasting. They are: 
1. Upcasting: Upcasting is the typecasting of a child object to a parent object. Upcasting can be done implicitly. Upcasting gives us the flexibility to access the parent class members but it is not possible to access all the child class members using this feature. Instead of all the members, we can access some specified members of the child class. For instance, we can access the overridden methods.
2. Downcasting: Similarly, downcasting means the typecasting of a parent object to a child object. Downcasting cannot be implicit.

What?
Upcasting: Converting a child object reference to a parent type.
Downcasting: Converting a parent reference back to a child type.

Why?
To achieve polymorphism — treating different subclasses in a common way.
To access child-specific methods (downcasting).

Where?
In method arguments where a superclass type is expected.
In collections that store parent references.

When?
Upcasting: When you only need to use superclass methods.
Downcasting: When you specifically need subclass behavior.

## Implementing an Interface
In Java, an interface defines a set of abstract methods that a class must implement. When a class implements an interface, it provides the actual code for these methods. This is useful for defining contracts between unrelated classes, enabling polymorphism.
Example:
interface Animal { void sound(); }
class Dog implements Animal {
    public void sound() { System.out.println("Bark"); }
}

## Legal Return Types

A legal return type is any data type that matches or is compatible with the method’s declared return type. For example, if a method declares int as its return type, it must return an int value. If it declares a parent class type, you can return any subclass object (covariant return).

## Return Type Declarations

When defining a method, you must declare the type of value it returns. This helps the compiler check type safety. Example:

int sum() { return 5; } // returns int
String getName() { return "Daksh"; } // returns String

## Returning a Value

A method can return a value using the return keyword followed by a value or variable. The returned value must match the declared return type. For void methods, you can use return; to exit without a value.

## Constructors and Instantiation
A constructor is a special method in a class that initializes objects when they are created. Instantiation means creating an object from a class using the new keyword, which calls the constructor. 
Example:

class A { A() { System.out.println("Object created"); } }
A obj = new A();

## Overloaded Constructors
Constructor overloading means having multiple constructors in the same class with different parameter lists. This allows objects to be initialized in different ways. 
Example:

class Person {
    Person() {}
    Person(String name) {}
    Person(String name, int age) {}
}
### Day4Code1 - example of upcasting and downcasting of an object.
### InterfaceImplementation - Create a program with using interface.

## Daily Practice Assignment

### Does below code compile successfully? If not, why? (Day4DPA1)

### What happens if you keep a return type for a constructor?

1. A constructor is identified only by its name matching the class name and having no return type.

2. If you add any return type (void, int, String, etc.), the compiler treats it as a method.

3. The constructor is called automatically when you create an object with new.

4. A method with the same name as the class but with a return type is just a regular method — it will not run automatically during object creation.

### Write a program to display way of calling the second constructor from the first constructor. (Day4DPA2).
