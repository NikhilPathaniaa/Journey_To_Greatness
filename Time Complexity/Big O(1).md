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
4. [Method Invocation](#5-method-invocation)
5. [Ternary Operation](#6-ternary-operation)
6. [Creating and Using an Object](#7-creating-and-using-an-object)
7. [Setting a Value in a Map](#8-setting-a-value-in-a-map)
8. [Returning a Constant Value from a Method](#9-returning-a-constant-value-from-a-method)
9. [Single Iteration Loops](#10-single-iteration-loops)
10. [Standard Library Operations](#12-standard-library-operations)

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
## 2. Accessing an Array Element 📚

```java
public class Example2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int element = array[2]; // Constant time operation O(1)
        System.out.println(element); // Constant time operation O(1)
    }
}

```
## 3. Arithmetic Operations ➕➖✖️➗

```java
public class Example3 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int sum = x + y; // Constant time operation O(1)
        int product = x * y; // Constant time operation O(1)
        System.out.println("Sum: " + sum); // Constant time operation O(1)
        System.out.println("Product: " + product); // Constant time operation O(1)
    }
}

```
## 4. Method Invocation 🛎️

```java
public class Example5 {
    public static void main(String[] args) {
        greet(); // Constant time operation O(1)
    }

    public static void greet() {
        System.out.println("Hello, World!"); // Constant time operation O(1)
    }
}

```
## 5. Ternary Operation 🔄

```java
public class Example6 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int max = (a > b) ? a : b; // Constant time operation O(1)
        System.out.println("Max: " + max); // Constant time operation O(1)
    }
}

```
## 6. Creating and Using an Object 🛠️

```java
public class Example7 {
    public static void main(String[] args) {
        Point p = new Point(2, 3); // Constant time operation O(1)
        System.out.println(p); // Constant time operation O(1)
    }
}

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x; // Constant time operation O(1)
        this.y = y; // Constant time operation O(1)
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")"; // Constant time operation O(1)
    }
}

## 7. Setting a Value in a Map 🗺️

```java
import java.util.HashMap;
import java.util.Map;

public class Example8 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("key", 100); // Constant time operation O(1)
        System.out.println(map.get("key")); // Constant time operation O(1)
    }
}
```
## 8. Returning a Constant Value from a Method 🔙

```java
public class Example9 {
    public static void main(String[] args) {
        int result = getValue(); // Constant time operation O(1)
        System.out.println(result); // Constant time operation O(1)
    }

    public static int getValue() {
        return 42; // Constant time operation O(1)
    }
}
```
## 9. Single Iteration Loops 🔁

```java
public class Example10 {
    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            System.out.println("This loop runs once."); // Constant time operation O(1)
        }
    }
}
```
## 10. 12. Standard Library Operations 📚

```java
import java.util.ArrayList;
import java.util.List;

public class Example12 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Element"); // Constant time operation O(1)
        System.out.println(list.get(0)); // Constant time operation O(1)
    }
}
```
