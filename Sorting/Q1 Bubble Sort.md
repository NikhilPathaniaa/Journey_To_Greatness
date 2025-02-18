## Bubble Sort

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
