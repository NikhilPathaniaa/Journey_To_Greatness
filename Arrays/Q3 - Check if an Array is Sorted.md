## Check if an Array is Sorted

=====================================

Example:

```java
Input
 N = 5, array[] = {1,2,3,4,5}
Output
    True
```

**_ Explanation: _**
The given array is sorted i.e Every element in the array is smaller than or equals to its next values, So the answer is True.

```java
public class CheckArraySorted {

	public static void main(String[] args) {
		int arr[]= {1,2,2,3,3,4};

		if(checkagain(arr))
		{
			System.out.println("sorted");
		}
		else
		{
			System.out.println("not sorted");
		}
	}
	static boolean checkagain(int arr[])
	{
		for (int i = 1; i < arr.length; i++) {
	        if (arr[i - 1] > arr[i]) {
	            return false;
	        }
	    }
		return true;
	}

}

```

Output

```java
sorted
```
