## Find the number that appears once, and the other numbers twice

**Example**

```java
Input
 arr[] = {2,2,1}
Result
 1
```

**Explanation**
In this array, only the element 1 appear once and so it is the answer.

```java
public class Find_number_that_appears_once {

	public static void main(String[] args) {
		int arr[]= {1,2,3,2,1};

		finding(arr);
		finding1(arr);
	}
// Brute force approch
	private static void finding(int[] arr) {

		if(arr.length==0)
		{
			System.out.println(-1);
		}
		else
		{
			for(int i=0;i<arr.length;i++)
			{
				boolean flag= true;
				for(int j=0;j<arr.length;j++)
				{
					if(arr[i]==arr[j] && i!=j)
					{
						flag=false;
						break;
					}
				}
				if(flag)
				{
					System.out.println(arr[i]);
				}
			}
		}
	}
// Optimal solution
private static void finding1(int[] arr) {
		if(arr.length==0)
		{
			System.out.println(-1);
		}
		else
		{
			int n = arr.length;

	        int xorr = 0;
	        for (int i = 0; i < n; i++) {
	            xorr = xorr ^ arr[i];
	        }
	        System.out.println(xorr);
		}
	}

}
```

**Output**

Loop Execution:

Step 1: xorr = 0 ^ 1 = 1
Step 2: xorr = 1 ^ 2 = 3
Step 3: xorr = 3 ^ 3 = 0
Step 4: xorr = 0 ^ 2 = 2
Step 5: xorr = 2 ^ 1 = 3

```java
3
```
