## Count Distinct Elements In Every Window of Size K

Given an array arr[] of size n and an integer k, return the count of distinct numbers in all windows of size k.

### Examples

```java
Input: arr[] = [1, 2, 1, 3, 4, 2, 3], k = 4
Output: [3, 4, 4, 3]

Explanation:

Windows and Distinct Count:

            Window [1, 2, 1, 3] → Distinct numbers: {1, 2, 3} → Count = 3

            Window [2, 1, 3, 4] → Distinct numbers: {2, 1, 3, 4} → Count = 4

            Window [1, 3, 4, 2] → Distinct numbers: {1, 3, 4, 2} → Count = 4

            Window [3, 4, 2, 3] → Distinct numbers: {3, 4, 2} → Count = 3
```

```java
public class Count_Distinct_Elements {

	public static void main(String[] args) {
		int arr[] = {1,2,1,3,4,2,3};
		int k = 4;
		ArrayList<Integer> res= countDistinct(arr,k);
		System.out.print(res);
	}
	private static ArrayList<Integer> countDistinct(int[] arr, int k) {
		ArrayList<Integer> res = new ArrayList<>();
		HashMap<Integer,Integer> freq = new HashMap<>();

		// Store the frequency of elements of the first window
		for(int i=0;i<k;i++)
		{
			freq.put(arr[i], freq.getOrDefault(arr[i], 0)+ 1);
		}
		// Store the count of distinct elements of the first window
		res.add(freq.size());

		for(int i=k;i<arr.length;i++)
		{
			freq.put(arr[i], freq.getOrDefault(arr[i], 0)+ 1);
			freq.put(arr[i-k], freq.get(arr[i-k])- 1);

			// If the frequency of arr[i - k] becomes 0,
            // remove it from the hash map
			if(freq.get(arr[i-k]) == 0)
			{
				freq.remove(arr[i-k]);
			}

			res.add(freq.size());
		}
		return res;
	}
}
```

Output

```java
[3, 4, 4, 3]
```
