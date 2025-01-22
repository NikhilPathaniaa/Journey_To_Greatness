### Left Rotate the Array by One

**Example**

```java
Input
 N = 5, array[] = {1,2,3,4,5}
Output
 2,3,4,5,1
```

```Java
package array;

import java.util.Arrays;

public class LeftRotateArray1Place {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int temp = arr[0];

		for(int i=1;i<arr.length;i++)
		{
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;

		System.out.println(Arrays.toString(arr));
	}

}
```

**Output**

```java
[2,3,4,5,1]
```
