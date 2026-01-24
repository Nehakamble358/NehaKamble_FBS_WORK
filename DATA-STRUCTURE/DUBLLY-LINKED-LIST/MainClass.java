package DoublyLink_list;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();
        Scanner sc = new Scanner(System.in);
        int ch, ele, pos;

        do {
            System.out.println("\n--- DOUBLY LINKED LIST MENU ---");
            System.out.println("1. Insert at Start");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Position");
            System.out.println("4. Delete at Start");
            System.out.println("5. Delete at End");
            System.out.println("6. Delete at Position");
            System.out.println("7. Display");
            System.out.println("8. Display Reverse");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter element: ");
                    ele = sc.nextInt();
                    dll.insertAtStart(ele);
                    break;

                case 2:
                    System.out.print("Enter element: ");
                    ele = sc.nextInt();
                    dll.insertAtEnd(ele);
                    break;

                case 3:
                    System.out.print("Enter element: ");
                    ele = sc.nextInt();
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();
                    dll.insertAtPosition(ele, pos);
                    break;

                case 4:
                    dll.deleteAtStart();
                    break;

                case 5:
                    dll.deleteAtEnd();
                    break;

                case 6:
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();
                    dll.deleteAtPosition(pos);
                    break;

                case 7:
                    dll.display();
                    break;

                case 8:
                    dll.displayReverse();
                    break;

                case 9:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        } while (ch != 9);

        sc.close();
    }
}
