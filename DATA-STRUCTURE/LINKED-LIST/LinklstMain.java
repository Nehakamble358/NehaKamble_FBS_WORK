package LinkedList;

import java.util.Scanner;

public class LinklstMain {
	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        Linklist list = new Linklist();
	        int ch;

	        do {
	            System.out.println("\n--- MENU ---");
	            System.out.println("1 Insert");
	            System.out.println("2 Insert at Position");
	            System.out.println("3 Delete at Position");
	            System.out.println("4 Display");
	            System.out.println("0 Exit");
	            System.out.print("Enter choice: ");
	            ch = sc.nextInt();

	            switch (ch) {
	                case 1:
	                    System.out.print("Enter element: ");
	                    list.insert(sc.nextInt());
	                    break;

	                case 2:
	                    System.out.print("Enter element: ");
	                    int ele = sc.nextInt();
	                    System.out.print("Enter position: ");
	                    int pos = sc.nextInt();
	                    list.insertpos(ele, pos);
	                    break;

	                case 3:
	                    System.out.print("Enter position: ");
	                    list.deletepos(sc.nextInt());
	                    break;

	                case 4:
	                    list.display();
	                    break;

	                case 0:
	                    System.out.println("Exit");
	                    break;

	                default:
	                    System.out.println("Invalid Choice");
	            }
	        } while (ch != 0);

	        sc.close();
	    }
	}


