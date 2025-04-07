## Program to find sum of first n natural numbers

Given a number n, find the sum of the first n natural numbers.

**_ Examples : _**

```java
Input: n = 3
Output: 6
Explanation: Note that 1 + 2 + 3 = 6

Input  : 5
Output : 15
Explanation : Note that 1 + 2 + 3 + 4 + 5 = 15
```

```java
class Main
{
    public static void main(String[] args)
    {
        int n = 5;
        int sum = 0;
        int i = 1;

        while(i<=5)
        {
            sum += i;
            i++;
        }

        System.out.println(sum);
    }
}
```

**Output**

```java
15
```
