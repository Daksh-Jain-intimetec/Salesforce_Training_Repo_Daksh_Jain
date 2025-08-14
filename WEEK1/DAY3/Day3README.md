# DAY 3- Abstraction and Interface

## Abstraction (what it is & how Java supports it)

**Short idea**: Abstraction means showing what an object does and hiding how it does it. It focuses on the essential features of an object while hiding implementation details.

How Java provides abstraction

1. Abstract classes — can contain abstract methods (no body) and concrete methods (with body), fields, constructors. Use when you want to share code/state between related classes.

2. Interfaces — define a contract (methods a class must implement). Since Java 8 interfaces may have default and static methods; since Java 9 they can also have private methods.

### Day3Code1 : Program to find area of diff shape using abstact class and abstract methods.

1. What’s the problem without abstract classes?
- If you just use normal classes, there’s nothing stopping someone from creating an object of a class that’s meant only to be a “blueprint.”
2. How abstract class solves this ?
- An abstract class:
Cannot be instantiated directly.
Can have abstract methods (no body) that must be overridden.
Can also have normal methods for shared code.
3. Why not just use a normal class with empty methods?
- If you use a normal class with an empty method, subclasses are not forced to override it — they might forget, leading to incorrect behavior.
Abstract methods enforce that every subclass must provide an implementation.
It’s a form of contract between the base class and subclasses.
4. When to use abstract classes ?
- Use abstract class when:
You have a common base but don’t want it instantiated directly.
You want to force certain methods to be implemented in all subclasses.
You want to provide shared code for all subclasses.

## Interfaces (what it is & its evolution..)

Short idea: An interface is a contract that classes can implement. It expresses capabilities (e.g., Comparable, Serializable, Runnable, or a custom Drivable).

### Why use a Java interface?

There are mainly three reasons to use an interface. They are given below.
It is used to achieve abstraction.
By interface, we can support the functionality of multiple inheritance.
It is used to achieve loose coupling.

### How to declare an interface?

## IS-A and HAS-A Relationship

An interface is declared by using the interface keyword. It provides total abstraction; it means all the methods in an interface are declared with an empty body, and all the fields are public, static and final by default. A class that implements an interface must implement all the methods declared in the interface.

A relationship in Java means different relations between two or more classes. For example, if a class Bulb inherits another class Device, then we can say that Bulb is having is-a relationship with Device, which implies Bulb is a device.  

In Java, we have two types of relationship:

1. Is-A relationship: Whenever one class inherits another class, it is called an IS-A relationship.
2. Has-A relationship: Whenever an instance of one class is used in another class, it is called HAS-A relationship.

**Is-A relationship** 

IS-A Relationship is wholly related to Inheritance. For example - a kiwi is a fruit; a bulb is a device.
IS-A relationship can simply be achieved by using extends Keyword.
IS-A relationship is additionally used for code reusability in Java and to avoid code redundancy.
IS-A relationship is unidirectional, which means we can say that a bulb is a device, but vice versa; a device is a bulb is not possible since all the devices are not bulbs.
IS-A relationship is tightly coupled, which means changing one entity will affect another entity.

## Daily Practice Assigments

### Write a program to demonstrate interface use for different networks (2G, 3G, 4G and 5G). (**Day3Code1DPA1**)

