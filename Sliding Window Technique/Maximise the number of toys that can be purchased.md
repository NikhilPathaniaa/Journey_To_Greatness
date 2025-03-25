# Maximise the number of toys that can be purchased with amount K

### Example

```java
Input:  N = 10, K =  50,  cost = { 1, 12, 5, 111, 200, 1000, 10, 9, 12, 15 }
Output: 6
Explanation: Toys with amount 1, 5, 9, 10, 12, and 12  can be purchased resulting in a total amount of 49. Hence, maximum number of toys is 6.

Input: N = 7, K = 50,  cost = { 1, 12, 5, 111, 200, 1000, 10 }
Output: 4
```

```java
public class Max_number_of_toys {

	public static void main(String[] args) {
		int n = 7;
		int k =  50;
		int cost[] = { 1, 12, 5, 111, 200, 1000, 10 };

		int val = toysCheck(n,k,cost);
		System.out.println(val);
	}

	private static int toysCheck(int n, int k, int[] cost) {

		int val = 0;
		int count = 0;
		for(int i=0;i<n;i++)
		{
			if(val+cost[i]<=k)
			{
				count++;
				val = val+cost[i];
//				System.out.println(val+" = "+ cost[i]+" ");
			}
		}

		return count;
	}

}

```

Output

```java
4
```
