# Time Complexity of Big O(1)

## Table of Contents
- [If else](#if-else)
- [Nested if-else](#Nested-if-else)
- [Switch Case](#Switch-case)
  
 # Time Complexity of the Given Code
The given Java code snippet has the following structure:

```java
public class Time_Complexity {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = a + b;
        System.out.println(c);
    }
}
```

Time Complexity Analysis
The operations in the given code are constant time operations:

Variable Initialization: `int a = 10;`, `int b = 10;`, and `int c = a + b;` are all constant time operations, 
O(1).
<br>
Print Statement: `System.out.println(c);` is also a constant time operation, 
O(1).
<br>
Since there are no loops or recursive calls, the overall time complexity of this code is 
O(1).
<br>
# If else
<br>
The given Java code snippet has the following structure:

```java
public class Main
{
    public static void main(String[] args) {
        int a = 10; // Constant time operation O(1)
        if(a == 10) // Constant time operation O(1)
        {
            System.out.println("true"); // Constant time operation O(1)
        }
        else
        {
            System.out.println("false"); // Constant time operation O(1)
        }
    }
}
```
Time Complexity Analysis
Variable Initialization: int a = 10;

This is a single assignment operation, which takes constant time, 
O(1).
<br>
If-Else Statement: if(a == 10)
The comparison a == 10 is a constant time operation, 
O(1).
<br>
Print Statement: System.out.println("true"); and System.out.println("false");
<br>
Both print statements are constant time operations, 
O(1).

<br>
Since all operations in the code are constant time operations and there are no loops or recursive calls, the overall time complexity is 
O(1).

## Nested if-else
Code Analysis
```java
public class Main
{
    public static void main(String[] args) {
        int a = 10; // Constant time operation O(1)
        if(a == 10) // Constant time operation O(1)
        {
            if("10".equals(a)) // Constant time operation O(1)
            {
                System.out.println("true"); // Constant time operation O(1)
            }
            else
            {
                System.out.println("false"); // Constant time operation O(1)
            }
        }
        else
        {
            System.out.println("false"); // Constant time operation O(1)
        }
    }
}
Time Complexity Analysis
Variable Initialization: int a = 10;
```
This is a single assignment operation, which takes constant time, 
O(1).
If-Else Statements:

The outer if(a == 10) comparison is a constant time operation, 
O(1).
The inner if(10 == '10') comparison is also a constant time operation, 
O(1).
Print Statements:

System.out.println("true"); and System.out.println("false"); are constant time operations, 
O(1).

Note on Comparison 10 == '10'
The comparison 10 == '10' is always false because 10 is an integer and '10' is a character literal which is not the same as the integer value 10.
Overall Time Complexity
Since all operations in the code are constant time operations and there are no loops or recursive calls, the overall time complexity is 
O(1).

## Time Complexity of the Given Code

The given Java code snippet has the following structure:

```java
public class Main
{
    public static void main(String[] args) {
        int a = 10;
        if(a == 10)
        {
            if("10".equals(a))
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
        }
        else
        {
            System.out.println("false");
        }
    }
}
Time Complexity Analysis
Variable Initialization: int a = 10;
```
This is a single assignment operation, which takes constant time, 
O(1).
If-Else Statements:

The outer if(a == 10) comparison is a constant time operation, 
O(1).
The inner if(10 == '10') comparison is also a constant time operation, 
O(1).
Print Statements:

System.out.println("true"); and System.out.println("false"); are constant time operations, 
O(1).
Since all operations in the code are constant time operations and there are no loops or recursive calls, the overall time complexity is 
O(1).

The comparison 10 == '10' is always false because 10 is an integer and '10' is a character literal, which are not the same.
<br>

## Switch Case
Code Analysis

```java
public class Main {
    public static void main(String[] args) {
        int day = 4; // Constant time operation O(1)
        switch (day) {
            case 1:
                System.out.println("Monday"); // Constant time operation O(1)
                break;
            case 2:
                System.out.println("Tuesday"); // Constant time operation O(1)
                break;
            case 3:
                System.out.println("Wednesday"); // Constant time operation O(1)
                break;
            case 4:
                System.out.println("Thursday"); // Constant time operation O(1)
                break;
            case 5:
                System.out.println("Friday"); // Constant time operation O(1)
                break;
            case 6:
                System.out.println("Saturday"); // Constant time operation O(1)
                break;
            case 7:
                System.out.println("Sunday"); // Constant time operation O(1)
                break;
        }
    }
}
Time Complexity Analysis
Variable Initialization: int day = 4;
```
This is a single assignment operation, which takes constant time, 

O(1).
Switch Statement:

The switch statement evaluates the value of day and jumps directly to the corresponding case. This jump operation is 

O(1).
Each case contains a System.out.println statement and a break statement, both of which are constant time operations, 

O(1).
Overall Time Complexity
Since all operations in the code are constant time operations and there are no loops or recursive calls, the overall time complexity is 

O(1).

How to Include This in a README
To include this code and its time complexity analysis in a README.md file, you can format it using Markdown like this:

markdown
Copy code
## Time Complexity of the Given Code

The given Java code snippet has the following structure:

```java
public class Main {
    public static void main(String[] args) {
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
Time Complexity Analysis
Variable Initialization: int day = 4;
```
This is a single assignment operation, which takes constant time, 

O(1).
Switch Statement:

The switch statement evaluates the value of day and jumps directly to the corresponding case. This jump operation is 

O(1).
Each case contains a System.out.println statement and a break statement, both of which are constant time operations, 

O(1).
Since all operations in the code are constant time operations and there are no loops or recursive calls, the overall time complexity is 

O(1).

<br>

# O(1) Time Complexity Examples

This document contains examples of code snippets with constant time complexity, \(O(1)\). Each operation in these examples takes a constant amount of time, regardless of input size.

## Index
1. [Variable Assignment](#1-variable-assignment)
2. [Accessing an Array Element](#2-accessing-an-array-element)
3. [Arithmetic Operations](#3-arithmetic-operations)
4. [Boolean Checks](#4-boolean-checks)
5. [Method Invocation](#5-method-invocation)
6. [Ternary Operation](#6-ternary-operation)
7. [Creating and Using an Object](#7-creating-and-using-an-object)
8. [Setting a Value in a Map](#8-setting-a-value-in-a-map)
9. [Returning a Constant Value from a Method](#9-returning-a-constant-value-from-a-method)

## 1. **Variable Assignment** ✏️

```java
public class Example1 {
    public static void main(String[] args) {
        int a = 5; // Constant time operation O(1)
        int b = 10; // Constant time operation O(1)
        int c = a + b; // Constant time operation O(1)
        System.out.println(c); // Constant time operation O(1)
    }
}
```
## 2. **Accessing an Array Element 📚

```java
public class Example2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int element = array[2]; // Constant time operation O(1)
        System.out.println(element); // Constant time operation O(1)
    }
}

```
