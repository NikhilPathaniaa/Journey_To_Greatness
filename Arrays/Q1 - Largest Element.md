Find the Largest element in the array.

```java
public class LargestElement {

    public static void main(String[] args) {
    	int arr[] = {1,3,2,5,2};
    	int largest = 0;

    	for(int i=0;i<arr.length;i++)
    	{
    		if(arr[i]>largest)
    			largest = arr[i];
    	}
    	System.out.println(largest);

    }

}
```
