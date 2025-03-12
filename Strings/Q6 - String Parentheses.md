## String Parentheses

```java
import java.util.Stack;

public class Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "({[]})";

		if(isValid(s))
			System.out.println(true);
		else
			System.out.println(false);
	}

	private static boolean isValid(String s) {
		  Stack<Character> stack = new Stack<>();

	        for (char c : s.toCharArray()) {
	            // If it's an opening bracket, push it to stack
	            if (c == '(' || c == '{' || c == '[') {
	                stack.push(c);
	            }
	            // If it's a closing bracket, check if it matches the last opened one
	            else {
	                if (stack.isEmpty()) return false; // Closing without opening

	                char top = stack.pop(); // Get the last opened bracket
	                if ((c == ')' && top != '(') ||
	                    (c == '}' && top != '{') ||
	                    (c == ']' && top != '[')) {
	                    return false; // Mismatched closing bracket
	                }
	            }
	        }

	        // Stack should be empty if all brackets are correctly closed
	        return stack.isEmpty();
	}

}
```
