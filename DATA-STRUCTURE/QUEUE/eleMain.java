package queue;
import java.util.Scanner;

public class eleMain
{

	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Queue Size: ");
	        int size = sc.nextInt();

	        eleQueue q = new eleQueue(size);
	        int choice;

	        do {
	            System.out.println("\n---- QUEUE MENU ----");
	            System.out.println("1. Enqueue");
	            System.out.println("2. Dequeue");
	            System.out.println("3. Display");
	            System.out.println("4. Exit");
	            System.out.print("Enter choice: ");

	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter element: ");
	                    int ele = sc.nextInt();
	                    q.enqueue(ele);
	                    break;

	                case 2:
	                    q.dequeue();
	                    break;

	                case 3:
	                    q.display();
	                    break;

	                case 4:
	                    System.out.println("Program Ended");
	                    break;

	                default:
	                    System.out.println("Invalid Choice");
	            }

	        } while (choice != 4);

	        sc.close();
	    }
	}
