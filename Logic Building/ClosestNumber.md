## Find the number closest to n and divisible by m

Given two integers n and m (m != 0). Find the number closest to n and divisible by m. If there is more than one such number, then output the one having maximum absolute value.

*** Examples: ***

```java
Input: n = 13, m = 4
Output: 12
Explanation: 12 is the closest to 13, divisible by 4.

Input: n = -15, m = 6
Output: -18
Explanation: Both -12 and -18 are closest to -15, but-18 has the maximum absolute value.
```

### BAsic Naive Aproch
```java
package numbers;

public class ClosestNumber {

	public static void main(String[] args) {
		int n = -15, m = 6;
		int i=n,j=n;
		boolean flag = false;
		boolean both = false;
		while(true)
		{
			if(i%m==0)
				flag = true;
			if(j%m==0)
				both = true;
			
			if(flag && both)
			{
				if(i<j)
				{
					System.out.println(i);
				break;
				}
				else
				{	System.out.println(j);
				break;
				}
				
			}
			else if(flag)
			{
				System.out.println(i);
				break;
			}
			else if(both)
			{
				System.out.println(j);
				break;
			}
			i++;
			j--;
		}
		
	}

}

```

### Expert apporach
```java

```