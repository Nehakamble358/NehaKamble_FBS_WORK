package stack;

import java.util.Stack;

public class InfixToPostfix {

	static int pr(char c) {
		if (c == '+' || c == '-')
			return 1;
		if (c == '*' || c == '/')
			return 2;
		return 0;
	}

	static String convert(String s) {

		Stack<Character> st = new Stack<>();
		String p = "";

		for (char c : s.toCharArray()) {

			if (Character.isDigit(c))
				p += c;

			else if (c == '(')
				st.push(c);

			else if (c == ')') {
				while (st.peek() != '(')
					p += st.pop();
				st.pop();
			}

			else {
				while (!st.isEmpty() && pr(st.peek()) >= pr(c))
					p += st.pop();
				st.push(c);
			}
		}

		while (!st.isEmpty())
			p += st.pop();

		return p;
	}
}
