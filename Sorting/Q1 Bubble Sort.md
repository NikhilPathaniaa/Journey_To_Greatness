## Bubble Sort Algorithm

Problem Statement: Given an array of N integers, write a program to implement the Bubble Sorting algorithm.

Example

```java
Input
N = 6, array[] = {13,46,24,52,20,9}

Output
9,13,20,24,46,52

Explanation
After sorting we get 9,13,20,24,46,52
```

```java
public class BubbleSort {
	public static void main(String[] args) {
		int arr[]={5,3,2,1,4};

		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
```

Output

```java
[1,2,3,4,5]
```
