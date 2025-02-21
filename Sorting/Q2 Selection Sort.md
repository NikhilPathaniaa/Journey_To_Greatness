## Selection Sort Algorithm

```java
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,5,1,9};

		for(int i=0;i<arr.length;i++)
		{
			int small=1;
			for(int j=i;j<arr.length;j++)
			{
				if(arr[j]<small)
				{
					small=arr[j];
				}
			}
			int temp=arr[i];
			arr[i]=arr[small];
			arr[small]=temp;
		}

		System.out.println(Arrays.toString(arr));
	}

}

```

Output

```java
[1, 2, 3, 5, 9]
```
