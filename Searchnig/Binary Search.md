## Binary Search

**Example**

```java
Input
arr[]= 1 2 3 4 5, num = 3

Output
2
```

**Explanation** 3 is present in the 2nd index

```java
public class BinarySearch {

    public static void main(String[] args) {
		int arr[] = {1,2,4,3,5,6};
		int k = 4;
		check(arr,k);
	}

	private static void check(int[] arr, int k) {
		int start = 0;
		int end = arr.length-1;
		int mid = end/2;
		System.out.println(k);

		for(int i=start;i<=end;i++)
		{
			if(k<arr[i])
			{
				end=mid;
				start=0;

			}
			else if(k>arr[i])
			{
				start=mid;

			}
			else if(k==arr[i] || arr.length==1)
			{
				System.out.println(k+" = "+i);

			}
			if(arr.length==1)
			{
				System.out.println(-1);
			}
		}
	}

}

```

**Output**

```java
2
```
