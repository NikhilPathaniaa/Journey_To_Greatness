## Remove Duplicates in-place from Sorted Array

**Problem Statement:** Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.

If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It does not matter what you leave beyond the first k elements.

#### Note: Return k after placing the final result in the first k slots of the array.

Example

```java
Input
 arr[1,1,2,2,2,3,3]

Output
 arr[1,2,3,_,_,_,_]
```

**Explanation:**
Total number of unique elements are 3, i.e[1,2,3] and Therefore return 3 after assigning [1,2,3] in the beginning of the array.

```java
public class RemoveDuplicatefromSortedArray {

	public static void main(String[] args) {
		int arr[] = {1,1,2,2,3,3};

		int length = duplicate(arr);

		for(int i = 0 ; i < length ; i++)
		{
			System.out.print(arr[i]+" ");
		}

	}
	static int duplicate(int arr[])
	{
		if (arr.length == 0) {
	        return 0;
	    }
		int i=0;
		for(int j=1;j<arr.length;j++)
		{
			if(arr[j]!=arr[i])
			{
				arr[i+1]=arr[j];
				i++;
			}
		}
		return i+1;
	}
}
```

Output

```java
1 2 3
```
