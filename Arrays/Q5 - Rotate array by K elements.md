## Rotate array by K elements

```java
Example

Input
N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , right

Output
6 7 1 2 3 4 5

Explanation [ array is rotated to right by 2 position .]

----------------------------------------------------

Example
Input
N = 6, array[] = {3,7,8,9,10,11} , k=3 , left

Output
9 10 11 3 7 8

Explanation [ Array is rotated to right by 3 position.]

```

```java
import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		int k=2;

		leftRotate(arr,k);

		System.out.println(Arrays.toString(arr));
	}

	private static void leftRotate(int[] arr, int k) {

		reverse(arr,0,arr.length-1);  // [7, 6, 5, 4, 3, 2, 1]
		reverse(arr,0,k-1); //  [6, 7, 5, 4, 3, 2, 1]
		reverse(arr,k,arr.length-1); // [6, 7, 1, 2, 3, 4, 5]
	}

	private static void reverse(int[] arr, int start, int end) {

		while(start<=end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}

	}

}

```

Output

```java
[6, 7, 1, 2, 3, 4, 5]

```
