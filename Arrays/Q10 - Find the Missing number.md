## Find the missing number in an array

**Example**

```java
Input Format
 N = 5, array[] = {1,2,4,5}
Result
 3
```

**Explanation**

In the given array, number 3 is missing. So, 3 is the answer.

```java
public class MissingNumberInArray {

	public static void main(String[] args) {
		int n =5, arr[]= {1,2,4,5};

		int totalSum = n * (n + 1) / 2;
		int arraySum = 0;

        for (int num : arr) {
            arraySum += num;
        }

		System.out.println("missing number - "+(totalSum-arraySum));
	}

}
```

**Output**

```java
missing number - 3
```
