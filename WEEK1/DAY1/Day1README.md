# DAY 1

### Variable and Data types -
 
Data types 
1. Primitive - **byte, int, short, long, float, double, bool, char**
2. Non-Primitive - **string, array etc.**

variable
1. Local Variable - define with in the func.
2. Instance Variable - These variables are specific to each instance of a class and are known as instance variables.
3. Static variable - These variables are shared among all instances of a class and are initialized before any instance variables. 

##### Day1Code1 - code to return sum of 3 numbers.

### Literals in Java - 

int a=2,b=4,c=6;

float pi=3.14f; // by default double 

double do=20.22d;

char a=’v’

### Passing Variables to Methods

##### Day1Code2 - Code to change primitive value inside method and change object value inside method.

### Array 
#### Basics Operation on Arrays in Java
1. Declaring an Array
The general form of array declaration is 
// Method 1:
int arr[];
// Method 2:
int[] arr;
2. Initialization an Array in Java - int arr[] = new int[size];
3. Array Literal in Java
// Declaring array literal  
int[] arr = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
3. Change an Array Element - arr[0] = 90; 
4. Array Length
// Getting the length of the array
int n = arr.length; 

#### Arrays of Objects in Java
An array of objects is created like an array of primitive-type data items.
class Student {
    public int roll_no;
    public String name;
  
    Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
}
public class Geeks {
    public static void main(String[] args){
      
        // declares an Array of Student
        Student[] arr;

        // allocating memory for 5 objects of type Student.
        arr = new Student[5];
    }
}

##### Day1Code3 - Java program to illustrate creating an array of integers, puts some values in the array and prints each value to standard output.


### Wrapper Class in Java
A Wrapper class in Java is one whose object wraps or contains primitive data types. When we create an object in a wrapper class, it contains a field and in this field, we can store primitive data types. In other words, we can wrap a primitive value into a wrapper class object.

##### Da1Code4 - Demonstration to convert the primitive to its corresponding wrapper.

#### Need of Wrapper Classes
1. There are certain needs for using the Wrapper class in Java as mentioned below:

2. They convert primitive data types into objects. Objects are needed if we wish to modify the arguments passed into a method (because primitive types are passed by value).
3. The classes in java.util package handle only objects and hence wrapper classes help in this case.
4. Data structures in the Collection framework, such as ArrayList and Vector, store only objects (reference types) and not primitive types.
5. An object is needed to support synchronization in multithreading.

#### Autoboxing and Unboxing
1. Autoboxing
The automatic conversion of primitive types to the object of their corresponding wrapper classes is known as autoboxing.
For example – conversion of int to Integer, long to Long, double to Double, etc. 
2. Unboxing
It is just the reverse process of autoboxing. Automatically converting an object of a wrapper class to its corresponding primitive type is known as unboxing. For example, conversion of Integer to int, Long to long, Double to double, etc. 

### Instanceof Keyword in Java

In Java, instanceof is a keyword used for checking if a reference variable contains a given type of object reference or not. Following is a Java program to show different behaviors of instanceof. Henceforth it is known as a comparison operator where the instance is getting compared to type returning boolean true or false as in Java we do not have 0 and 1 boolean return types.

##### Day1Code5 - Java Program to Illustrate instanceof Keyword.
##### Day1Code6 - Java program to demonstrate working of instanceof Keyword.

### Decision Making Control Flow Statements & Loops in Java

#### Control Flow Statements

A programming language uses control statements to control the flow of execution of a program based on certain conditions.. Java provides several control statements to manage program flow, including:

Conditional Statements: ******if, if-else, nested-if, if-else-if**
Switch-Case: For multiple fixed-value checks.
Jump Statements: **break, continue, return**

##### Day1Code7 - Java program to illustrate if statement without curly block
##### Day1Code8 - Java program to demonstrate the working of if-else statement
##### Day1Code9 - Java program to demonstrate the working of if-else-if ladder
##### Day1Code10 - Java program to demonstrates the working of switch statements

#### Loops And Iterators

1. for loop -
##### Day1Code11 - Java program demonstrates an Enhanced for loop (for each loop) to iterate through an array and print names.
2. while Loop -
##### Day1Code12 - Java program to demonstrates the working of while loop.
3. do-while Loop -
##### Day1Code13 - Java program to demonstrates the working of do-while loop.

### Strings 

#### Interfaces and Classes in Strings in Java.

1. String - String is an immutable class in Java, which means that once a String object is created, its value cannot be changed. If you want to modify a string a new String object is created and the original remains unchanged.
Syntax:
// Method 1
String str= "geeks";
// Method 2 
String str= new String("geeks");

2. StringBuffer - StringBuffer is a peer class of String, it is mutable in nature and it is thread safe class , we can use it when we have multi threaded environment and shared object of string buffer i.e, used by mutiple thread. As it is thread safe so there is extra overhead, so it is mainly used for multithreaded program. 
Syntax:
StringBuffer demoString = new StringBuffer("GeeksforGeeks");

