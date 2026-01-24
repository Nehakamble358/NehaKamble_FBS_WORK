package LinkedList;

import java.util.Scanner;

public class LinkedList_Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList2 list = new LinkedList2();

        int choice;

        do {
            System.out.println("\n--- Linked List Menu ---");
            System.out.println("1. Insert");
            System.out.println("2. Insert at Position");
            System.out.println("3. Delete at Position");
            System.out.println("4. Display");
            System.out.println("5. Bubble Sort");
            System.out.println("6. Display Prime Numbers");
            System.out.println("7. Reverse (Recursive)");
            System.out.println("0. Exit");
            
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter element: ");
                    int ele = sc.nextInt();
                    list.insert(ele);
                    break;

                case 2:
                    System.out.print("Enter element: ");
                    int ele2 = sc.nextInt();
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    list.insertpos(ele2, pos);
                    break;

                case 3:
                    System.out.print("Enter position to delete: ");
                    int delPos = sc.nextInt();
                    list.deletepos(delPos);
                    break;

                case 4:
                    list.display();
                    break;

                case 5:
                    list.bubbleSort();
                    System.out.println("List sorted successfully");
                    break;

                case 6:
                    list.displayPrime();
                    break;
                    
                case 7:
                    list.reverse();   
                    System.out.println("LinkedList Reversed");
                    break;

                case 0:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 0);

        sc.close();
    }
}

