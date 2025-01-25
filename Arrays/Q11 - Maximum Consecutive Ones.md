## Count Maximum Consecutive One's in the array

**Example 1**

```java
Input
prices = {1, 1, 0, 1, 1, 1}

Output
3
```

**Explanation**
There are two consecutive 1’s and three consecutive 1’s in the array out of which maximum is 3.

```java
public class MaximumConsecutiveOnes {

	public static void main(String[] args) {
		int arr[]= {1, 1, 0,0, 1, 1, 1,0,4,3,5,1,1,1,1};
		int ans = findMaxConsecutiveOnes(arr);
		System.out.println("The maximum  consecutive 1's are "+ maxOnes(arr));
		System.out.println("The maximum  consecutive 1's are " + ans);

	}

	 static int findMaxConsecutiveOnes(int nums[]) {
	        int cnt = 0;
	        int maxi = 0;
	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] == 1) {
	                cnt++;
	            } else {
	                cnt = 0;
	            }

	            maxi = Math.max(maxi, cnt);
	        }
	        return maxi;
	    }
	private static int maxOnes(int[] arr) {

		int finalVal = 0;

		int i=0;
		int j=0;

		while(i<arr.length)
		{
			int count=0;

			if(arr[i]==1)
			{
				j=i;

				while(j<arr.length)
				{
					if(arr[j]==1)
					{
						count++;
						j++;
					}
					else if(arr[j]==0)
					{
						i=j;
						break;
					}
				}
			}
			if(finalVal<count)
			{
				finalVal=count;
			}
			i++;
		}

		return finalVal;
	}

}

```

Output

```java
the maximum  consecutive 1 are 4
the maximum  consecutive 1 are 4

```
