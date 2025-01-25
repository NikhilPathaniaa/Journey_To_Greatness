## Linear Search

**Example**

```java
Input
arr[]= 1 2 3 4 5, num = 3

Output
2
```

**Explanation** 3 is present in the 2nd index

```java
public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int num = 3;

		for(int i=0;i<arr.length;i++)
		{
			if(num==arr[i])
			{
				System.out.println(i);
			}
		}
	}
}

```

**Output**

```java
2
```
