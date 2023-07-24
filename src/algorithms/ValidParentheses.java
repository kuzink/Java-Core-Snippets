package algorithms;

import java.util.*;

public class ValidParentheses {

	//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

	//An input string is valid if:
	//1 Open brackets must be closed by the same type of brackets.
	//2 Open brackets must be closed in the correct order.
	//3 Every close bracket has a corresponding open bracket of the same type.
	//
	//Example 1:
	//Input: s = "()"
	//Output: true
	//
	//Example 2:
	//Input: s = "()[]{}"
	//Output: true
	//
	//Example 3:
	//Input: s = "(]"
	//Output: false

	public static void main(String[] args) {
		ValidParentheses task = new ValidParentheses();

		String string = "([])";
		System.out.println(task.resolve(string));
	}

	private boolean resolve(String string) {
		Stack<Character> stack = new Stack<>();

		for (char c : string.toCharArray()) {
			if (c == '(') {
				stack.push(')');
			}
			else if (c == '{') {
				stack.push('}');
			}
			else if (c == '[') {
				stack.push(']');
			}
			else if (stack.isEmpty() || stack.pop() != c) {
				return false;
			}
		}

		return stack.isEmpty();
	}
}
