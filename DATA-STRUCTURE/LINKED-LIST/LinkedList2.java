package LinkedList;

public class LinkedList2 {

	Node start;
	int counter = 0;

	public LinkedList2() {
		start = null;
	}

	boolean isEmpty() {
		return start == null;
	}

	public void insert(int ele) {
		Node newNode = new Node(ele);

		if (isEmpty()) {
			start = newNode;

		} else {

			Node temp = start;
			while (temp.getNext() != null)
				temp = temp.getNext();

			temp.setNext(newNode);
		}
		counter++;
	}

	public void insertpos(int ele, int pos) {
		if (pos < 1 || pos > counter + 1) {
			System.out.println("Invalid Position");
			return;
		}

		Node newNode = new Node(ele);

		if (pos == 1) {
			newNode.setNext(start);
			start = newNode;
		} else {
			Node temp = start;
			for (int i = 1; i < pos - 1; i++) {
				temp = temp.getNext();
			}
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
		}
		counter++;
	}

	public void deletepos(int pos) {
		if (isEmpty()) {
			System.out.println("LinkedList is Empty");
			return;
		}

		if (pos < 1 || pos > counter) {
			System.out.println("Invalid Position");
			return;
		}

		if (pos == 1) {
			start = start.getNext();
		} else {
			Node temp = start;
			for (int i = 1; i < pos - 1; i++) {
				temp = temp.getNext();
			}
			temp.setNext(temp.getNext().getNext());
		}
		counter--;
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("LinkedList is Empty");
			return;
		}

		Node temp = start;
		while (temp != null) {
			System.out.print(temp.getData() + " -> ");
			temp = temp.getNext();
		}
		System.out.println("NULL");
		System.out.println("Total Nodes = " + counter);
	}

	public void bubbleSort() {
		if (isEmpty() || start.getNext() == null)
			return;

		for (int i = 0; i < counter - 1; i++) {
			Node curr = start;
			while (curr.getNext() != null) {
				if (curr.getData() > curr.getNext().getData()) {
					int t = curr.getData();
					curr.setData(curr.getNext().getData());
					curr.getNext().setData(t);
				}
				curr = curr.getNext();
			}
		}
	}

	boolean isPrime(int num) {
		if (num <= 1)
			return false;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public void displayPrime() {
		if (isEmpty()) {
			System.out.println("LinkedList is Empty");
			return;
		}

		Node temp = start;
		System.out.print("Prime Numbers: ");
		while (temp != null) {
			if (isPrime(temp.getData())) {
				System.out.print(temp.getData() + " ");
			}
			temp = temp.getNext();
		}
		System.out.println();
	}

	public void reverse() {
		start = reverseRecursive(start);
	}

	Node reverseRecursive(Node current) {

		if (current == null || current.getNext() == null) {
			return current;
		}

		Node newHead = reverseRecursive(current.getNext());

		current.getNext().setNext(current);
		current.setNext(null);

		return newHead;
	}

}
