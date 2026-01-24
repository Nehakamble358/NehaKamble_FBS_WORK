package stack;

import java.util.Stack;

public class Postfix {

	static int eval(String p) {

		Stack<Integer> st = new Stack<>();

		for (char c : p.toCharArray()) {

			if (Character.isDigit(c))
				st.push(c - '0');
			else {
				int b = st.pop();
				int a = st.pop();

				if (c == '+')
					st.push(a + b);
				if (c == '-')
					st.push(a - b);
				if (c == '*')
					st.push(a * b);
				if (c == '/')
					st.push(a / b);
			}
		}
		return st.pop();
	}

	public static String convert(String infix) {
		// TODO Auto-generated method stub
		return null;
	}
}
class Main {
    public static void main(String[] args) {

        String infix = "(1+2)*(3+5)";
        String post = Postfix.convert(infix);

        System.out.println(post);
        System.out.println(Postfix.eval(post));
    }
}