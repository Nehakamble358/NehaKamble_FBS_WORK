package stack;

import java.util.Scanner;

public class StringMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter stack size:");
		int n = sc.nextInt();
		sc.nextLine();

		StringStack s = new StringStack(n);

		int choice = 0;

		while (choice != 5) {
			System.out.println("\n----STACK MENU----");
			System.out.println("1. Push String");
			System.out.println("2. Pop String");
			System.out.println("3. peek String");
			System.out.println("4. Display String");
			System.out.println("5. Exit");
			System.out.println("Enter choice :");

			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Enter String:");
				String str = sc.nextLine();
				s.push(str);
				break;

			case 2:
				s.pop();
				break;

			case 3:
				s.peek();
				break;

			case 4:
				s.display();
				break;

			case 5:
				System.out.println("program exited ");
				break;

			default:
				System.out.println("Invalid choice");

			}
		}
		sc.close();
	}

}
