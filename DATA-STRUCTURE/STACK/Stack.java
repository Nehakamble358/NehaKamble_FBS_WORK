package stack;

public class Stack {
	int[] arr;
	int top;

	Stack(int size) {
		arr = new int[size];
		top = -1;
	}

	boolean isFull() {
		if (top == arr.length - 1)
			return true;
		else
			return false;
	}

	boolean ifEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}

	void push(int ele) {
		
		boolean result = false;
		if (result == false) {
			top++;
			arr[top] = ele;
		} else
			System.out.println("Stack OverFlow");
	}

	int pop() {

		if (ifEmpty() == false) {
			int ele = arr[top];
			top--;
			return ele;
		} else
			System.out.println("Stack UnderFlow");
		return -1;

	}

	int peek() {
		if (ifEmpty() == false)
			return arr[top];
		else
			return -1;
	}
}
