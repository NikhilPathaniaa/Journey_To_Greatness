## Swap Two Numbers

Given two numbers a and b, the task is to swap them.

**_ Examples: _**

```java
Input: a = 2, b = 3
Output: a = 3, b = 2

Input: a = 20, b = 0
Output: a = 0, b = 20

Input: a = 10, b = 10
Output: a = 10, b = 10
```

```java
class Main
{
    public static void main(String[] args)
    {
        int a = 20;
        int b = 0;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = "+a+", b = "+b)
    }
}
```

**_ Output: _**

```java
a = 0, b = 20
```
