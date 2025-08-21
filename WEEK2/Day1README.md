# Day 1-5

## Java Exception Handling

Exception handling in Java is an effective mechanism for managing runtime errors to ensure the application's regular flow is maintained. Some Common examples of exceptions include ClassNotFoundException, IOException, SQLException, RemoteException, etc. By handling these exceptions, Java enables developers to create robust and fault-tolerant applications.

#### Exceptionhandling1 - Showing an arithmetic exception or we can say a divide by zero exception.

## Why Use Exceptions?

Using exceptions provides a clean and structured way to handle errors.

Separates Error-Handling Code: It allows you to separate the main logic of your code from the code that handles what to do when things go wrong. This makes the program much more readable and maintainable.

Graceful Failure: Instead of the program abruptly terminating, you can catch the exception and perform recovery actions, log the error, or inform the user with a friendly message.

Propagating Errors: An exception can be passed up the call stack. This means a method can throw an exception, and the method that called it can decide how to handle it, providing flexibility in error management.

## Common Exceptions and Errors

Here are some of the most common exceptions and errors you'll encounter in Java:

1. Unchecked Exceptions (Runtime Exceptions)

These are typically caused by programming errors and are not checked at compile-time.

NullPointerException: Thrown when you try to use an object reference that hasn't been initialized (i.e., it's null).
ArrayIndexOutOfBoundsException: Occurs when you try to access an array element with an invalid index (e.g., index -1 or an index greater than or equal to the array's length).
ArithmeticException: Caused by an exceptional arithmetic condition, most commonly dividing an integer by zero.
IllegalArgumentException: Thrown when a method is passed an illegal or inappropriate argument.
2. Checked Exceptions

These represent issues that a well-written application should anticipate and recover from, like problems with I/O or database connections. The compiler forces you to handle them using a try-catch block or by declaring them with the throws keyword.

IOException: Signals that an I/O (Input/Output) operation has failed or been interrupted. This is a common exception when working with files.
SQLException: Indicates an error during a database access operation.
FileNotFoundException: A subclass of IOException, specifically thrown when you try to access a file that does not exist.

3. Errors

Errors are serious problems that a reasonable application should not try to catch. They represent abnormal conditions that happen in the Java Virtual Machine (JVM) itself.

StackOverflowError: Occurs when the application's call stack becomes too deep, usually due to infinite recursion.
OutOfMemoryError: Thrown when the JVM cannot allocate any more memory to create objects.

## Java Exception Class Hierarchy

All exception and error types in Java are subclasses of the java.lang.Throwable class. This class is the base class for the entire exception hierarchy. The hierarchy is broadly divided into two main branches: Error and Exception.

Here's a simplified view of the hierarchy:

                                        java.lang.Object
                                                |
                                        java.lang.Throwable
                                     /                       \
                     java.lang.Error                          java.lang.Exception
                     /          \                                /            \
            StackOverflowError  OutOfMemoryError           IOException         RuntimeException
                                                          /       \            /         \
                                                 SQLException  FileNotFound... NullPointer...  ArrayIndex...

**java.lang.Throwable**: The superclass of all errors and exceptions. Only objects that are instances of this class (or one of its subclasses) are thrown by the JVM or can be thrown by a throw statement.

**java.lang.Error**: Represents serious problems that are not meant to be caught by the application. These are typically unrecoverable and indicate a failure in the JVM itself (e.g., OutOfMemoryError).

**java.lang.Exception**: Represents conditions that a program might want to catch and handle. This class is further divided into two categories:
1. Checked Exceptions: Direct subclasses of Exception (excluding RuntimeException). The compiler checks that your code handles these. Examples: IOException, SQLException.
2. Unchecked Exceptions (Runtime Exceptions): Subclasses of java.lang.RuntimeException. The compiler does not force you to handle these as they often reflect logic errors in the code. Examples: NullPointerException, ArithmeticException.

## Throwing Exceptions

When something goes wrong in a program, you can "throw" an exception to signal an error. It transfers control to the nearest matching catch block.

class Example {
    void divide(int a, int b) {
        if(b == 0) {
            throw new ArithmeticException("Division by zero not allowed");
        }
        System.out.println("Result: " + (a / b));
    }
}

**"throws" keyword**

The throws keyword is used in a method declaration to indicate that the method may throw certain exceptions. This alerts the caller to handle or declare those exceptions.

class Example {
    void readFile() throws IOException {
        throw new IOException("File not found");
    }
}

**throw with Message**

When throwing exceptions, you can pass a custom error message that describes the problem.

*throw new IllegalArgumentException("Invalid input provided!");*

**throws keyword when method overriding**

When overriding, a subclass method can only declare the same exceptions or subclasses of the exceptions thrown by the parent method. It cannot throw broader (new) checked exceptions.

*class Parent {*
    *void show() throws IOException {}*
*}*
*class Child extends Parent {*
    *@Override*
    *void show() throws FileNotFoundException {} // Allowed (subclass of IOException)*
*}*

**Avoiding Runtime Exceptions**

Runtime exceptions (like NullPointerException, ArrayIndexOutOfBoundsException) can be avoided by writing safe code:
Check for null before using objects.
Validate array indexes.
Validate user inputs.

String str = null;
if(str != null) {
    System.out.println(str.length());
}

**How to use NotImplementedException?**

Java doesn’t have NotImplementedException built-in like C#. Instead, you can throw **UnsupportedOperationException** to indicate a method is not yet implemented.

class Demo {
    void feature() {
        throw new UnsupportedOperationException("Feature not implemented yet");
    }
}

## Custom Exceptions

A custom exception in Java is a user-defined exception class that extends either Exception (for checked exceptions) or RuntimeException (for unchecked exceptions).
You create them when the built-in exceptions don’t describe your error scenario well.
 Example scenarios:
Invalid user input (e.g., negative age).
Business rule violation (e.g., insufficient balance in bank).
Application-specific errors (e.g., file format not supported).

### What is a custom exception?
**Example - TestCustomException.java**
**Example - TestCustomException2.java**

### JVM Thrown Exceptions

The Java Virtual Machine (JVM) automatically throws exceptions at runtime when it detects errors during program execution.
These are situations like dividing by zero, accessing invalid array indices, or using null references.
You don’t need to explicitly throw them — the JVM does it for you.

### Programmatically Thrown Exceptions

Apart from JVM, developers can programmatically throw exceptions when certain conditions are not met.
This is useful in business logic validation (e.g., login failure, insufficient funds, invalid input).
In this case, you decide when and why to raise an exception.

### Programmatically Thrown Exceptions using throw keyword

The throw keyword is used to explicitly throw an exception object inside your program.
It works with both built-in exceptions and custom exceptions.
Whenever you use throw, you must provide an instance of Throwable class or its subclasses.

## Daily Practise Assignment

**Day1DPA1(correct format)- Is it possible to catch Exception before catching NullPointerException in single try-catch block?**

ANS- It is not possible to catch Exception before NullPointerException in a single try-catch block, because it makes the NullPointerException catch block unreachable, and Java does not allow unreachable code.

try {
    String s = null;
    System.out.println(s.length());  // Causes NullPointerException
} catch (Exception e) {  // Parent class
    System.out.println("Caught general exception");
} catch (NullPointerException e) {  // Child class
    System.out.println("Caught null pointer");
}

Error: NullPointerException is unreachable because Exception already catches it.

**TryCatchFinally.java - Write a program using try catch and finally bock.** 

**How should the Exception catch blocks be ordered ?**
__Rule for Ordering Catch Blocks__

1. Most specific exceptions first
Place child (subclass) exceptions before their parent (superclass) exceptions.
Example: NullPointerException (child of RuntimeException → child of Exception).

2. More general exceptions later
Place parent classes like RuntimeException, then Exception, then Throwable at the end.

3. Unrelated exceptions
If two exceptions are not in the same hierarchy branch, order doesn’t matter.

**ThrowException2 - Write a program containing a possible exception. Use a try block to throw it and a catch block to handle it promptly.**

**TestCustomException.java - Write a program to showcase custom exception, also provide details why you used custom exception in that program.**

Day5 **Which type of Exception the below code will throw?**
class MyClass { 
    private static Pattern PATT = Pattern.compile("("); 
} 
try { 
    new MyClass(); 
} catch (Throwable t) {} 
new MyClass();
java.lang.ExceptionInInitializerError
Caused by: java.util.regex.PatternSyntaxException: Unclosed group near index 1 (