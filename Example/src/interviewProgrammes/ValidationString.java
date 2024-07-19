package interviewProgrammes;

import java.util.Stack;

//Given a string s containing just the charaters '(',')','{','}','['and']',
//input "()[]{}"
//out put true
//input "(]"
//out put false

public class ValidationString{
	public static void main(String[] args) {
		String s = "(){}[]";
		boolean b = validtion(s);

		System.err.println(s + " " + b);
	}

	public static boolean validtion(String s) {
		Stack<Character> stack = new Stack<>();
		for (char ch : s.toCharArray()) {
			if (ch == '(') {
				stack.push(')');
			} else if (ch == '[') {
				stack.push(']');
			} else if (ch == '{') {
				stack.push('}');
			} else if (stack.isEmpty() || stack.pop() != ch) {
				return false;
			}
		}
		return stack.isEmpty();

	}
}
