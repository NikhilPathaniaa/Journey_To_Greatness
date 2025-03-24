# Sum of minimum and maximum elements of all subarrays of size k.

Given an array of both positive and negative integers, the task is to compute sum of minimum and maximum elements of all sub-array of size k.

### Example:

```java
Input : arr[] = {2, 5, -1, 7, -3, -1, -2}
        K = 4
Output : 18
Explanation : Subarrays of size 4 are :
     {2, 5, -1, 7},   min + max = -1 + 7 = 6
     {5, -1, 7, -3},  min + max = -3 + 7 = 4
     {-1, 7, -3, -1}, min + max = -3 + 7 = 4
     {7, -3, -1, -2}, min + max = -3 + 7 = 4

Sum of all min & max = 6 + 4 + 4 + 4 = 18
```

```java
public class Min_Max {

	public static void main(String[] args) {
		int arr[] = {2,5,-1,7,-3,-1,2};
		int  k = 4;
		System.out.println(total(arr,k));
	}

	private static int total(int[] arr, int k) {
		int total = 0;
		int end = k;
		int start = 0;

		while(end<=arr.length)
		{
			total = total + sum(arr,start,end);
			start++;
			end++;
		}
		return total;
	}

	private static int sum(int[] arr, int start, int end) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for(int i=start;i<end;i++)
		{
			if(arr[i]<min) min = arr[i];
			if(arr[i]>max) max = arr[i];
		}
		int sum = min+max;
		return sum;
	}

}
```

Output

```java
18
```
