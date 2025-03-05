## Check if Strings Are Rotations of Each Other

Given two string **s1** and **s2** of same length, the task is to check whether **s2** is a rotation of **s1**.

**Examples**

```java
Input: s1 = “abcd”, s2 = “cdab”
Output: true
Explanation: After 2 right rotations, s1 will become equal to s2.


Input: s1 = “aab”, s2 = “aba”
Output: true
Explanation: After 1 left rotation, s1 will become equal to s2.


Input: s1 = “abcd”, s2 = “acbd”
Output: false
Explanation: Strings are not rotations of each other.
```

Worst Case

```java
public class Rotation {

	    // Function to check if s1 and s2 are rotations of each other
	    static boolean areRotations(String s1, String s2) {
	        int n = s1.length();

	        // Generate and check all possible rotations of s1
	        for (int i = 0; i < n; ++i) {
	            // If current rotation is equal to s2, return true
	            if (s1.equals(s2)) {
	                return true;
	            }

	            // Right rotate s1
	            char last = s1.charAt(s1.length() - 1);
	            s1 = last + s1.substring(0, s1.length() - 1);
	        }
	        return false;
	    }

	    public static void main(String[] args) {
	        String s1 = "aab";
	        String s2 = "aba";

	        System.out.println(areRotations(s1, s2));
	    }
	}

```

Built-in Method

```java
class Rotation {

    // Function to check if s1 and s2 are rotations of each other
    static boolean areRotations(String s1, String s2) {
        s1 = s1 + s1;

        // find s2 in concatenated string
        return s1.contains(s2);
    }

    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "aba";

        System.out.println(areRotations(s1, s2));
    }
}

```
