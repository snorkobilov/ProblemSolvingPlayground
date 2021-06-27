package data_structures;

public class DepthFirstSearch {
    Node<Integer> root;

    void printPreOrder() {
        preOrder(root);
    }

    void preOrder(Node<Integer> root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void main(String[] args) {
        var tree = new DepthFirstSearch();
        tree.root = new Node<>(2);
        tree.root.right = new Node<>(3);
        tree.root.left = new Node<>(4);
        tree.root.left.left = new Node<>(5);
        tree.root.left.right = new Node<>(6);
        tree.root.right.right = new Node<>(7);
        tree.root.right.left = new Node<>(8);

        tree.printPreOrder();
    }
}
