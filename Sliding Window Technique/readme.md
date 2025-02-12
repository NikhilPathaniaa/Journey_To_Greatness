# Sliding Window Technique

```java
Input
int arr[] = {8,3,-2,4,5,-1,0,5,3,9,-6};
		int k=5;

Values
18 9 6 13 12 16 11

Output
18
```

```java
public class Demo {

	public static void main(String[] args) {
		int arr[] = {8,3,-2,4,5,-1,0,5,3,9,-6};
		int k=5;

		System.out.println(checkGreatest(arr,k));
	}

	private static int checkGreatest(int[] arr, int k) {

		int finalVal = 0;
		int start = 0;
		int end = k;

		while(end<=arr.length)
		{
			int sum = 0;
			int i=start;
			while(i<end)
			{
				sum+=arr[i];
				i++;
			}
			start++;
			end++;
			System.out.print(sum+" ");

			if(sum>finalVal)
			{
				finalVal=sum;
			}
			sum=0;
		}


		return finalVal;
	}

}
```

Output

```java
18
```
