package stack;

public class Test {
	public static void main(String[] args) {
		Stack obj = new Stack(5);
		
		int choice =1;
		
		while(choice <= 4) {
			System.out.println("\n----STACK MENU----");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. peek");
			System.out.println("4. Exit");
			
			switch(choice) {
			case 1:
			 obj.push(10);
			 obj.push(20);
			 obj.push(30);
			 break;
			 
			case 2:
				System.out.println("Popped:"+ obj.pop());
				break;
			
			case 3:
				System.out.println("Top element :"+ obj.peek());
				break;
				
			
			case 4:
				System.out.println("Exit....");
				return;
				
		}
		choice++;
	}

}
}