3. StringBuilder - StringBuilder in Java represents an alternative to String and StringBuffer Class, as it creates a mutable sequence of characters and it is not thread safe. It is used only within the thread , so there is no extra overhead , so it is mainly used for single threaded program.
Syntax:
StringBuilder demoString = new StringBuilder(); 
demoString.append("GFG"); 

4. StringTokenizer - StringTokenizer class in Java is used to break a string into tokens.
A StringTokenizer object internally maintains a current position within the string to be tokenized. Some operations advance this current position past the characters processed. A token is returned by taking a substring of the string that was used to create the StringTokenizer object.

Syntax:
public StringJoiner(CharSequence delimiter)

##### Day1Code14 - Iterate each element of the string using charAt() and length().
##### Day1Code15 - Compare two strings using compareto();.
##### Day1Code16 - reverse a string using stringBuilder methods.

#### Methods uses in String Classes.

The Java String class provides a rich set of methods for manipulating and querying strings. These methods offer functionalities for various operations, including:
Information Retrieval:
1. length(): Returns the number of characters in the string.
2. charAt(int index): Returns the character at the specified index.
3. indexOf(String str) / indexOf(int ch): Returns the index of the first occurrence of a specified substring or character.
4. lastIndexOf(String str) / lastIndexOf(int ch): Returns the index of the last occurrence of a specified substring or    character.
5. isEmpty(): Checks if the string is empty.
Comparison:
1. equals(Object obj): Compares two strings for equality (case-sensitive).
2. equalsIgnoreCase(String anotherString): Compares two strings for equality, ignoring case differences.
3. compareTo(String anotherString): Compares two strings lexicographically.
4. compareToIgnoreCase(String anotherString): Compares two strings lexicographically, ignoring case differences.
5. startsWith(String prefix) / startsWith(String prefix, int offset): Checks if the string starts with a specified prefix.
6. endsWith(String suffix): Checks if the string ends with a specified suffix.
7. contains(CharSequence s): Checks if the string contains a specified sequence of characters. 
Manipulation:
1. concat(String str): Concatenates two strings.
2. substring(int beginIndex) / substring(int beginIndex, int endIndex): Extracts a substring.
3. replace(char oldChar, char newChar): Replaces all occurrences of a character with another.
4. replaceAll(String regex, String replacement): Replaces all substrings matching a regular expression.
5. replaceFirst(String regex, String replacement): Replaces the first matching substring.
6. trim(): Removes leading and trailing whitespace.
7. toLowerCase(): Converts all characters to lowercase.
8. toUpperCase(): Converts all characters to uppercase.
9. split(String regex): Splits the string into an array of strings based on a delimiter.
10. join(CharSequence delimiter, CharSequence... elements): Joins multiple strings with a specified delimiter.
Conversion:
1. toCharArray(): Converts the string to a character array.
2. getBytes(): Encodes the string into a sequence of bytes.
3. valueOf(various_types): Converts various data types to their string representation.
4. format(String format, Object... args): Returns a formatted string.

**StringBuilder** and **StringBuffer** in Java share a nearly identical set of methods for manipulating mutable sequences of characters. The primary difference lies in their thread-safety: StringBuffer methods are synchronized (thread-safe), while StringBuilder methods are not (faster in single-threaded environments).

Here are some of the common methods available in both StringBuilder and StringBuffer:

1. append(): Appends various data types (strings, characters, integers, booleans, etc.) to the end of the sequence.
2. insert(): Inserts a specified value at a given index within the sequence.
3. delete(): Deletes a portion of the sequence between a specified start and end index.
4. deleteCharAt(): Deletes the character at a specific index.
5. replace(): Replaces a portion of the sequence with a new string.
6. reverse(): Reverses the order of characters in the sequence.
7. charAt(): Returns the character at a specified index.
8. setCharAt(): Sets the character at a specified index to a new character.
9. length(): Returns the current length (number of characters) of the sequence.
10. capacity(): Returns the current capacity of the buffer (the amount of storage available for characters).
11. ensureCapacity(): Ensures that the capacity is at least equal to the given minimum.
12. substring(): Returns a new String object containing a portion of the sequence.
13. toString(): Converts the StringBuilder or StringBuffer object into a String object.

## Daily Practice Assignments

1. Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an another array but in reverse order. (**ANSWER - CodeDPA1**)
2. Write a program to provide 20 % discount to Premium plan Subscribers and for normal user 5 % discount.
How to find duplicate characters in a String? (**Answer - CodeDPA2,CodeDPA3**)
3. Why string is not used for storing the passwords rather a char array is preferred for the same.
Ans- Strings are immutable. Once a String is created in Java, it cannot be changed. This means the password stays in memory until garbage collected, and you cannot manually erase it.Strings stay in memory longer. Because of immutability and string pooling, passwords stored as String may remain in memory longer than necessary. This increases the risk of memory dump attacks, where sensitive data could be exposed. char[] can be cleared manually. You can overwrite the contents of a char[] after you're done using it: