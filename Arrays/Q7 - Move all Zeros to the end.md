## Move all Zeros to the end of the array

**Example**

```java
Input
 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1

Output
 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
```

**Explanation**

All the zeros are moved to the end and non-negative integers are moved to front by maintaining order

```java
import java.util.Arrays;
public class MoveZeroEnd {

	public static void main(String[] args) {

		int arr[]= {1,0,4,0,2,0,3};
		int j = 0;
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i] != 0) {
				 int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	                j++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}

```

**Output**

```java
[1, 2, 3, 4, 1, 0, 0, 0]
```
