package LinkedList;

public class Linklist {
	Node start;
	Node temp;
	int counter =0;

	Linklist() {
		start = null;
		counter ++;
	}

	boolean isEmpty() {
		if (start == null) {
			return true;
		}
		return false;
	}

	void insert(int ele) {

		if (isEmpty()) {
			start = new Node(ele);
			return;

		} 
			Node temp = start;
			while (temp.getNext() != null) {
				temp = temp.getNext();
		}
			Node temp1 = new Node(ele);
			temp.setNext(temp1);
		
	}

	void display() {
		if (!isEmpty()) {
			Node temp = start;
			while (temp != null) {
				System.out.println(temp.getData());
				temp = temp.getNext();
			}
		}
		else {
			System.out.println("LiskList is Empty");
		}
	}

	void insertpos(int ele, int pos) {
		Node temp1;
		if(pos <=0) {
			System.out.println("Invalid Position");
			return;
		}
		if(isEmpty()) {
			if(pos == 1) {
				start = new Node(ele);
			}else {
				System.out.println("Invalid Position");
			}
			return;
	
		} else if (pos == 1) {
			temp1 = new Node(ele);
			temp1.setNext(start);
			start = temp1;
			return;
		} 
			temp = start;
			int c = 1;

			while (temp.getNext() != null && c < pos - 1) {
				temp = temp.getNext();
				c++;

				temp1 = new Node(ele);
				temp1.setNext(temp.getNext());
				temp.setNext(temp1);
			}

		}
	
	
	void deletepos(int pos){
		if(isEmpty()) {
			
		}else if(pos < 1 && pos > counter) { 
			System.out.println("LinkList is Empty");
	
		}else if (pos == 1) {
			start = start.getNext();
		}else {
			 temp = start;
			 int c =1;
			 
			 while(temp.getNext()!=null && c < pos-1) {
				 ((Node) temp.temp).getNext();
				 c++;
			 } 
			 if(temp.getNext()== null) {
				 System.out.println("Invalid Position");
			 }else {
				 temp.setNext(temp.getNext().getNext());
			 
			 }
		}
		
	}

}
