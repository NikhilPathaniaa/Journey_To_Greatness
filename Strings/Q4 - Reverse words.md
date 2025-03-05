## Reverse words in a string

Given a string str, your task is to reverse the order of the words in the given string. Note that str may contain leading or trailing dots(.) or multiple trailing dots(.) between two words. The returned string should only have a single dot(.) separating the words.

Examples

```java
Input: str = “i.like.this.program.very.much”
Output: str = “much.very.program.this.like.i”
Explanation:The words in the input string are reversed while maintaining the dots as separators, resulting in "much.very.program.this.like.i".

Input: str = ”..geeks..for.geeks.”
Output: str = “geeks.for.geeks”
```

```java
public class ReverseWord {

	public static void main(String[] args) {
		String s= "i.like.this..program..very.much.";
		s=s.replaceAll("\\.+", ".");
		String arr[]=s.split("\\.");
		String s1="";
		for(int i=arr.length-1;i>=0;i--)
		{
			if (!s1.isEmpty()) { // Add dot only between words
                s1 += ".";
            }
			s1+=arr[i];
		}
       System.out.println(s1);
	}

}
```

Output

```
i.like.this..program..very.much.
```
