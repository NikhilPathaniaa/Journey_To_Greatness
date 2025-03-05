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
        String s = "......i.like.this..program..very.much......";

        // Replace multiple dots with a single dot
        s = s.replaceAll("\\.+", ".");

        // Remove leading or trailing dot if present
        if (s.startsWith(".")) {
            s = s.substring(1);
        }
        if (s.endsWith(".")) {
            s = s.substring(0, s.length() - 1);
        }

        // Split the string by "."
        String arr[] = s.split("\\.");

        // Reverse the words
        String s1 = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!s1.isEmpty()) { // Add dot only between words
                s1 += ".";
            }
            s1 += arr[i];
        }

        System.out.println(s1); // Correct output
    }
}
```

Output

```
i.like.this..program..very.much
```
