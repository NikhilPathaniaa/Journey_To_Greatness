## Find first non-repeating character of given string

Given a string s of lowercase English letters, the task is to find the first non-repeating character. If there is no such character, return ‘$’.

Examples:

```java
Input: s = “geeksforgeeks”
Output: ‘f’
Explanation: ‘f’ is the first character in the string which does not repeat.


Input: s = “racecar”
Output: ‘e’
Explanation: ‘e’ is the only character in the string which does not repeat.


Input: “aabbccc”
Output: ‘$’
Explanation: All the characters in the given string are repeating.
```

### nested for loop Brute Force Approach (O(N²))

```java
public class UniqueCharacter {

	public static void main(String[] args) {
		String s = "geeksforgeeks";
		char c = '$';
		for(int i=0;i<s.length();i++)
		{
			boolean flag = true;
			for(int j=0;j<s.length();j++)
			{
				if(i!=j && s.charAt(i)==s.charAt(j))
				{
					flag = false;
					break;
				}
			}
			if(flag)
			{
				c=s.charAt(i);
				break;
			}
		}
		System.out.println(c);
	}
}
```

Output

```java
f
```

### Using Frequency Array O(N) (Efficient)

```java
public class UniqueCharacter {

	public static void main(String[] args) {
		String s = "geeksforgeeks";
		char c = '$';
		for(int i=0;i<s.length();i++)
		{
			boolean flag = true;
			for(int j=0;j<s.length();j++)
			{
				if(i!=j && s.charAt(i)==s.charAt(j))
				{
					flag = false;
					break;
				}
			}
			if(flag)
			{
				c=s.charAt(i);
				break;
			}
		}
		System.out.println(c);
	}
}
```

Output

```java
f
```
