package DoublyLink_list;

public class DoublyLinkedList {

	Node start, last;
	int count;

	public DoublyLinkedList() {
		start = null;
		last = null;
		count = 0;
	}

	boolean isEmpty() {
		return start == null;
	}

	public void insertAtStart(int ele) {
		Node temp = new Node(ele);

		if (isEmpty()) {
			start = last = temp;
		} else {
			temp.setNext(start);
			start.setPrw(temp);
			start = temp;
		}
		count++;
	}

	public void insertAtEnd(int ele) {
		Node temp = new Node(ele);

		if (isEmpty()) {
			start = last = temp;
		} else {
			temp.setPrw(last);
			last.setNext(temp);
			last = temp;
		}
		count++;
	}

	public void insertAtPosition(int ele, int pos) {
		if (pos == 1) {
			insertAtStart(ele);
			return;
		}

		Node temp = start;
		for (int i = 1; i < pos - 1 && temp != null; i++) {
			temp = temp.getNext();
		}

		if (temp == null || temp.getNext() == null) {
			insertAtEnd(ele);
			return;
		}

		Node newNode = new Node(ele);
		newNode.setNext(temp.getNext());
		newNode.setPrw(temp);
		temp.getNext().setPrw(newNode);
		temp.setNext(newNode);

		count++;
	}

	public void deleteAtStart() {
		if (isEmpty()) {
			System.out.println("List is Empty");
			return;
		}

		if (start == last) {
			start = last = null;
		} else {
			start = start.getNext();
			start.setPrw(null);
		}
		count--;
	}

	public void deleteAtEnd() {
		if (isEmpty()) {
			System.out.println("List is Empty");
			return;
		}

		if (start == last) {
			start = last = null;
		} else {
			last = last.getPrw();
			last.setNext(null);
		}
		count--;
	}

	public void deleteAtPosition(int pos) {
		if (isEmpty()) {
			System.out.println("List is Empty");
			return;
		}

		if (pos == 1) {
			deleteAtStart();
			return;
		}

		Node temp = start;
		for (int i = 1; i < pos && temp != null; i++) {
			temp = temp.getNext();
		}

		if (temp == null) {
			System.out.println("Invalid Position");
			return;
		}

		if (temp == last) {
			deleteAtEnd();
			return;
		}

		temp.getPrw().setNext(temp.getNext());
		temp.getNext().setPrw(temp.getPrw());
		count--;
	}

	public void display() {
		Node temp = start;
		if (isEmpty()) {
			System.out.println("List is Empty");
			return;
		}

		while (temp != null) {
			System.out.print(temp.getData() + "-> ");
			temp = temp.getNext();
		}
		System.out.println("NULL1");
		System.out.println("Total Nodes = " + count);
	}

	public void displayReverse() {
		Node temp = last;
		if (isEmpty()) {
			System.out.println("List is Empty");
			return;
		}

		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getPrw();
		}
		System.out.println();
	}

	public void countNodes() {
		System.out.println("Total Nodes = " + count);
	}

}
