# Day 1

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

java.lang.Throwable: The superclass of all errors and exceptions. Only objects that are instances of this class (or one of its subclasses) are thrown by the JVM or can be thrown by a throw statement.

java.lang.Error: Represents serious problems that are not meant to be caught by the application. These are typically unrecoverable and indicate a failure in the JVM itself (e.g., OutOfMemoryError).

java.lang.Exception: Represents conditions that a program might want to catch and handle. This class is further divided into two categories:
1. Checked Exceptions: Direct subclasses of Exception (excluding RuntimeException). The compiler checks that your code handles these. Examples: IOException, SQLException.
2. Unchecked Exceptions (Runtime Exceptions): Subclasses of java.lang.RuntimeException. The compiler does not force you to handle these as they often reflect logic errors in the code. Examples: NullPointerException, ArithmeticException.