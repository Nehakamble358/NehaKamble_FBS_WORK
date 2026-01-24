package tree;

public class Node<T> {
	T data;
	Node<T> left, right;

	Node(T data) {
		this.data = data;
		left = right = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T date) {
		this.data = data;
	}

	public Node<T> getLeft() {
		return left;
	}

	public void setLeft(Node<T> left) {
		this.left = left;
	}

	public Node<T> getRight() {
		return right;
	}

	public void setRight(Node<T> right) {
		this.right = right;
	}

}
