package stack;

public class StringStack {
	
	int top =-1;
	int size;
	String stack[];
	
	StringStack(int size){
		this.size = size;
		stack =new String[size];
	}
	void push(String value) {
		if(top ==size -1) {
			System.out.println("Stack OverFlow");
		}else {
			top++;
			stack[top]=value;
			System.out.println("String pushed successfully");
		}
	}
	void pop() {
		if(top == -1) {
		System.out.println("Stack UnderFolw");
		}else {
			System.out.println("Popped String :"+stack[top]);
			top--;
		}
	}
	void peek() {
		if(top == -1) {
			System.out.println("Stack is empty");
		}else {
			System.out.println("Top element (peek):"+stack[top]);
					String str = stack[top];
	
		}
	}
	
	void display() {
		if(top == -1) {
			System.out.println("Stack is empty");
		}else {
			System.out.println("Satck elements");
			for(int i = top; i>=0; i--) {
				System.out.println(stack[i]);
			
		}
	}
  }
}