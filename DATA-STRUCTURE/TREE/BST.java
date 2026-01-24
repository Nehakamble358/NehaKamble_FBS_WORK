package tree;

public class BST<T extends Comparable<T>> {

    Node<T> root;

    BST() {
        root = null;
    }

    public void insert(T data) {
        root = insert(root, data);
    }

    Node<T> insert(Node<T> temp, T data) {

        // if tree is empty
        if (temp == null) {
            return new Node<>(data);
        }

        // left side
        if (data.compareTo(temp.getData()) < 0) {
            temp.setLeft(insert(temp.getLeft(), data));
        }
        // right side
        else {
            temp.setRight(insert(temp.getRight(), data));
        }

        return temp;
    }
    // delete Node
    void deleteNode(T data) {
        root = delete(data, root);
    }

    Node<T> delete(T data, Node<T> temp) {

        if (temp == null)
            return null;

        if (data.compareTo(temp.getData()) < 0) {
            temp.setLeft(delete(data, temp.getLeft()));
            return temp;
        }

        else if (data.compareTo(temp.getData()) > 0) {
            temp.setRight(delete(data, temp.getRight()));
            return temp;
        }

        else {
            // no child
            if (temp.getLeft() == null && temp.getRight() == null)
                return null;

            // one child
            if (temp.getLeft() == null)
                return temp.getRight();

            if (temp.getRight() == null)
                return temp.getLeft();

            // two children
            Node<T> x = temp.getRight();
            while (x.getLeft() != null) {
                x = x.getLeft();
            }

            temp.setData(x.getData());
            temp.setRight(delete(x.getData(), temp.getRight()));
        }

        return temp;
    }
}


