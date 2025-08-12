# DAY 2 - OOPS

## Encapsulation
Definition: Wrapping data (variables) and methods that operate on them into a single unit (class), while restricting direct access to the variables using private and providing public getters/setters.

Uses of Encapsulation in Java
Using encapsulation in Java has many benefits:

1. Data Hiding: The internal data of an object is hidden from the outside world, preventing direct access.
2. Data Integrity: Only validated or safe values can be assigned to an object’s attributes via setter methods.
3. Reusability: Encapsulated code is more flexible and reusable for future modifications or requirements.
4. Security: Sensitive data is protected as it cannot be accessed directly

#### CodeEncapsulation - Create a banking System with deposit and withdrawl feature using Encapsulation.

## Inheritance in Java

Java Inheritance is a fundamental concept in OOP(Object-Oriented Programming). It is the mechanism in Java by which one class is allowed to inherit the features(fields and methods) of another class. In Java, Inheritance means creating new classes based on existing ones. A class that inherits from another class can reuse the methods and fields of that class.

#### CodeIheritance - Create a Program to make an Animal Class which is used to be inherited by other types of animal classes.

Note: In practice, inheritance and polymorphism are used together in Java to achieve fast performance and readability of code.

## Polymorphism in Java

Polymorphism in Java is one of the core concepts in object-oriented programming (OOP) that allows objects to behave differently based on their specific class type. The word polymorphism means having many forms, and it comes from the Greek words poly (many) and morph (forms), this means one entity can take many forms. In Java, polymorphism allows the same method or object to behave differently based on the context, specially on the project's actual runtime class.

### Types of Polymorphism in Java
In Java Polymorphism is mainly divided into two types: 

1. Compile-Time Polymorphism (Static)
Method Overloading - when multiple methods in the same class have the same name but different parameters.

#### Code to show Method OverLoading (Compile-time Polymorphism).

2. Runtime Polymorphism (Dynamic)
Method Overriding - when a subclass provides a specific implementation of a method that is already defined in its > >  superclass. The method in the subclass must have the same name, return type, and parameters as the method in the  superclass. Method overriding allows a subclass to modify or extend the behavior of an existing method in the parent >  class.

#### Code to Show Method overriding (Runtime Polymorphism).

## Daily Practice Assignments

1. Write a program to override a plan for specific sets of users.
   For example → Provide some extra advantage to prime users. (**Ans - CodeDPA1**)
2. Write a program to demonstrate runtime polymorphism and Compile time polymorphism.(**Ans - CodeDPA2** - Hero fight game.)