## Palindrome String

Given a string s, the task is to check if it is palindrome or not.

Example:

```java
Input: s = “abba”
Output: 1
Explanation: s is a palindrome


Input: s = “abc”
Output: 0
Explanation: s is not a palindrome

```

```java
public class Palindrome {

	public static void main(String[] args) {
		String s="abba";
		System.out.println(palindrome(s));
	}
// Function to check if a string is a palindrome
	private static int palindrome(String s) {
		int start = 0;
		int end = s.length()-1;
		while(start<end)
		{
            // If the characters at the current positions are not equal
			if(s.charAt(start)!=s.charAt(end))
			{
				return 0;
			}

            // Move the left pointer to the right and
            // the right pointer to the left
			start++;
			end--;
		}
         // If no mismatch is found, return 1 (palindrome)
		return 1;
	}
}
```

Output:

```java
1
```
