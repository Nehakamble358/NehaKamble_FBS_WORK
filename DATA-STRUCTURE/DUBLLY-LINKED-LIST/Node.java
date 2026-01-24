package DoublyLink_list;

public class Node {
    int data;
    Node next;
    Node prw;

    public Node(int data) {
        this.data = data;  
        next = null;
        prw = null;
    }

    int getData() {
        return data;
    }

    Node getNext() {
        return next;
    }

    void setNext(Node next) {
        this.next = next;
    }

    Node getPrw() {
        return prw;
    }

    void setPrw(Node prw) {
        this.prw = prw;
    }
}