## The dice problem

You are given a cubic dice with 6 faces. All the individual faces have a number printed on them. The numbers are in the range of 1 to 6, like any ordinary dice. You will be provided with a face of this cube, your task is to guess the number on the opposite face of the cube.

**_ Examples: _**

```java
Input: n = 2
Output: 5
Explanation: For dice facing number 5 opposite face will have the number 2.


Input: 6 = 6
Output: 1
Explanation: For dice facing number 6 opposite face will have the number 1.
```

Naive Approach

```java
import java.util.HashMap;

public class Dice {
	public static void main(String[] args) {
		int n = 6;
		HashMap<Integer, Integer> Dice = new HashMap<>();
		Dice.put(1, 6);
		Dice.put(2, 5);
		Dice.put(3, 4);
		Dice.put(4, 3);
		Dice.put(5, 2);
		Dice.put(6, 1);
		opposite(n,Dice);
	}
	private static void opposite(int n, HashMap<Integer, Integer> dice) {
		System.out.println(dice.get(n));
	}
}
```

**_ Output _**

```java
1
```

Expected Approach

```java
public class Main {
    public static int oppositeFaceOfDice(int n) {
        int ans = 7 - n;
        return ans;
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(oppositeFaceOfDice(n));
    }
}
```

**_ Output _**

```java
5
```
