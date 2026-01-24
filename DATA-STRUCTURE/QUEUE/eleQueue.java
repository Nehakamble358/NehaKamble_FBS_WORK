package queue;
import java.util.Scanner;

public class eleQueue {

    int[] queue;
    int front, rear, size;

    // Constructor
    eleQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    // Enqueue operation
     public void enqueue(int ele) {
        if (rear == size - 1) {
            System.out.println("Queue is Full");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        queue[++rear] = ele;
        System.out.println(ele + " inserted into queue");
    }

    // Dequeue operation
     public void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println(queue[front] + " removed from queue");
        front++;
    }

    // Display operation
     public void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue Elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}
	


				
		
		

