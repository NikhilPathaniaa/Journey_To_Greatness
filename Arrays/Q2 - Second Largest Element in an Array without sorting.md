##Second Largest Element in an Array without sorting

Example:

```java
Input:
 [1,2,4,7,7,5]
Output:
  Second Largest : 5
```

Explanation:
The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2

```java
public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,4,7,7,5};
		int n = arr.length;
		System.out.println("second smallest - "+secondSmallest(arr,n));
		secondLargest(arr);
	}

	static int secondSmallest(int arr[],int n)
	{
		if (n < 2)
		{
			return -1;
		}
		int small = Integer.MAX_VALUE;
		int second_small = Integer.MAX_VALUE;
		int i;
		for (i = 0; i < n; i++)
		{
		   if (arr[i] < small)
		   {
			  second_small = small;
			  small = arr[i];
		   }
		   else if (arr[i] < second_small && arr[i] != small)
		   {
			  second_small = arr[i];
		   }
		}
	   return second_small;
	}

	static void secondLargest(int arr[])
	{
		int second = 0;
		int largest = 0;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				second = largest;
				largest = arr[i];
			}
			else if(arr[i]>second && arr[i]!=largest)
			{
				second = arr[i];
			}
		}
		if(second == 0)
			System.out.println(-1);
		else
			System.out.println("second largest - "+second);
	}

}

```

Output

```java

second smallest - 2
second largest - 5

```
