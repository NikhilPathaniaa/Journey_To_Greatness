## Reverse a String

Examples:

```java
Input: s = “GeeksforGeeks”
Output: “skeeGrofskeeG”

Explanation : The first character G moves to last position, the second character e moves to second-last and so on.
```

```java
class GfG {
    static String reverseString(String s) {
        String rev="";
        for (int i = s.length() - 1; i >= 0; i--) {
            res.append(s.charAt(i));
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "abdcfe";
        String res = reverseString(s);
        System.out.print(res);
    }
}

```

Output:

```java
efcdba
```
