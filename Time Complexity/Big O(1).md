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
#Another Example
<br>
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
